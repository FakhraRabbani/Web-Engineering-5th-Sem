<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Removal</title>
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
		 <form name="removeCourse" action="removeCourse" method="post">
		<label for="courseiD">Enter course id you want to remove: </label>
		<input type="number" placeholder="id" name="courseiD" class="inputC" required>
		
		<br><br>
		
		<input type="submit" id="inputS" value="Remove Course">
		
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