package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\register.css\">\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("    <link rel=\"icon\"\r\n");
      out.write("        href=\"image\\shoelogo.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <img src=\"image\\shoelogo.png\"\r\n");
      out.write("            alt=\"Shoes stylize\"></img>\r\n");
      out.write("    </div>\r\n");
      out.write("        <form action=\"MainController\">\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("        <h1>Sign up</h1>\r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("            <h3>Email</h3>\r\n");
      out.write("            <input type=\"email\" name=\"txtEmail\" value=\"\" required=\"@gmail.com\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("            <h3>Full Name</h3>\r\n");
      out.write("            <input type=\"text\" name=\"txtFullName\" value=\"\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("            <h3>Password</h3>\r\n");
      out.write("            <input type=\"password\" name=\"txtPassword\" value=\"\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("            <h3>Confirm password</h3>\r\n");
      out.write("            <input type=\"password\" name=\"txtConfirmPassword\" value=\"\" required style=\"width: 50%;\">\r\n");
      out.write("            <div style=\"margin-left: 350px; margin-top: -90px;\">\r\n");
      out.write("                <h3>Gender</h3>\r\n");
      out.write("                <input type=\"radio\" class=\"from1\" id=\"male\" name=\"gen\" value=\"Male\">Male\r\n");
      out.write("                <input type=\"radio\" class=\"from1\" id=\"female\" name=\"gen\" value=\"Female\">Female\r\n");
      out.write("                <input type=\"radio\" class=\"from1\" id=\"other\" name=\"gen\" value=\"Other\">Other\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form\" style=\"margin-top: 30px;\">\r\n");
      out.write("            <h3>Phone</h3>\r\n");
      out.write("            <input type=\"tel\" name=\"txtPhone\" required style=\"width: 50%;\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div style=\"margin-left: 350px; margin-top: -100px; \">\r\n");
      out.write("            <h3>Birthday</h3>\r\n");
      out.write("            <input type=\"date\" name=\"birthDate\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("            <input type=\"submit\"  name=\"btAction\" value=\"Register\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("            \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
