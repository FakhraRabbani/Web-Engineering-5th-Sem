<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*, java.sql.*, java.sql.DriverManager"%>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Addition</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<div class="container">
	<% HttpSession sess = request.getSession(false); %>
	<% String role = (String) sess.getAttribute("type"); %>
	<% if("admin".equals(role)) { %>
	<h1>Welcome To course Suite</h1>
	<!-- 
	<form name="addCourse" action="//" method="post">
	 -->
		 <form name="addCourse" action="addCourse" method="post">
		 
		 <label for="courseId">Course ID: </label>
		<input type="number" placeholder="courseId" name="courseId" class="inputC" required>
		
		<br><br>
		
		<label for="courseName">Course Name: </label>
		<input type="text" placeholder="Name" name="courseName" class="inputC" required>
		
		<br><br>
		
		<label for="description">Description:</label>
		<textarea name="description" style="width: 100%; height: 150px; padding: 10px; border: 1px solid #ccc; border-radius: 4px; font-family: Arial, sans-serif; font-size: 14px; resize: vertical;"></textarea>
		
		<br><br>
		
        <label for="instructor">Instructor:</label>
        <input type="text" placeholder="Name" name="instructor" class="inputC" required>
        
        <br><br>
        
        <label for="creditHrs">Credit Hours:</label>
        <select name="creditHrs" class="inputC" required>
            <option value="0.0">0.0</option>
            <option value="0.5">0.5</option>
            <option value="1.0">1.0</option>
            <option value="1.5">1.5</option>
            <option value="2.0">2.0</option>
            <option value="2.5">2.5</option>
            <option value="3.0">3.0</option>
            <option value="3.5">3.5</option>
            <option value="4.0">4.0</option>
            <option value="4.5">4.5</option>
            <option value="5.0">5.0</option>
        </select>
		
		<input type="submit" id="inputS" value="Add Course">
		
		<br>
		<a href="Home.html"> Home </a>
        
	</form>
	
	<% 
        } else { 
            response.sendRedirect("login.html"); 
        } 
       %>
	
  	</div>
  	
  	
  	   
</body>
</html>

  
<!--  

response.setContentType("text/html"); 
PrintWriter outP = response.getWriter();  //JSP implicitly provides out object


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

		String query = "INSERT INTO course_info (name, description, instructor, creditHrs) VALUES (?, ?, ?, ?)";
			
		//Prepared Statement Object
		PreparedStatement pt = con.prepareStatement(query);
			
		 pt.setString(1, name);
         pt.setString(2, description);
         pt.setString(3, instructor);
         pt.setFloat(4, creditHrs);
         
         //System.out.println(query);

         int rs = pt.executeUpdate();
         
         if(rs > 0){
         	//System.out.println("Insertion successful in DB"); 
         	outP.println("<p>Course Name: " + name + " </p>");
         	outP.println("<p>Course Description: " + description + " </p>");
         	outP.println("<p>Course Instructor: " + instructor + " </p>");
         	outP.println("<p>Course Credit Hours: " + creditHrs + " </p>");
         	outP.println("<br>");
         	
     	    
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
         
         out.println("</div>");
         out.println("</form>");
         out.println("</body>");
 	     out.println("</html>");
     }catch(Exception e) {
 	//System.out.println(e.toString());
 	String msg = e.toString();
 	outP.println("<p>" + msg + "</p>");
 	outP.println("<h2>Failed to add Course</h2>");
 }

-->