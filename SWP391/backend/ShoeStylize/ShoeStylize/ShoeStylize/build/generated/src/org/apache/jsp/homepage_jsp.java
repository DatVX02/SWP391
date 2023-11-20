package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Shoes.ShoeDAO;
import Shoes.ShoeDTO;
import java.util.ArrayList;
import java.util.ArrayList;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Shoes Page</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"image\\shoelogo.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\homepage.css\">\r\n");
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
      out.write("            <div class=\"header_info\" style=\"color: white;\">\r\n");
      out.write("                <a href=\"information0.jsp\"><img\r\n");
      out.write("                        src=\"image\\user (1).png\"\r\n");
      out.write("                        alt=\"profile\">Profile</a>\r\n");
      out.write("                <a href=\"#\"><img\r\n");
      out.write("                        src=\"image\\heart.png\"\r\n");
      out.write("                        alt=\"Orders\">Orders</a>\r\n");
      out.write("                <a href=\"myCart.jsp\"><img\r\n");
      out.write("                        src=\"image\\shopping-cart.png\"\r\n");
      out.write("                        alt=\"shopping-cart\">My cart</a>\r\n");
      out.write("                <a href=\"#\"><img\r\n");
      out.write("                        src=\"image\\blog (2).png\"\r\n");
      out.write("                        alt=\"shopping-cart\">News</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--    <div style=\"text-align: right; transform: translateX(160px); margin-top: 20px; \">\r\n");
      out.write("                <a href=\"homeDes.jsp\">\r\n");
      out.write("                    <button style=\"background: #FF9900; font-weight: bold; padding: 5px 10px; border: 0.5px \">Create New Shoes</button>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        -->\r\n");
      out.write("\r\n");
      out.write("        <form action=\"MainController\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row mb-5 mt-5\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card mb-4\">\r\n");
      out.write("                        <div class=\"card-header\" style=\"font-weight: bold;\">Category</div>\r\n");
      out.write("                        <div class=\"list-group list-group-flush\">\r\n");
      out.write("                            <a href=\"CategoryController?byCategory1=Sport\" class=\"list-group-item list-group-item-action\">Sport</a>\r\n");
      out.write("                            <a href=\"CategoryController?byCategory1=Party\" class=\"list-group-item list-group-item-action \">Party</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-body p-1\">\r\n");
      out.write("                            <div class=\"card border-0 b-3\">\r\n");
      out.write("                                <div class=\"card-header p-2 bg-white\" data-toggle=\"collapse\" data-target=\"#collapseExample1\"\r\n");
      out.write("                                     aria-expanded=\"false\">\r\n");
      out.write("                                    <p class=\"m-0 h6\">Brand</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body p-0 collapse show\" id=\"collapseExample1\">\r\n");
      out.write("                                    <ul class=\"list-group list-group-flush\" style=\"height:200px;overflow:auto;\">\r\n");
      out.write("                                        <!--<ul class=\"list-group list-group-flush\" style=\"height:200px;overflow:auto;\">-->\r\n");
      out.write("                                        <a href=\"CategoryController?byCategory1=Nike\" class=\"list-group-item list-group-item-action \">Nike</a>\r\n");
      out.write("                                        <a href=\"CategoryController?byCategory1=Jordan\"class=\"list-group-item list-group-item-action \">Jordan</a>\r\n");
      out.write("                                        <a href=\"CategoryController?byCategory1=Adidas\"class=\"list-group-item list-group-item-action \">Adidas</a>\r\n");
      out.write("                                        <a href=\"CategoryController?byCategory1=Puma\" class=\"list-group-item list-group-item-action \">Puma</a>\r\n");
      out.write("                                        <a href=\"CategoryController?byCategory1=Converse\"class=\"list-group-item list-group-item-action \">Converse</a>\r\n");
      out.write("\r\n");
      out.write("                                        <!--</ul>-->\r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card border-0 b-3\">\r\n");
      out.write("                                <div class=\"card-header p-2 bg-white\" data-toggle=\"collapse\" data-target=\"#collapseExample4\"\r\n");
      out.write("                                     aria-expanded=\"false\">\r\n");
      out.write("                                    <p class=\"m-0 h6\">Price</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body p collapse show\" id=\"collapseExample4\">\r\n");
      out.write("                                    <div class=\"form-row\">\r\n");
      out.write("                                        <div class=\"form-group col-md-6\">\r\n");
      out.write("                                            <label>Min</label>\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"$0\" type=\"number\" min=\"0\"\r\n");
      out.write("                                                   max=\"99999999999\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group text-right col-md-6\">\r\n");
      out.write("                                            <label>Max</label>\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"$1,0000\" type=\"number\" min=\"0\"\r\n");
      out.write("                                                   max=\"9999999999\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"card-header p-2 bg-white\" data-toggle=\"collapse\"\r\n");
      out.write("                                         data-target=\"#collapseExample1\" aria-expanded=\"false\">\r\n");
      out.write("                                        <p class=\"m-0 h6\">Rating</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"list-group list-group-flush\" style=\"height:200px;overflow:auto;\">\r\n");
      out.write("                                        <li class=\"list-group-item p-2 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                            <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck6\">\r\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"customCheck6\"\r\n");
      out.write("                                                       style=\"color: #FF9900;\">\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star \" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star \" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star \" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"list-group-item p-2 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                            <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck7\">\r\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"customCheck7\">\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"list-group-item p-2 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                            <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck8\">\r\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"customCheck8\">\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"list-group-item p-2 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                            <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck9\">\r\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"customCheck9\">\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"list-group-item p-2 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                            <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck10\">\r\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"customCheck10\">\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\" style=\"color: #FF9900;\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                    <i class=\"fa-xs far fa-star\"></i>\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-footer\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-block btn-primary\">Apply</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-9\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            ");
 ArrayList<ShoeDTO> shoes = new ArrayList<>();
                                String category = (String) session.getAttribute("Cate");
                                ShoeDAO dao = new ShoeDAO();
                                if (category == "Cate") {
                                    shoes = (ArrayList<ShoeDTO>) session.getAttribute("shoesList");
                                } else {
                                    shoes = dao.AlllistShoe();
                                }
                                if (shoes != null) {
                                    for (ShoeDTO shoe : shoes) {
                            
      out.write(" \r\n");
      out.write("                            <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <img class=\"card-img-top\" src=\"");
      out.print(shoe.getImage());
      out.write("\" alt=\"\" />\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <p class=\"h5 m-0\">\r\n");
      out.write("                                            <!-- Giá sản phẩm -->\r\n");
      out.write("                                            ");
      out.print( shoe.getPrice());
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p class=\"h6\">\r\n");
      out.write("                                            <!-- Tên sản phẩm  -->\r\n");
      out.write("                                            ");
      out.print( shoe.getShoesName());
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer p-0\" style=\"text-align: center;\">\r\n");
      out.write("                                        <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-light\">\r\n");
      out.write("                                                <!--<i class=\"fas fa-cart-plus\"></i>-->\r\n");
      out.write("                                                <a href=\"home\" style=\"color: black; text-align: none\">Custom Now</a>\r\n");
      out.write("                                            </button>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");

                                    }
                                }
                            
      out.write("\r\n");
      out.write("                            <!--div class=\"card-footer p-3\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <ul class=\"pagination m-0 \">\r\n");
      out.write("                                            <li class=\"page-item disabled\">\r\n");
      out.write("                                                <a class=\"page-link\" href=\"#\" tabindex=\"-1\"\r\n");
      out.write("                                                    aria-disabled=\"true\">Previous</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                                            <li class=\"page-item\">\r\n");
      out.write("                                                <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("                <div class=\"row\"></div>\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("\r\n");
      out.write("                </html>");
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
