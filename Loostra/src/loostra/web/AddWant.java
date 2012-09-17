package loostra.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loostra.entities.User;

@WebServlet("/AddWant")
public class AddWant extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		User user = (User) req.getServletContext().getAttribute("LoginUser");
		user.addWant(req.getParameter("name"), req.getParameter("description"));
		req.getServletContext().setAttribute("LoginUser", user);
		resp.sendRedirect("MyProfile.jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("AddWant.jsp").forward(request, response);
	}

}
