package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.DBUtils;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Registration.RegistrationDAO;
import Registration.RegistrationDTO;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Account Information</title>\r\n");
      out.write("    <link rel=\"icon\"\r\n");
      out.write("        href=\"image\\shoelogo.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\information.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <img src=\"image\\shoelogo.png\"\r\n");
      out.write("            alt=\"Shoes stylize\"></img>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
 
        String userID="";
        Cookie[] cookie = request.getCookies();
        if(cookie !=null){
            userID = cookie[cookie.length-1].getName();
        }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- menu -->\r\n");
      out.write("    <div class=\"information_left\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <ul class=\"information_left_1\">\r\n");
      out.write("                <img src=\"image\\user.png\" style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                <a href=\"information0.jsp\">Account information </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_1\">\r\n");
      out.write("                <img src=\"image\\padlock.png\" style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                <a href=\"ChangePassword.jsp\">Change password</a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_2\">\r\n");
      out.write("                <img src=\"image\\checklist.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"accountManagement.jsp\">\r\n");
      out.write("                    Order management\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_3\">\r\n");
      out.write("                <img src=\"image\\support.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"support.jsp\">\r\n");
      out.write("                    Support\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_4\">\r\n");
      out.write("                <img src=\"image\\feedback.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"feedback.jsp\">Suggestions </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_5\">\r\n");
      out.write("                <img src=\"image\\logout.png\" style=\"width: 15px;\" />\r\n");
      out.write("                <a href=\"login.jsp\">Log out </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

                    Connection con = null;
                    PreparedStatement stm = null;
                    ResultSet rs = null;
                    int id = Integer.valueOf(userID);

                    try {
                        con = DBUtils.makeConnection();
                        if (con != null) {
                            String sql = "SELECT FullName, Email, PhoneNumber, Birthdate, Gender FROM Users WHERE UserID = ?";
                            stm = con.prepareStatement(sql);
                            stm.setInt(1, id);
                            rs = stm.executeQuery();

                            if (rs.next()) { // Check if there are results
                                String name = rs.getString("FullName");
                                String email = rs.getString("Email");
                                String phone = rs.getString("PhoneNumber");
                                String date = rs.getString("Birthdate");
                                String gender = rs.getString("Gender");
                                session.setAttribute("FullName", name);
                                session.setAttribute("Email", email);
                                session.setAttribute("PhoneNumber", phone);
                                session.setAttribute("Birthdate", date);
                                session.setAttribute("Gender", gender);
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
                
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"information_right\">\r\n");
      out.write("            <h2>Account Information</h2>\r\n");
      out.write("            <form action=\"MainController\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Full Name</h3>\r\n");
      out.write("                    <input type=\"text\" name=\"txtFullName\" value=\"");
      out.print( session.getAttribute("FullName"));
      out.write("\" style=\"width: 200px;\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Email</h3>\r\n");
      out.write("                    <input type=\"email\" name=\"txtEmail\" value=\"");
      out.print( session.getAttribute("Email"));
      out.write("\" required style=\"width: 200px;\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Phone</h3>\r\n");
      out.write("                    <input type=\"tel\" name=\"txtPhone\" value=\"");
      out.print( session.getAttribute("PhoneNumber"));
      out.write("\" required style=\"width: 200px;\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Birth Date</h3>\r\n");
      out.write("                    <input type=\"date\" name=\"birthDate\" style=\"width: 200px;\" value=\"");
      out.print( session.getAttribute("Birthdate"));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Gender</h3>\r\n");
      out.write("                    <input type=\"radio\" class=\"from1\" id=\"male\" name=\"gen\" value=\"Male\" ");
 if ("Male".equals(session.getAttribute("Gender"))) { 
      out.write(" checked ");
 } 
      out.write(">Male\r\n");
      out.write("                    <input type=\"radio\" class=\"from1\" id=\"female\" name=\"gen\" value=\"Female\" ");
 if ("Female".equals(session.getAttribute("Gender"))) { 
      out.write(" checked ");
 } 
      out.write(">Female\r\n");
      out.write("                    <input type=\"radio\" class=\"from1\" id=\"other\" name=\"gen\" value=\"Other\" ");
 if ("Other".equals(session.getAttribute("Gender"))) { 
      out.write(" checked ");
 }
      out.write(">Other\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div>\r\n");
      out.write("                    <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( userID);
      out.write("\"> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <button name=\"btAction\" value=\"Update\" style=\"border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;\">Submit </button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
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
