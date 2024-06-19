<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Course</title>
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
	<form name="editCourse" action="editCourse" method="post">
		<label for="courseName">Enter course name you want to edit: </label>
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
		
		<input type="submit" id="inputS" value="Edit Course">
		
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