
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 * Servlet implementation class addCourse
 */
@WebServlet("/addCourse")
public class addCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html"); 
		PrintWriter outP = response.getWriter();  //JSP implicitly provides out object

		int courseId = Integer.parseInt(request.getParameter("courseId"));
		String name = request.getParameter("courseName");	
		String description = request.getParameter("description"); 
		String instructor = request.getParameter("instructor");
		String creditHrsStr = request.getParameter("creditHrs");

		if (name == null || description == null || instructor == null || creditHrsStr == null) {
		    //outP.println("<p>Error: One or more form fields are missing.</p>");
		    //outP.println("<a href='addCourse.jsp'>Go back</a>");
		    return;
		}

		float creditHrs = 0.0f;
		try {
		    creditHrs = Float.parseFloat(creditHrsStr);
		} catch (NumberFormatException e) {
		    outP.println("<p>Error: Invalid credit hours format.</p>");
		    outP.println("<a href='addCourse.jsp'>Go back</a>");
		    return;
		}

		 outP.println("<html>");
		 outP.println("<head>");
		 outP.println("<title>Course added successfully</title>");
		 outP.println("<link rel=\'stylesheet\' type=\'text/css\' href=\'styles.css\'>");
		 outP.println("</head>");
		 outP.println("<body>");
		 outP.println("<form>");
		 outP.println("<div class='container'>");
		 
		//JDBC
		 try {
		 	
		 	//Driver Load
				Class.forName("com.mysql.jdbc.Driver"); //MySql Driver

				String url = "jdbc:mysql://localhost/Course_Suite";
				
				//Create connection
				Connection con = DriverManager.getConnection(url, "root", "root");

				//Statement Object
				//Statement st = con.createStatement();
				PreparedStatement ps = con.prepareStatement("SELECT * FROM course_info WHERE courseId = ?");
				ps.setInt(1, courseId);
				ResultSet r = ps.executeQuery();
				
				if(r.next()) {
					outP.println("<h2 style='text-align: center'>Course already exists!</h2>");
					outP.println("<a href=\'editCourse.jsp\'>Do you want to edit course </a>");
				}else {
					

				String query = "INSERT INTO course_info (courseId, name, description, instructor, creditHrs) VALUES (?, ?, ?, ?, ?)";
					
				//Prepared Statement Object
				PreparedStatement pt = con.prepareStatement(query);
				
				 pt.setInt(1, courseId);
				 pt.setString(2, name);
		         pt.setString(3, description);
		         pt.setString(4, instructor);
		         pt.setFloat(5, creditHrs);
		         
		         //System.out.println(query);

		         int rs = pt.executeUpdate();
		         
		         if(rs > 0){
		         	//System.out.println("Insertion successful in DB"); 
		        	outP.println("<p>Course Id: " + courseId + " </p>");
		         	outP.println("<p>Course Name: " + name + " </p>");
		         	outP.println("<p>Course Description: " + description + " </p>");
		         	outP.println("<p>Course Instructor: " + instructor + " </p>");
		         	outP.println("<p>Course Credit Hours: " + creditHrs + " </p>");
		         	outP.println("<p>Course added successfully </p>");
		         	outP.println("<br>");
		         	outP.println("<a href='addCourse.jsp'> Add another Course </a>");
		         	
		     	    
		         }
		     	else{	
		     		//System.out.println("Record of user could not be inserted in DB"); 
		     		outP.println("<h2>Sorry</h2>");
		     	    outP.println("<br><h2>Couldnt Add Course</h2>");
		     	   	outP.println("<br>");
		     	    outP.println("<a href='addCourse.jsp'> Add Course </a>");
		  
		     	}
		         
		         pt.close();
		         con.close();
		         
		         outP.println("</div>");
		         outP.println("</form>");
		         outP.println("</body>");
		 	     outP.println("</html>");
				}
		     }catch(Exception e) {
		 	//System.out.println(e.toString());
		 	String msg = e.toString();
		 	outP.println("<p>" + msg + "</p>");
		 	outP.println("<h2>Failed to add Course</h2>");
		 }
	}

}
