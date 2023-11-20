package org.apache.jsp.Profile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel=\"icon\"\r\n");
      out.write("        href=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"ChangePassword.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png\"\r\n");
      out.write("            alt=\"shoes\">\r\n");
      out.write("        <div class=\"header_info\">\r\n");
      out.write("            <a href=\"../../admin/Profile/Account information.html\"><img\r\n");
      out.write("                    src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\user (1).png\"\r\n");
      out.write("                    alt=\"profile\">Profile</a>\r\n");
      out.write("            <a href=\"../../../Order/OrderDetail.html\"><img\r\n");
      out.write("                    src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\heart.png\"\r\n");
      out.write("                    alt=\"Orders\">Orders</a>\r\n");
      out.write("            <a href=\"../../../Cart/MyCart.html\"><img\r\n");
      out.write("                    src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\shopping-cart.png\"\r\n");
      out.write("                    alt=\"shopping-cart\">My cart</a>\r\n");
      out.write("            <a href=\"../Blog/Blog.html\"><img\r\n");
      out.write("                    src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\blog (2).png\"\r\n");
      out.write("                    alt=\"shopping-cart\">News</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"information_left\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <ul class=\"information_left_1\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\image\\logo\\user.png\"\r\n");
      out.write("                    style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                <a href=\"Account information.html\">Account information </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_2\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\padlock.png\"\r\n");
      out.write("                    style=\"width: 15px; transform: translateY(02px);\">\r\n");
      out.write("                <a href=\"ChangePassword.html\">Change password</a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_3\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\image\\logo\\checklist.png\"\r\n");
      out.write("                    style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"AccountManagement.html\">\r\n");
      out.write("                    Order management\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_4\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\image\\logo\\support.png\"\r\n");
      out.write("                    style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"./Support.html\">\r\n");
      out.write("                    Support\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_5\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\image\\logo\\feedback.png\"\r\n");
      out.write("                    style=\"width: 15px; transform: translateY(02px);\" />\r\n");
      out.write("                <a href=\"../Profile/Suggestions .html\">Suggestions</a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"information_left_6\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\image\\logo\\logout.png\"\r\n");
      out.write("                    style=\"width: 15px;\" />\r\n");
      out.write("                <a href=\"../HomePage/HomePage(no login)/HomePage.html\">Log out </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"information_right\">\r\n");
      out.write("            <h2>Change Password</h2>\r\n");
      out.write("            <form action=\"\" method=\"\">\r\n");
      out.write("\r\n");
      out.write("                <h4>Old password</h4>\r\n");
      out.write("                <input type=\"password\" required>\r\n");
      out.write("\r\n");
      out.write("                <h4>New password</h4>\r\n");
      out.write("                <input type=\"password\" required>\r\n");
      out.write("\r\n");
      out.write("                <h4>Confirm password</h4>\r\n");
      out.write("                <input type=\"password\" required>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button>Change</button>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div style=\"float:right\">\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\facebook.png\"\r\n");
      out.write("                    alt=\"Facebook\" />\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\twitter.png\"\r\n");
      out.write("                    alt=\"twitter\" />\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\linkedin.png\"\r\n");
      out.write("                    alt=\"linkedin\" />\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\instagram (1).png\"\r\n");
      out.write("                    alt=\"Instagram\" />\r\n");
      out.write("                <img src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\youtube (5).png\"\r\n");
      out.write("                    alt=\"youtube\" />\r\n");
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
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear: both\" class=\"commerce\">\r\n");
      out.write("                @2023 Ecommerce\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
