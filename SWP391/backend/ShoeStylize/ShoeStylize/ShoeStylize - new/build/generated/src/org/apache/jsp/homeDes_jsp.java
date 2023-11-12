package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeDes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Shoes Page</title>\r\n");
      out.write("    <link rel=\"icon\"\r\n");
      out.write("        href=\"image\\shoelogo.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/homeDes.css\">\r\n");
      out.write("    <!--Bootstrap CSS-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!--font awesome cdn link-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- header -->\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <img src=\"image\\shoelogo.png\"\r\n");
      out.write("            alt=\"shoes\">\r\n");
      out.write("        <div class=\"header_info\" style=\"color: white;\">\r\n");
      out.write("            <a href=\"information0.jsp\"><img\r\n");
      out.write("                    src=\"image\\user (1).png\"\r\n");
      out.write("                    alt=\"profile\">Profile</a>\r\n");
      out.write("            <a href=\"#\"><img\r\n");
      out.write("                    src=\"image\\heart.png\"\r\n");
      out.write("                    alt=\"Orders\">Orders</a>\r\n");
      out.write("            <a href=\"MyCart.html\"><img\r\n");
      out.write("                    src=\"image\\shopping-cart.png\"\r\n");
      out.write("                    alt=\"shopping-cart\">My cart</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-md-9\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"https://via.placeholder.com/200x200\" alt=\"\" />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"h5 m-0\">\r\n");
      out.write("                                <!-- Giá s?n ph?m -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"h6\">\r\n");
      out.write("                                <!-- Tên s?n ph?m  -->\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                    <i class=\"fas fa-cart-plus\"></i>\r\n");
      out.write("                                    <span>Add Cart</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"https://via.placeholder.com/200x200\" alt=\"\" />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"h5 m-0\">\r\n");
      out.write("                                <!-- Giá s?n ph?m -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"h6\">\r\n");
      out.write("                                <!-- Tên s?n ph?m  -->\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                    <i class=\"fas fa-cart-plus\"></i>\r\n");
      out.write("                                    <span>Add Cart</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"https://via.placeholder.com/200x200\" alt=\"\" />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"h5 m-0\">\r\n");
      out.write("                                <!-- Giá s?n ph?m -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"h6\">\r\n");
      out.write("                                <!-- Tên s?n ph?m  -->\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                    <i class=\"fas fa-cart-plus\"></i>\r\n");
      out.write("                                    <span>Add Cart</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"https://via.placeholder.com/200x200\" alt=\"\" />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"h5 m-0\">\r\n");
      out.write("                                <!-- Giá s?n ph?m -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"h6\">\r\n");
      out.write("                                <!-- Tên s?n ph?m  -->\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                    <i class=\"fas fa-cart-plus\"></i>\r\n");
      out.write("                                    <span>Add Cart</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"https://via.placeholder.com/200x200\" alt=\"\" />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"h5 m-0\">\r\n");
      out.write("                                <!-- Giá s?n ph?m -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"h6\">\r\n");
      out.write("                                <!-- Tên s?n ph?m  -->\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                    <i class=\"fas fa-cart-plus\"></i>\r\n");
      out.write("                                    <span>Add Cart</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"https://via.placeholder.com/200x200\" alt=\"\" />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"h5 m-0\">\r\n");
      out.write("                                <!-- Giá s?n ph?m -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"h6\">\r\n");
      out.write("                                <!-- Tên s?n ph?m  -->\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                    <i class=\"fas fa-cart-plus\"></i>\r\n");
      out.write("                                    <span>Add Cart</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer p-3\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <ul class=\"pagination m-0 \">\r\n");
      out.write("                                <li class=\"page-item disabled\">\r\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" tabindex=\"-1\"\r\n");
      out.write("                                        aria-disabled=\"true\">Previous</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                                <li class=\"page-item\">\r\n");
      out.write("                                    <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
