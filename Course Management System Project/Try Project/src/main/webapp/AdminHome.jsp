<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
        <div class="container">
        <% String role = (String) session.getAttribute("type"); %>
	<% if ("admin".equals(role)) { %>
		<h1>Welcome Admin</h1>
        <form action="Logout" method="get">
        <input type="submit" value="Logout">
   
            <h3 align="center">Welcome to CourseSuite Admin Panel</h3>
                <a href="addCourse.jsp"> Add Course </a>
                <br /><br />
                <a href="editCourse.jsp"> Edit Course </a>
                <br /><br />
                <a href="removeCourse.jsp"> Remove Course </a>   
                <br /><br />
                <a href="./login.html"> Logout </a>
                <br /><br />
                <a href="Home.html"> Home </a>
 		</form>
	<% } else { %>
		<%  response.sendRedirect("login.html");  %>
	<% } %>
  	</div>

        
  	<body>
  	
	
	
</body>
       
</body>
</html>