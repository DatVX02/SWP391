/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class MainController extends HttpServlet {
    private static final String LOGINCONTROLLER="LoginController";
    private static final String REGISTRATIONCONTROLLER="RegistrationController";
    private static final String UPDATECONTROLLER="UpdateController";
    private static final String ADDBLOGCONTROLLER="AddBlogController";
    private static final String SEARCHBLOGCONTROLLER="SearchBlogController";
    private static final String SEARCHCONTROLLER="SearchController";
    private static final String DELETECONTROLLER="DeleteController";
    private static final String DELETEBLOGCONTROLLER="DeleteBlogController";
    private static final String UPDATEPASSWORDCONTROLLER="UpdatePasswordController";
    private static final String FORGOTPASSWORDCONTROLLER="ForgotPasswordController";
    private static final String RESETPASSWORDCONTROLLER="ResetPasswordController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url="";
        String button = request.getParameter("btAction");
        try {
            switch(button){
                case "Login": url=LOGINCONTROLLER;
                              break;
                
                case "Register": url=REGISTRATIONCONTROLLER;
                                 break;
                                 
                case "Update": url=UPDATECONTROLLER;
                               break;
                case "Add Blog": url=ADDBLOGCONTROLLER;
                               break;
                case "Search Blog": url=SEARCHBLOGCONTROLLER;
                               break;
                case "Search": url=SEARCHCONTROLLER;
                               break;
                case "Delete": url=DELETECONTROLLER;
                               break;
                case "Delete Blog": url=DELETEBLOGCONTROLLER;
                               break;
                case "Change Password": url=UPDATEPASSWORDCONTROLLER;
                               break;
                case "Forgot Password": url=FORGOTPASSWORDCONTROLLER;
                               break;
                case "Reset Password": url=RESETPASSWORDCONTROLLER;
                               break;
                default: break;
            }
        } catch(Exception e){
            log("Errors MainController:"+e.toString());
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
        processRequest(request, response);
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
        processRequest(request, response);
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
