package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import loostra.entities.Give;
import loostra.entities.User;
import loostra.entities.Want;

public final class MyProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      response.setHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
User user = (User) application.getAttribute("LoginUser"); 
      out.write("\r\n");
      out.write("\t<a href=\"./EditProfile\">Edit Profile</a><br>\r\n");
      out.write("\t<a href=\"./AddGive\">Add Give</a><br>\r\n");
      out.write("\t<a href=\"./AddWant\">Add Want</a><br>\r\n");
      out.write("\tgives - \r\n");
      out.write("\t");
if(user != null){
		if(user.getGives() != null || !user.getGives().isEmpty()){
	for(Give g : user.getGives()){
      out.write("\r\n");
      out.write("\t\t<b>");
      out.print( g.getName() );
      out.write("<br></b>\r\n");
      out.write("\t\t<i>");
      out.print( g.getDesc() );
      out.write("<br></i>\r\n");
      out.write("\t");
}
	} 
	else{
      out.write("\r\n");
      out.write("\tnone entered yet\r\n");
      out.write("\t");
} 
	}
	else{
      out.write("\r\n");
      out.write("\tno user logged in\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\twants - \r\n");
      out.write("\t");
if(user != null){
		if(user.getWants() != null || !user.getWants().isEmpty()){
	for(Want w : user.getWants()){
      out.write("\r\n");
      out.write("\t\t<b>");
      out.print( w.getName() );
      out.write("<br></b>\r\n");
      out.write("\t\t<i>");
      out.print( w.getDesc() );
      out.write("<br></i>\r\n");
      out.write("\t");
}
	} 
	else{
      out.write("\r\n");
      out.write("\tnone entered yet\r\n");
      out.write("\t");
} 
	}
	else{
      out.write("\r\n");
      out.write("\tno user logged in\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t<br><!-- link up with facebook\r\n");
      out.write("\t<iframe src=\"http://www.facebook.com/plugins/like.php?href=YOUR_URL\"\r\n");
      out.write("        scrolling=\"no\" frameborder=\"0\"\r\n");
      out.write("        style=\"border:none; width:450px; height:80px\"></iframe>\r\n");
      out.write("        -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
