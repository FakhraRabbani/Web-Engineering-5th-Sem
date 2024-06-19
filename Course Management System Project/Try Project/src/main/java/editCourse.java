

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editCourse
 */
@WebServlet("/editCourse")
public class editCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    String name = request.getParameter("courseName");	
		String description = request.getParameter("description"); 
		String instructor = request.getParameter("instructor");
		String creditHrsStr = request.getParameter("creditHrs");
		
		float creditHrs = 0.0f;
		try {
		    creditHrs = Float.parseFloat(creditHrsStr);
		} catch (NumberFormatException e) {
		    out.println("<p>Error: Invalid credit hours format.</p>");
		    out.println("<a href='addCourse.jsp'>Go back</a>");
		    return;
		}
	    
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Edit Status</title>");
	    out.println("<link rel=\'stylesheet\' type=\'text/css\' href=\'styles.css\'>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<form>");
	    out.println("<div class='container'>");
	    
	    //JDBC
	    try {
	    	
	    	//Driver Load
			Class.forName("com.mysql.jdbc.Driver"); //MySql Driver

			String url = "jdbc:mysql://localhost/Course_Suite";
			
			//Create connection
			Connection con = DriverManager.getConnection(url, "root", "root");

			//Statement Object
			//Statement st = con.createStatement();

			//String query="Select * from users_info where email = ? AND username = ? AND password = ? ";
			//SELECT * FROM users_info WHERE email = ? AND username = ? AND password = ?
			//String query = "DELETE FROM course_info WHERE  name = ?";
			String query = "UPDATE course_info SET description = ?, instructor = ?, creditHrs = ? WHERE name = ?";
			//Prepared Statement Object
			PreparedStatement pt = con.prepareStatement(query);
			 pt.setString(1, name);
			 pt.setString(2, description);
			 pt.setString(3, instructor);
			 pt.setFloat(4, creditHrs);
			 
            //System.out.println(query);
			int result = pt.executeUpdate();
            
            if(result > 0){
                    
        	    	out.println("<br>");
        	    	out.println("<p>Course Name: " + name + " </p>");
		         	out.println("<p>Course Description: " + description + " </p>");
		         	out.println("<p>Course Instructor: " + instructor + " </p>");
		         	out.println("<p>Course Credit Hours: " + creditHrs + " </p>");
        	    	out.println("<br>");
        	    	out.println("<a href='editCourse.jsp'> Edit Another Course</a>");

            	    //String name = rs.getString("name");
            	    //String userName = rs.getString("name");

        	  }
             
             else{
            	 out.println("<h2>Couldnt edit Course! Maybe its invalid!  </h2>");
            	 out.println("<br>");

            	 out.println("<a href='editCourse.jsp'> Try editing another Course</a>");
                  }
            
            pt.close();
            con.close();
            
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
    	    out.println("</html>");
            
	    }catch(Exception e) {
	    	System.out.println(e.toString());
	    	String msg = e.toString();
	    	out.println("<p>" + msg + "</p>");
	    	out.println("<h2>Failed to edit course!</h2>");
	    }
		
	}

}
