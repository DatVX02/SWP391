package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Registration.RegistrationDAO;
import java.sql.SQLException;
import Database.DBUtils;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class information0_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Account information</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"image\\shoelogo.png\">\r\n");
      out.write("        <link href=\"Profile/Account information.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!--Bootstrap CSS-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!--font awesome cdn link-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <a href=\"homepage.jsp\"><img src=\"image/logo/logo.png\"\r\n");
      out.write("                                        alt=\"shoes\"></img></a>\r\n");
      out.write("            <div class=\"header_info\">\r\n");
      out.write("                <a href=\"#\"><img\r\n");
      out.write("                        src=\"image/logo/user (1).png\"\r\n");
      out.write("                        alt=\"profile\">Profile</a>\r\n");
      out.write("<!--                <a href=\"orderDetail.jsp\"><img\r\n");
      out.write("                        src=\"image/logo/heart.png\"\r\n");
      out.write("                        alt=\"Orders\">Orders</a>\r\n");
      out.write("                <a href=\"myCart.jsp\"><img\r\n");
      out.write("                        src=\"image/logo/shopping-cart.png\"\r\n");
      out.write("                        alt=\"shopping-cart\">My cart</a>-->\r\n");
      out.write("                <a href=\"blog.jsp\"><img\r\n");
      out.write("                        src=\"image/logo/blog (2).png \"\r\n");
      out.write("                        alt=\"shopping-cart\">News</a>\r\n");
      out.write("<!--                <a href=\"homepage_guest.jsp\"><img\r\n");
      out.write("                        src=\"image/logo/power (1).png \"\r\n");
      out.write("                        alt=\"shopping-cart\">Logout</a>-->   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- menu -->\r\n");
      out.write("        <div class=\"information_left\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul class=\"information_left_1\">\r\n");
      out.write("                    <img src=\"image/logo/user.png\" style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                    <a href=\"#\">Account information </a>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"information_left_1\">\r\n");
      out.write("                    <img src=\"image/logo/padlock.png\" style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                    <a href=\"#\">Change password</a>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("<!--                <ul class=\"information_left_2\">\r\n");
      out.write("                    <img src=\"image/logo/checklist.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                    <a href=\"accountManagement.jsp\">\r\n");
      out.write("                        Order management\r\n");
      out.write("                    </a>\r\n");
      out.write("                </ul>-->\r\n");
      out.write("\r\n");
      out.write("<!--                <ul class=\"information_left_3\">\r\n");
      out.write("                    <img src=\"image/logo/support.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                    <a href=\"support.jsp\">\r\n");
      out.write("                        Support\r\n");
      out.write("                    </a>\r\n");
      out.write("                </ul>-->\r\n");
      out.write("\r\n");
      out.write("<!--                <ul class=\"information_left_4\">\r\n");
      out.write("                    <img src=\"image/logo/feedback.png\" style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                    <a href=\"feedback.jsp\">Suggestions </a>\r\n");
      out.write("                </ul>-->\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"information_left_5\">\r\n");
      out.write("                    <img src=\"image/logo/logout.png\" style=\"width: 15px;\" />\r\n");
      out.write("                    <a href=\"homepage_guest.jsp\">Log out </a>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");

            RegistrationDAO dao = new RegistrationDAO();
            dao.getInfo(request);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"information_right\">\r\n");
      out.write("            <h2>Account information</h2>\r\n");
      out.write("            <form action=\"\" method=\"\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Full Name</h3>\r\n");
      out.write("                    <input type=\"text\" name=\"txtFullName\" value=\"");
      out.print( session.getAttribute("FullName"));
      out.write("\" style=\"width: 200px;\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Email</h3>\r\n");
      out.write("                    <input type=\"email\" name=\"txtEmail\" value=\"");
      out.print( session.getAttribute("Email"));
      out.write("\" readonly style=\"width: 200px;\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Phone</h3>\r\n");
      out.write("                    <input type=\"tel\" name=\"txtPhone\" value=\"");
      out.print( session.getAttribute("PhoneNumber"));
      out.write("\" readonly style=\"width: 200px;\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Birth Date</h3>\r\n");
      out.write("                    <input type=\"date\" name=\"birthDate\" style=\"width: 200px;\" value=\"");
      out.print( session.getAttribute("Birthdate"));
      out.write("\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h3>Gender</h3>\r\n");
      out.write("                    <input type=\"text\" name=\"gen\" value=\"");
      out.print( session.getAttribute("Gender"));
      out.write("\" style=\"width: 200px;\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( request.getAttribute("id"));
      out.write("\"> \r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <a href=\"information.jsp\"><button style=\"border-radius: 20px; background-color: #EBAA5D; margin-top: 20px; margin-bottom: 15px\">Update</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div style=\"float:right; transform: translateX(-20px)\" >\r\n");
      out.write("                <img src=\"image/logo/facebook.png\"\r\n");
      out.write("                     alt=\"Facebook\" />\r\n");
      out.write("                <img src=\"image/logo/twitter.png\"\r\n");
      out.write("                     alt=\"twitter\" />\r\n");
      out.write("                <img src=\"image/logo/linkedin.png\"\r\n");
      out.write("                     alt=\"linkedin\" />\r\n");
      out.write("                <img src=\"image/logo/instagram (1).png\"\r\n");
      out.write("                     alt=\"Instagram\" />\r\n");
      out.write("                <img src=\"image/logo/youtube (5).png\"\r\n");
      out.write("                     alt=\"youtube\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\" float:right\">\r\n");
      out.write("                <table class=\"center\">\r\n");
      out.write("                    <tr class=\"tableHeader\">\r\n");
      out.write("                        <td>About Us</td>\r\n");
      out.write("                        <td>For Users</td>\r\n");
      out.write("                        <td>Information</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>About Us</td>\r\n");
      out.write("                        <td>Login</td>\r\n");
      out.write("                        <td>Help Center</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Find Store</td>\r\n");
      out.write("                        <td>Register</td>\r\n");
      out.write("                        <td>Money Refund</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Categories</td>\r\n");
      out.write("                        <td>Settings</td>\r\n");
      out.write("                        <td>Shipping</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Blogs</td>\r\n");
      out.write("                        <td>My Orders</td>\r\n");
      out.write("                        <td>Contact us</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear: both\" class=\"commerce\">\r\n");
      out.write("                @2023 Ecommerce\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
