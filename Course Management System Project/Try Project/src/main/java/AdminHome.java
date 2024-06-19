

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//HttpSession session = request.getSession(false); // Get the current session, don't create if it doesn't exist

        //if (session != null && "admin".equals(session.getAttribute("type"))) {
            // User is an admin, forward to admin home page
          //  request.getRequestDispatcher("adminHome.jsp").forward(request, response);
        //} else {
            // User is not an admin, redirect to login page
          //  response.sendRedirect("login.html");
        //}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session = request.getSession(false);
		String role = (String) session.getAttribute("type");
		
		  if (session != null && "admin".equals(role)) {
	            // User is an admin, forward to admin home page
	            response.sendRedirect("./AdminHome.html"); 
	        } else {
	            // User is not an admin, redirect to login page
	            response.sendRedirect("./login.html");
	        }
	}

}
