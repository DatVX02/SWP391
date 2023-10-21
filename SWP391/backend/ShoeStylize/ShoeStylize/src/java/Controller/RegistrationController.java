/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Registration.RegistrationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class RegistrationController extends HttpServlet {
          
          
          private final String REGISTERPAGE = "register.jsp";
          private final String HOMEPAGE = "home.jsp";
          DateFormat df = new SimpleDateFormat();
          
          protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                  throws ServletException, IOException, SQLException {
                    response.setContentType("text/html;charset=UTF-8");
                    String url = REGISTERPAGE;
                    try {
                              Random rdn = new Random();
                              DateFormat df = new SimpleDateFormat(request.getParameter("txtBirthDate"));
                              String dateToString = df.format(df);
                              String userID = String.valueOf(rdn.nextInt());
                              String email = request.getParameter("txtEmail");
                              String password = request.getParameter("txtPassword");
                              String userName = request.getParameter("txtUsername");
                              String phone = request.getParameter("txtPhone");
                              Date birthDate = dateToString;
                              String roleID = "USER";
                              String image = request.getParameter("txtImage");
                    
                              RegistrationDAO dao = new RegistrationDAO();
                              boolean result = dao.insertRecord(userID, email, password, userName, phone, birthDate, roleID, image);  
                               
                               if(result) {
                                         url = HOMEPAGE;
                               }
                    } catch(SQLException ex) {
                              ex.printStackTrace();
                    } finally {
                              response.sendRedirect(url);
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
                              Logger.getLogger(RegistrationController.class.getName()).log(Level.SEVERE, null, ex);
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
                              Logger.getLogger(RegistrationController.class.getName()).log(Level.SEVERE, null, ex);
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
