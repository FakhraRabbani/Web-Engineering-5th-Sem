<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Home</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

	<div class="container">
	<% String role = (String) session.getAttribute("type"); %>
	<% if ("user".equals(role)) { %>
		<h1>Welcome Client</h1>
		<form action="Logout" method="get">
        <input type="submit" value="Logout">
            <h3 align="center">Welcome to CourseSuite</h3>
                <a href="searchCourse.jsp"> Search Course </a>
                <br /><br />
                <a href="enrollCourse.jsp"> Enroll Course </a>
                <br /><br />
                <a href="dropCourse.jsp"> Drop Course </a>   
                <br /><br />
                <a href="./login.html"> Logout </a>
                <br /><br />
                <a href="Home.html"> Home </a>


    </form>
	<% } else { %>
		<%  response.sendRedirect("login.html");  %>
	<% } %>
	</div>
	
</body>
</html>