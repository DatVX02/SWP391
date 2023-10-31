package Controller;

import Error.LoginInsertError;
import Registration.RegistrationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
    private final String HOMEPAGE= "homepage.jsp";
    private final String LOGINPAGE= "login.jsp";
    private final String ADMINPAGE = "adminpage.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String url = LOGINPAGE;
        String roleID;
        int userID;
        String txtUserID;
        boolean bError = FALSE; 
        LoginInsertError error = new LoginInsertError();
        try {
            String email= request.getParameter("txtEmail");
            String password= request.getParameter("txtPassword");
            RegistrationDAO dao = new RegistrationDAO();
            boolean result = dao.checkLogin(email, password);
            if(result){
                roleID = dao.checkRoleID(email, password);
                if (roleID != null) {
                    if (roleID.equals("ADMIN")) {
                        url = ADMINPAGE;
                        userID = dao.checkUserID(email, password);
                        txtUserID = String.valueOf(userID);
                        Cookie cookie = new Cookie(txtUserID, "Admin");
                        cookie.setMaxAge(1*60);
                        response.addCookie(cookie);
                    } else if (roleID.equals("CUSTOMER")) {
                        url = HOMEPAGE;
                        userID = dao.checkUserID(email, password);
                        txtUserID = String.valueOf(userID);
                        Cookie cookie = new Cookie(txtUserID, "Customer");
                        cookie.setMaxAge(1*60);
                        response.addCookie(cookie);
                    }
                }
            } else {
                error.setInvalid("Invalid Username or Password, please try again.");
                request.setAttribute("INSERTERROR", error);
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
