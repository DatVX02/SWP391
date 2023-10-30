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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>User Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\manageUser.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"manage\">\n");
      out.write("            <div style=\"width: 20%; float:left\" class=\"managefunction\">\n");
      out.write("                <a href=\"managerUser.jsp\">Account Management</a>\n");
      out.write("                <a href=\"manageBlog.jsp\">Blog Management</a>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 79%; float:right\" class=\"searchlist\">\n");
      out.write("                <div>\n");
      out.write("                    <form action=\"MainController\" method=\"post\">\n");
      out.write("                        <input type=\"text\" name=\"txtSearchbyaccount\" placeholder=\"Find some account\">\n");
      out.write("                        <input type=\"submit\" name=\"btAction\" value=\"Search\" class=\"button\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"clear: both;\">\n");
      out.write("                    ");

                        List<RegistrationDTO> result =null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbyaccount");
                        if(searchValue != null){
                            result = (List<RegistrationDTO>) request.getAttribute("SEARCHRESULT");
                        } else{
                            dao.showUser();
                            result = dao.getListAccounts();
                        }                       
                        if (result != null) {
                    
      out.write("\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"tablehead\">\n");
      out.write("                                <td>No.</td>\n");
      out.write("                                <td>Email</td>\n");
      out.write("                                <td>Full Name</td>\n");
      out.write("                                <td>Phone</td>\n");
      out.write("                                <td>Birth Date</td>\n");
      out.write("                                <td>Gender</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                int count = 0;
                                for (RegistrationDTO dto : result) {
                                    String urlRewriting = "MainController?btAction=Delete&pk=" + dto.getEmail() + "&lastSearchValue=" + request.getParameter("txtSearchbyaccount");
                            
      out.write("\n");
      out.write("                        <form action=\"MainController\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print( ++count);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"txtEmail\" value=\"");
      out.print( dto.getEmail());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"txtFullname\" value=\"");
      out.print( dto.getFullname());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"txtPhone\" value=\"");
      out.print( dto.getPhone());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"birthDate\" value=\"");
      out.print( dto.getBirthDate());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" class=\"from1\" id=\"male\" name=\"gen\" value=\"Male\" ");
 if ("Male".equals(dto.getGender())) { 
      out.write(" checked ");
 } 
      out.write(">Male\n");
      out.write("                                    <input type=\"radio\" class=\"from1\" id=\"female\" name=\"gen\" value=\"Female\" ");
 if ("Female".equals(dto.getGender())) { 
      out.write(" checked ");
 } 
      out.write(">Female\n");
      out.write("                                    <input type=\"radio\" class=\"from1\" id=\"other\" name=\"gen\" value=\"Other\" ");
 if ("Other".equals(dto.getGender())) { 
      out.write(" checked ");
 }
      out.write(">Other\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"submit\" value=\"Delete\" name=\"btAction\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </form>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    ");

                    } else {
                    
      out.write("\n");
      out.write("                    <h2>No record is matched!</h2>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
