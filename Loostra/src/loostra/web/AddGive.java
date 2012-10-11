package loostra.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loostra.entities.Give;
import loostra.entities.User;

@WebServlet("/AddSkill")
public class AddGive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = (User) req.getServletContext().getAttribute("LoginUser");
		user.addGive(req.getParameter("name"), req.getParameter("description"));
		List<Give> gives = user.getGives();
		req.getServletContext().setAttribute("LoginUser", user);
		resp.sendRedirect("MyProfile.jsp");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("AddSkill.jsp").forward(request, response);
	}

}