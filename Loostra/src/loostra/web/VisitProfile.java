package loostra.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitProfile/*")
public class VisitProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		String[] pathStrings = pathInfo.split("/");
		if (pathStrings.length > 1) {
			response.sendRedirect("VisitProfile/" + pathStrings[0]);
		}
		System.out.println(request.getPathInfo());
		request.getRequestDispatcher("/VisitProfile.jsp").forward(request, response);
	}

}
