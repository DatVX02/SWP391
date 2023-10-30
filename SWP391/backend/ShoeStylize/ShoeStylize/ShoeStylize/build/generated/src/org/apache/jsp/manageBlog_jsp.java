package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Blog.BlogDTO;
import java.util.List;
import Registration.RegistrationDAO;

public final class manageBlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Manage Blog</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\manageBlog.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"manage\">\n");
      out.write("            <div style=\"width: 20%; float:left\" class=\"managefunction\">\n");
      out.write("                <a href=\"manageUser.jsp\">Account Management</a>\n");
      out.write("                <a href=\"manageBlog.jsp\">Blog Management</a>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 79%; float:right\" class=\"bloglist\">\n");
      out.write("                <div style=\"float: right;\">\n");
      out.write("                    <form action=\"MainController\" method=\"post\">\n");
      out.write("                        <input type=\"text\" name=\"txtSearchbytitle\" placeholder=\"Find some blog\">\n");
      out.write("                        <input type=\"submit\" name=\"btAction\" value=\"Search Blog\" class=\"button\">\n");
      out.write("                        <a href=\"addBlog.jsp\"><input type=\"button\" value=\"Add Blog\" class=\"button\"></a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"clear: both;\">\n");
      out.write("                    ");

                        List<BlogDTO> result =null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbytitle");
                        if(searchValue != null){
                            result = (List<BlogDTO>) request.getAttribute("BLOGSEARCHRESULT");
                        } else{
                            dao.showBlog();
                            result = dao.getListBlogs();
                        }    
                        if (result != null) {
                    
      out.write("\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"tablehead\">\n");
      out.write("                                <td>No.</td>\n");
      out.write("                                <td>Title</td>\n");
      out.write("                                <td>Author</td>\n");
      out.write("                                <td>Post Date</td>\n");
      out.write("                                <td>Content</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                int count = 0;
                                for (BlogDTO dto : result) {
                                    String urlRewriting = "MainController?btAction=Delete&pk=" + dto.getAuthor() + "&lastSearchValue=" + request.getParameter("txtSearchbyaccount");
                            
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
      out.write("                                    <input type=\"text\" name=\"txtTitle\" value=\"");
      out.print( dto.getTitle());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"txtFullname\" value=\"");
      out.print( dto.getAuthor());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"postDate\" value=\"");
      out.print( dto.getDate());
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"txtContent\" value=\"");
      out.print( dto.getContent());
      out.write("\" />\n");
      out.write("                                </td>\n");
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
