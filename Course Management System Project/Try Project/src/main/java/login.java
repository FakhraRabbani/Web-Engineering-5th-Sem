
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		
		/*
		  HttpSession session = request.getSession();
		    String type = (String) session.getAttribute("type");
		    if (type == null) {
		        response.sendRedirect("./login.html");
		    } else if ("user".equals(type)) {
		        response.sendRedirect("./SimpleHome.jsp");
		    } else if ("admin".equals(type)) {
		        response.sendRedirect("./AdminHome.jsp");
		    }
		    */
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String email = request.getParameter("email");
	    String name = request.getParameter("user_name");
	    String password = request.getParameter("pwd");
	    
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Login Status</title>");
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
			String query = "SELECT * FROM users_info WHERE email = ? AND name = ? AND password = ?";
			
			//Prepared Statement Object
			PreparedStatement pt = con.prepareStatement(query);
			
			pt.setString(1, email);
            pt.setString(2, name);
            pt.setString(3, password);
           // pt.setString(4, type);
            
            System.out.println(query);

            ResultSet rs = pt.executeQuery();
            
            if(rs.next()){
            		String userType = rs.getString("type");
                    
            		HttpSession session = request.getSession(true);
            		
            		 //String userType = rs.getString("type"); // Get the user type from the result set

                    // HttpSession session = request.getSession();
                     
                     //String userType = (String) session.getAttribute("type"); 
            		
            		/*session.setAttribute("type", userType);
            		
                     if (session == null || session.getAttribute("type") == null) {
                         response.sendRedirect("./login.html");
                         return;
                     }*/
                     
                     session.setAttribute("type", userType);
                    //session.setAttribute("type", userType);
                    
        	    	out.println("<p>Welcome " + name + "</p>");
        	    	out.println("<br>");
        	    	out.println("<p>Welcome to Course Suite </p>");
        	    	out.println("<br>");
        	    	out.println("<p>Login Successful</p>");
        	    	out.println("<br>");

            	    //String name = rs.getString("name");
            	    //String userName = rs.getString("name");

            	    out.println("<p>User Name: "+name+" </p>");
            	    
            	   
            	    
            	 // Redirect based on user type
            	    if (userType == null) {  
            	        response.sendRedirect("./login.html");  
            	    } 
            	    else if ("user".equals(userType)) {  
                        response.sendRedirect("./SimpleHome.jsp");  
                    } else if ("admin".equals(userType)) {  
                        response.sendRedirect("./AdminHome.jsp"); 
                    }
        	  }
             
             else{
            	 out.println("<h2>Invalid email or password!!  </h2>");
            	 out.println("<br>");
            	 out.println("<h2> Login failed</h2>");
            	 out.println("<a href='login.html'> Login Again</a>");
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
	    	out.println("<h2>Log in failed!</h2>");
	    }
		
	}

}
