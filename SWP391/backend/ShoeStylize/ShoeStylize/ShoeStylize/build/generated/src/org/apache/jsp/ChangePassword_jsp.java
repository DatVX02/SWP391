package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.DBUtils;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"icon\"\n");
      out.write("              href=\"image\\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"ChangePassword.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png\"\n");
      out.write("                 alt=\"Shoes stylize\"></img>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            String userID = "";
            Cookie[] cookie = request.getCookies();
            if (cookie != null) {
                userID = cookie[cookie.length - 1].getName();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"information_left\">\n");
      out.write("            <div>\n");
      out.write("                <ul class=\"information_left_1\">\n");
      out.write("                    <img src=\"image\\user.png\"\n");
      out.write("                         style=\"width: 15px; transform: translateY(02px);\">\n");
      out.write("                    <a href=\"information0.jsp\">Account information </a>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"information_left_2\">\n");
      out.write("                    <img src=\"image\\padlock.png\"\n");
      out.write("                         style=\"width: 15px; transform: translateY(02px);\">\n");
      out.write("                    <a href=\"ChangePassword.jsp\">Change password</a>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"information_left_3\">\n");
      out.write("                    <img src=\"image\\checklist.png\"\n");
      out.write("                         style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                    <a href=\"sccountManagement.jsp\">\n");
      out.write("                        Order management\n");
      out.write("                    </a>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"information_left_4\">\n");
      out.write("                    <img src=\"image\\support.png\"\n");
      out.write("                         style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                    <a href=\"support.jsp\">\n");
      out.write("                        Support\n");
      out.write("                    </a>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"information_left_5\">\n");
      out.write("                    <img src=\"image\\feedback.png\"\n");
      out.write("                         style=\"width: 15px; transform: translateY(02px);\" />\n");
      out.write("                    <a href=\"feedback.jsp\">Suggestions </a>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"information_left_6\">\n");
      out.write("                    <img src=\"image\\logout.png\"\n");
      out.write("                         style=\"width: 15px;\" />\n");
      out.write("                    <a href=\"homepage_guest.jsp\">Log out </a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            ");

                Connection con = null;
                PreparedStatement stm = null;
                ResultSet rs = null;
                int id = Integer.valueOf(userID);

                try {
                    con = DBUtils.makeConnection();
                    if (con != null) {
                        String sql = "SELECT [Password] FROM Users WHERE UserID = ?";
                        stm = con.prepareStatement(sql);
                        stm.setInt(1, id);
                        rs = stm.executeQuery();

                        if (rs.next()) { // Check if there are results
                            String password = rs.getString("Password");
                            session.setAttribute("Password", password);
                        }
                    }
                } catch (SQLException e) {
                    // Handle the SQLException, or at least log it
                    e.printStackTrace();
                    throw e; // Re-throw the exception if needed
                } finally {
                    // Close resources in reverse order of acquisition, and check for null
                    if (rs != null) {
                        rs.close();
                    }
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                }
            
      out.write("\n");
      out.write("            <div class=\"information_right\">\n");
      out.write("                <h2>Change Password</h2>\n");
      out.write("                <form action=\"MainController\">\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"txtOldPasswordConfirm\" value=\"");
      out.print( session.getAttribute("Password"));
      out.write("\" >\n");
      out.write("                    <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( userID);
      out.write("\" >\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h4>Old password</h4>\n");
      out.write("                        <input type=\"password\" name=\"txtOldPassword\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h4>New password</h4>\n");
      out.write("                        <input type=\"password\" name=\"txtPassword\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h4>Confirm password</h4>\n");
      out.write("                        <input type=\"password\" name=\"txtConfirm\" required>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <button name=\"btAction\" value=\"Change Password\" style=\"border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;\">Change</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
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
