package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Registration.RegistrationDAO;
import java.util.List;
import Registration.RegistrationDTO;

public final class manageUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>User Management</title>\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("        href=\"image\\shoelogo.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS\\manageUser.css\">\r\n");
      out.write("    <!--Bootstrap CSS-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\r\n");
      out.write("    <!--font awesome cdn link-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <img src=\"image\\shoelogo.png\"\r\n");
      out.write("                 alt=\"shoes\">\r\n");
      out.write("        <button style=\"background: #FF0000; color: #fff;\">Manage Account</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"manage\">\r\n");
      out.write("            <div style=\"width: 20%; float:left\" class=\"managefunction\">\r\n");
      out.write("                <a href=\"manageUser.jsp\">Account Management</a>\r\n");
      out.write("                <a href=\"manageBlog.jsp\">Blog Management</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"width: 79%; float:right\" class=\"searchlist\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form action=\"MainController\" method=\"post\">\r\n");
      out.write("                        <input type=\"text\" name=\"txtSearchbyaccount\" placeholder=\"Find some account\">\r\n");
      out.write("                        <input type=\"submit\" name=\"btAction\" value=\"Search\" class=\"button\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"clear: both;\">\r\n");
      out.write("                    ");

                        List<RegistrationDTO> result = null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbyaccount");
                        if (searchValue != null) {
                            result = (List<RegistrationDTO>) request.getAttribute("SEARCHRESULT");
                        } else {
                            dao.showUser();
                            result = dao.getListAccounts();
                        }
                        if (result != null) {
                    
      out.write("\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr class=\"tablehead\">\r\n");
      out.write("                                <td>UserID</td>\r\n");
      out.write("                                <td>Email</td>\r\n");
      out.write("                                <td>Password</td>\r\n");
      out.write("                                <td>FullName</td>\r\n");
      out.write("                                <td>PhoneNumber</td>\r\n");
      out.write("                                <td>Birthdate</td>\r\n");
      out.write("                                <td>RoleID</td>\r\n");
      out.write("                                <td>Gender</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                                for (RegistrationDTO dto : result) {
                            
      out.write("\r\n");
      out.write("                        <form action=\"MainController\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"id\" value=\"");
      out.print( dto.getUserID());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"txtEmail\" value=\"");
      out.print( dto.getEmail());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"password\" name=\"txtPassword\" value=\"");
      out.print( dto.getPassword());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"txtFullname\" value=\"");
      out.print( dto.getFullname());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"txtPhone\" value=\"");
      out.print( dto.getPhone());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"birthDate\" value=\"");
      out.print( dto.getBirthDate());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"roleID\" value=\"");
      out.print( dto.getRoleID());
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"radio\" class=\"from1\" id=\"male\" name=\"gen\" value=\"Male\" ");
 if ("Male".equals(dto.getGender())) { 
      out.write(" checked ");
 } 
      out.write(">Male<br>\r\n");
      out.write("                                    <input type=\"radio\" class=\"from1\" id=\"female\" name=\"gen\" value=\"Female\" ");
 if ("Female".equals(dto.getGender())) { 
      out.write(" checked ");
 } 
      out.write(">Female<br>\r\n");
      out.write("                                    <input type=\"radio\" class=\"from1\" id=\"other\" name=\"gen\" value=\"Other\" ");
 if ("Other".equals(dto.getGender())) { 
      out.write(" checked ");
 }
      out.write(">Other<br>\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"submit\" value=\"Delete\" name=\"btAction\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                    ");

                    } else {
                    
      out.write("\r\n");
      out.write("                    <h2>No user available.</h2>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                <div class=\"footer\">\r\n");
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
