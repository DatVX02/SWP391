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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"icon\"\n");
      out.write("              href=\"image\\shoelogo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/FPP.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"image\\shoelogo.png\"\n");
      out.write("                 alt=\"Shoes stylize\">\n");
      out.write("        </div>\n");
      out.write("        ");

            String userID = "";
            Cookie[] cookie = request.getCookies();
            if (cookie != null) {
                userID = cookie[cookie.length - 1].getName();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"MainController\">\n");
      out.write("            <div class=\"input\">\n");
      out.write("                <h1>Reset Password</h1>\n");
      out.write("                <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( userID);
      out.write("\" >\n");
      out.write("                <div>\n");
      out.write("                    <h3>New password</h3>\n");
      out.write("                    <input type=\"password\" name=\"txtPassword\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h3>Confirm password</h3>\n");
      out.write("                    <input type=\"password\" name=\"txtConfirm\" required>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <!-- popup -->\n");
      out.write("                <button name=\"btAction\" value=\"Reset Password\" style=\"border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;\">\n");
      out.write("                    <a class=\"dialog-btn\" href=\"#my-dialog\" style=\"text-decoration: none;\">Reset button</a>\n");
      out.write("\n");
      out.write("                    <div class=\"dialog overlay\" id=\"my-dialog\">\n");
      out.write("                        <a href=\"#\" class=\"overlay-close\"></a>\n");
      out.write("\n");
      out.write("                        <div class=\"dialog-body\">\n");
      out.write("                            <img\n");
      out.write("                                src=\"image\\yes.png\">\n");
      out.write("                            <a class=\"dialog-close-btn\" href=\"#\">&times;</a>\n");
      out.write("                            <h3>Reset Password Successful</h3>\n");
      out.write("                            <p style=\"color: #EBAA5D; font-style: italic;\"><a href=\"login.jsp\">Return to Login</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <a href=\"login.jsp\" style=\"text-decoration: none;\">\n");
      out.write("            <p style=\"font-style: italic; color: hsla(0, 21%, 65%, 0.774) ;\">Back to login</p>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
