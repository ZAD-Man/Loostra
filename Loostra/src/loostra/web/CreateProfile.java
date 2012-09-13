package loostra.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loostra.entities.User;

@WebServlet("/CreateProfile")
public class CreateProfile extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName =  req.getParameter("firstName");
		String middleInitial =  req.getParameter("middleI");
		String lastName =  req.getParameter("lastName");
		int birthMonth = Integer.parseInt(req.getParameter("month"));
		int birthDay = Integer.parseInt(req.getParameter("day"));
		int birthYear = Integer.parseInt(req.getParameter("year"));
		String userName =  req.getParameter("userName");
		String email = req.getParameter("email");
		String password =  req.getParameter("password");
		
		User user = new User();
		user.setBirthDay(birthDay);
		user.setBirthMonth(birthMonth);
		user.setBirthYear(birthYear);
		user.setEmail(email);
		user.setUserDisplayName(userName);
		user.setPassword(password);
		user.setName(firstName, middleInitial, lastName);
		req.getServletContext().setAttribute("CreatedUser", user);
		resp.sendRedirect("HomeFeed.jsp");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("CreateProfile.jsp").forward(req, resp);
	}
	
}