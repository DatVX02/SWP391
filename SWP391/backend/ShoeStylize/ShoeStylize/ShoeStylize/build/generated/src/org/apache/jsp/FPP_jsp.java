package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.DBUtils;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class FPP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("              href=\"image\\shoelogo.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/FPP.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <img src=\"image\\shoelogo.png\"\r\n");
      out.write("                 alt=\"Shoes stylize\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"MainController\">\r\n");
      out.write("            <div class=\"input\">\r\n");
      out.write("                <h1>Reset Password</h1>\r\n");
      out.write("                <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( request.getAttribute("id") );
      out.write("\" >\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>New password</h3>\r\n");
      out.write("                    <input type=\"password\" name=\"txtPassword\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Confirm password</h3>\r\n");
      out.write("                    <input type=\"password\" name=\"txtConfirm\" required>\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- popup -->\r\n");
      out.write("                <button name=\"btAction\" value=\"Reset Password\" style=\"border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;\">\r\n");
      out.write("                    <a class=\"dialog-btn\" href=\"#my-dialog\" style=\"text-decoration: none;\">Reset button</a>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"dialog overlay\" id=\"my-dialog\">\r\n");
      out.write("<!--                        <a href=\"#\" class=\"overlay-close\"></a>-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"dialog-body\">\r\n");
      out.write("                            <img\r\n");
      out.write("                                src=\"image\\yes.png\">\r\n");
      out.write("                            <a class=\"dialog-close-btn\" href=\"#\">&times;</a>\r\n");
      out.write("                            <h3>Reset Password Successful</h3>\r\n");
      out.write("                            <a href=\"login.jsp\"><p style=\"color: #EBAA5D; font-style: italic;\">Return to Login</p></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </button>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"login.jsp\" style=\"text-decoration: none;\">\r\n");
      out.write("            <p style=\"font-style: italic; color: hsla(0, 21%, 65%, 0.774) ;\">Back to login</p>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
