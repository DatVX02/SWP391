package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.math.BigDecimal;
import Order.OrderDTO;
import java.util.List;
import Registration.RegistrationDAO;

public final class orderDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Order Detail</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\OrderDetail.css\">\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("              href=\"image\\shoelogo.png\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <a href=\"homepage.jsp\"><img src=\"image\\shoelogo.png\"\r\n");
      out.write("                                        alt=\"shoes\"></img></a>\r\n");
      out.write("            <div class=\"header_info\">\r\n");
      out.write("                <a href=\"information.jsp\"><img\r\n");
      out.write("                        src=\"image\\user (1).png\"\r\n");
      out.write("                        alt=\"profile\">Profile</a>\r\n");
      out.write("                <a href=\"orderDetail.jsp\"><img\r\n");
      out.write("                        src=\"image\\heart.png\"\r\n");
      out.write("                        alt=\"Orders\">Orders</a>\r\n");
      out.write("                <a href=\"myCart.jsp\"><img\r\n");
      out.write("                        src=\"image\\shopping-cart.png\"\r\n");
      out.write("                        alt=\"shopping-cart\">My cart</a>\r\n");
      out.write("                <a href=\"blog.jsp\"><img\r\n");
      out.write("                        src=\"image\\blog (2).png \"\r\n");
      out.write("                        alt=\"shopping-cart\">News</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("        <h1 style=\"margin-left: 100px; margin-top: 30px; margin-bottom: 15px; font-size: 30px;\">Order Detail</h1>\r\n");
      out.write("        ");

            RegistrationDAO dao = new RegistrationDAO();
            dao.showOrderDetail();
            List<OrderDTO> result = dao.getListOrders();
            if (result != null) {
        
      out.write("\r\n");
      out.write("        ");

            double totalAmount = 0;
            for (OrderDTO dto : result) {
                totalAmount += dto.getPrice();
        
      out.write("\r\n");
      out.write("        <form action=\"*\" method=\"post\">\r\n");
      out.write("            <div class=\"product\">\r\n");
      out.write("                <div class=\"column left\">\r\n");
      out.write("                    <img src=\"*\" alt=\"Product\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"column middle\">\r\n");
      out.write("                    <h2>");
      out.print( dto.getName());
      out.write("</h2>\r\n");
      out.write("                    <p>Price:&nbsp&nbsp&nbsp");
      out.print( dto.getPrice());
      out.write("</p>\r\n");
      out.write("                    <span>Quantity:&nbsp&nbsp <input type=\"number\" value=\"");
      out.print( dto.getQuantity());
      out.write("\" name=\"\" id=\"\" min=\"0\"\r\n");
      out.write("                            max=\"999999\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"column right\">\r\n");
      out.write("                    <input type=\"button\" value=\"Detail\"/>\r\n");
      out.write("                    <a href=\"feedback.jsp\"> \r\n");
      out.write("                        <input type=\"button\" value=\"Feedback\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("            <h3>Total amount:");
      out.print( totalAmount);
      out.write("</h3></br>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");

        } else {
        
      out.write("\r\n");
      out.write("        <h2>No Order available.</h2>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("        <div style=\"float:right\">\r\n");
      out.write("            <img src=\"image\\facebook.png\"\r\n");
      out.write("                alt=\"Facebook\" />\r\n");
      out.write("            <img src=\"image\\twitter.png\"\r\n");
      out.write("                alt=\"twitter\" />\r\n");
      out.write("            <img src=\"image\\linkedin.png\"\r\n");
      out.write("                alt=\"linkedin\" />\r\n");
      out.write("            <img src=\"image\\instagram (1).png\"\r\n");
      out.write("                alt=\"Instagram\" />\r\n");
      out.write("            <img src=\"image\\youtube (5).png\"\r\n");
      out.write("                alt=\"youtube\" />\r\n");
      out.write("        </div>\r\n");
      out.write("            <div style=\" float:right\">\r\n");
      out.write("            <table class=\"center\">\r\n");
      out.write("                <tr class=\"tableHeader\">\r\n");
      out.write("                    <td>About Us</td>\r\n");
      out.write("                    <td>For Users</td>\r\n");
      out.write("                    <td>Information</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>About Us</td>\r\n");
      out.write("                    <td>Login</td>\r\n");
      out.write("                    <td>Help Center</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Find Store</td>\r\n");
      out.write("                    <td>Register</td>\r\n");
      out.write("                    <td>Money Refund</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Categories</td>\r\n");
      out.write("                    <td>Settings</td>\r\n");
      out.write("                    <td>Shipping</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Blogs</td>\r\n");
      out.write("                    <td>My Orders</td>\r\n");
      out.write("                    <td>Contact us</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear: both\" class=\"commerce\">\r\n");
      out.write("            @2023 Ecommerce\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
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
