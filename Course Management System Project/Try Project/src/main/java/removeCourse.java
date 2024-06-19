
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 * Servlet implementation class removeCourse
 */
@WebServlet("/removeCourse")
public class removeCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeCourse() {
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

	    String courseId = request.getParameter("courseId");
	    
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Removal Status</title>");
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
			String query = "DELETE FROM course_info WHERE  courseId = ?";
			
			//Prepared Statement Object
			PreparedStatement pt = con.prepareStatement(query);
			 pt.setString(1, courseId);
			 
            //System.out.println(query);
			int result = pt.executeUpdate();
            
            if(result > 0){
                    
        	    	out.println("<br>");
        	    	out.println("<p>Course: " + courseId + " successfully removed! </p>");
        	    	out.println("<br>");
        	    	out.println("<a href='removeCourse.jsp'> Remove Another Course</a>");

            	    //String name = rs.getString("name");
            	    //String userName = rs.getString("name");

        	  }
             
             else{
            	 out.println("<h2>Invalid Course!  </h2>");
            	 out.println("<br>");

            	 out.println("<a href='removeCourse.jsp'> Remove Another Course</a>");
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
	    	out.println("<h2>Failed to remove course!</h2>");
	    }
		
	}

}
