package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeDes_005fwomen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Upload File</title>\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("              href=\"image\\shoelogo.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\homeDes_women.css\">\r\n");
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
      out.write("    <body>\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <img src=\"image\\shoelogo.png\"\r\n");
      out.write("                 alt=\"shoes\">\r\n");
      out.write("            <div class=\"header_info\">\r\n");
      out.write("                <a href=\"infomation0.jsp\"><img\r\n");
      out.write("                        src=\"image\\user (1).png\"\r\n");
      out.write("                        alt=\"profile\">Profile</a>\r\n");
      out.write("                <a href=\"orderDetail.jsp\"><img\r\n");
      out.write("                        src=\"image\\heart.png\"\r\n");
      out.write("                        alt=\"Orders\">Orders</a>\r\n");
      out.write("                <a href=\"myCart.html\"><img\r\n");
      out.write("                        src=\"image\\shopping-cart.png\"\r\n");
      out.write("                        alt=\"shopping-cart\">My cart</a>\r\n");
      out.write("                <a href=\"#\"><img\r\n");
      out.write("                        src=\"image\\blog (2).png\"\r\n");
      out.write("                        alt=\"shopping-cart\">News</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"MainController\" method=\"\">\r\n");
      out.write("            <button style=\"\r\n");
      out.write("                    border-radius: 20px;\r\n");
      out.write("                    padding: 5px 20px;\r\n");
      out.write("                    background: #FF9900;\r\n");
      out.write("                    border: 0.5px;\r\n");
      out.write("                    margin-left: 1250px;\r\n");
      out.write("                    transform: translate(150px, -50px);\r\n");
      out.write("                    \" name=\"btAction\" value=\"Custom\">\r\n");
      out.write("                Done</button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"information_left\">\r\n");
      out.write("                <div class=\"information_left_1\">\r\n");
      out.write("                    <p>Left Outside</p>\r\n");
      out.write("                    <div class=\"information_left_1_1\">\r\n");
      out.write("                        <input id=\"file\" name=\"file1\" type=\"text\" accept=\"image/jpg image/png\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information_left_2\">\r\n");
      out.write("                        <p>Right Outside</p>\r\n");
      out.write("                        <div class=\"information_left_2_1\">\r\n");
      out.write("                            <input id=\"file\" name=\"file2\" type=\"text\" accept=\"image/jpg image/png\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information_left_3\">\r\n");
      out.write("                        <p>Left Inside</p>\r\n");
      out.write("                        <div class=\"information_left_3_1\">\r\n");
      out.write("                            <input id=\"file\" name=\"file3\" type=\"text\" accept=\"image/jpg image/png\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information_left_4\">\r\n");
      out.write("                        <p>Left Outside</p>\r\n");
      out.write("                        <div class=\"information_left_4_1\">\r\n");
      out.write("                            <input id=\"file\" name=\"file4\" type=\"text\" accept=\"image/jpg image/png\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information_left_5\">\r\n");
      out.write("                        <p>Back</p>\r\n");
      out.write("                        <div class=\"information_left_5_1\">\r\n");
      out.write("                            <input id=\"file\" name=\"file5\" type=\"text\" accept=\"image/jpg image/png\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information_left_6\">\r\n");
      out.write("                        <p>Overlook</p>\r\n");
      out.write("                        <div class=\"information_left_6_1\">\r\n");
      out.write("                            <input id=\"file\" name=\"file6\" type=\"text\" accept=\"image/jpg image/png\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information_right\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            ");

                                Object name = session.getAttribute("shoeID");
                                Object total = session.getAttribute("");
                            
      out.write("\r\n");
      out.write("                            <h3>\r\n");
      out.write("                                <!-- Tên giày --><input type=\"text\" name=\"ShoeName\" value=\"");
      out.print( name);
      out.write("\">\r\n");
      out.write("                            </h3>\r\n");
      out.write("                            <!-- <a href='../SizeChart/SizeChart.html' target=\"_blank\"><img\r\n");
      out.write("                                    style=\"max-width: 20px; margin-top: -70px; margin-left: 380px;\"\r\n");
      out.write("                                    src=\"C:\\Users\\ADMIN\\Desktop\\SWP391\\SWP391\\New file Shoes stylize (html)\\Shoes stylize (by html)\\image\\logo\\information.png\"\r\n");
      out.write("                                    alt=\"information\"></a> -->\r\n");
      out.write("                            <p style=\"margin-bottom: 50px; font-size: 13px; font-weight: normal;\">Custom Shoes</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"information_right_2\">\r\n");
      out.write("                            <p>Select Gender</p>\r\n");
      out.write("                            <a href=\"homeDes_men.jsp\"><input type=\"button\" value=\"Men's\"></a>\r\n");
      out.write("                            <input type=\"button\" name=\"gen\" value=\"Women\"\r\n");
      out.write("                                   style=\"transform: translateX(35px);background-color: black; color: white;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"information_right_3\">\r\n");
      out.write("                            <p>Select Size</p>\r\n");
      out.write("                            <a href=\"sizeChart.jsp\" target=\"_blank\" style=\"color: black;\"><span>Size Guide</span></a>\r\n");
      out.write("                            <input type=\"radio\" value=\"39\" name=\"size\" id=\"\">39<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"40\" name=\"size\" id=\"\">40<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"41\" name=\"size\" id=\"\">41<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"42\" name=\"size\" id=\"\">42<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"43\" name=\"size\" id=\"\">43<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"44\" name=\"size\" id=\"\">44<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"45\" name=\"size\" id=\"\">45<br>\r\n");
      out.write("                            <input type=\"radio\" value=\"46\" name=\"size\" id=\"\">46<br>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"information_right_4\">\r\n");
      out.write("                            <p>Service</p>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"information_right_4_1\"><input type=\"checkbox\" name=\"Service1\" value=\"LO\" id=\"\">Left Outside</div>\r\n");
      out.write("                                <div class=\"information_right_4_2\"><input type=\"checkbox\" name=\"Service2\" value=\"RO\" id=\"\">Right Outside</div>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <div class=\"information_right_4_1\"><input type=\"checkbox\" name=\"Service3\" value=\"LI\" id=\"\">Left Inside </div>\r\n");
      out.write("                                <div class=\"information_right_4_2\"><input type=\"checkbox\" name=\"Service4\" value=\"RI\" id=\"\">Right Inside</div>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <div class=\"information_right_4_4\" style=\"margin-left: -278px;\"><input type=\"checkbox\" name=\"Service5\" value=\"Back\" id=\"\">Back</div>\r\n");
      out.write("                                <div class=\"information_right_4_3\" style=\"margin-left: 96px; margin-top: -23px\"><input type=\"checkbox\" name=\"Service6\" value=\"Overlook\" id=\"\">Overlook</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3 style=\"font-size: 20px; margin-left: 180px; margin-top: 20px; color: red;\">\r\n");
      out.write("                                Total amount: ");
      out.print( total );
      out.write("\r\n");
      out.write("                            </h3>\r\n");
      out.write("                            <input type=\"hidden\" name=\"total\" value=\"");
      out.print( total);
      out.write("\" >\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            div style=\"float:right\">\r\n");
      out.write("            <img src=\"image\\facebook.png\"\r\n");
      out.write("                 alt=\"Facebook\" />\r\n");
      out.write("            <img src=\"image\\twitter.png\"\r\n");
      out.write("                 alt=\"twitter\" />\r\n");
      out.write("            <img src=\"image\\linkedin.png\"\r\n");
      out.write("                 alt=\"linkedin\" />\r\n");
      out.write("            <img src=\"image\\instagram (1).png\"\r\n");
      out.write("                 alt=\"Instagram\" />\r\n");
      out.write("            <img src=\"image\\youtube (5).png\"\r\n");
      out.write("                 alt=\"youtube\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\" float:right\">\r\n");
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
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear: both\" class=\"commerce\">\r\n");
      out.write("            @2023 Ecommerce\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
