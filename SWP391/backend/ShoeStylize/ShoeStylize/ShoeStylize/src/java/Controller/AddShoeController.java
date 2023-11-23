/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Brand.brandDAO;
import Registration.RegistrationDAO;
import Shoes.ShoeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class AddShoeController extends HttpServlet {

    private final String STOREPAGE = "store.jsp";
    private final String ADDSHOEPAGE = "Service Provider/Store statictics/AddShoes.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ADDSHOEPAGE;
        try {
            String shoeName = request.getParameter("txtShoeName");
            String brandName = request.getParameter("txtBrandName");
            String category = request.getParameter("cate");
            String image = request.getParameter("txtURL");
            int price = Integer.valueOf(request.getParameter("txtPrice"));
            int quantity = Integer.valueOf(request.getParameter("txtQuant"));
            String description = request.getParameter("txtDes");
            
            brandDAO dao = new brandDAO();
            
            int brandID = dao.getBrandID(brandName);
            
            if (brandID != -1){
                ShoeDAO dao1 = new ShoeDAO();
                boolean result = dao1.addShoe(brandID, shoeName, category, description, image, quantity, price);
                if (result) {
                    url = STOREPAGE;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
