package loostra.web;

import java.io.IOException;

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
		String firstName = (String) req.getAttribute("firstName");
		String middleInitial = (String) req.getAttribute("middleI");
		String lastName = (String) req.getAttribute("lastName");
		int birthMonth = (Integer) req.getAttribute("month");
		int birthDay = (Integer) req.getAttribute("day");
		int birthYear = (Integer) req.getAttribute("year");
		String userName = (String) req.getAttribute("userName");
		String email = (String) req.getAttribute("email");
		String password = (String) req.getAttribute("password");
		
		User user = new User();
		user.setBirthDay(birthDay);
		user.setBirthMonth(birthMonth);
		user.setBirthYear(birthYear);
		user.setEmail(email);
		user.setUserDisplayName(userName);
		user.setPassword(password);
		user.setName(firstName, middleInitial, lastName);
		req.getRequestDispatcher("HomeFeed.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("CreateProfile.jsp").forward(req, resp);
	}
	
}