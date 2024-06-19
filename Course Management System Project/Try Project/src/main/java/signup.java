
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.DriverManager;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
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

	    String email = request.getParameter("email");
	    String name = request.getParameter("user_name");
	    String password = request.getParameter("pwd");
        String confirmPassword = request.getParameter("c_pwd");
        String type = request.getParameter("typeUser");
        //String userType = request.getParameter("type");
        
        out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Signed up  successfully</title>");
	    out.println("<link rel=\'stylesheet\' type=\'text/css\' href=\'styles.css\'>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<form>");
	    out.println("<div class='container'>");

        if (!password.equals(confirmPassword)) {
            out.println("<h3 style='color:red'>Passwords do not match. Please try again.  </h3>");
            out.println("<a href='signup.html' style='color:red, text-decoration: none';>Sign Up</a>");
        } else {    
	    //JDBC
	    try {
	    	
	    	//Driver Load
			Class.forName("com.mysql.jdbc.Driver"); //MySql Driver

			String url = "jdbc:mysql://localhost/Course_Suite";
			
			//Create connection
			Connection con = DriverManager.getConnection(url, "root", "root");

			//Statement Object
			//Statement st = con.createStatement();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM users_info WHERE email = ?");
			ps.setString(1, email);
			ResultSet r = ps.executeQuery();
			
			if(r.next()) {
				out.println("<h2 style='text-align: center'>Email already exists!</h2>");
			}else {
				//String query = "INSERT INTO users_info (email, name, password) VALUES (?, ?, ?)";
				String query = "INSERT INTO users_info (email, name, password, type) VALUES (?, ?, ?, ?)";
				
				//Prepared Statement Object
				PreparedStatement pt = con.prepareStatement(query);
				
				pt.setString(1, email);
	            pt.setString(2, name);
	            pt.setString(3, password);
	            pt.setString(4, type);
	            
	            //System.out.println(query);

	            int rs = pt.executeUpdate();
	            
	            if(rs > 0){
	            	//System.out.println("Insertion successful in DB"); 
	            	out.println("<p>Welcome " + name + "! </p>");
	            	out.println("<br>");
	        	    out.println("<p>  Welcome to Course Suite. </p>");
	        	    out.println("</br>");
	        	    out.println("<p> Thanks for Signing Up</p>");
	        	    out.println("<a href='login.html'> Login </a>");
	        	    
	            }
	        	else{	
	        		//System.out.println("Record of user could not be inserted in DB"); 
	        		out.println("<h2>Sorry</h2>");
	        	    out.println("<br><h2>Couldnt Sign Up</h2>");
	        	    out.println("<a href='signup.html'> Sign Up </a>");
	     
	        	}
	            
	            pt.close();
	            con.close();
	            
	            out.println("</div>");
	            out.println("</form>");
	            out.println("</body>");
	    	    out.println("</html>");
			}
			
            
	    }catch(Exception e) {
	    	System.out.println(e.toString());
	    	String msg = e.toString();
	    	out.println("<p>" + msg + "</p>");
	    	out.println("<h2>Sign up failed!</h2>");
	    }
		
	}
	}

}
