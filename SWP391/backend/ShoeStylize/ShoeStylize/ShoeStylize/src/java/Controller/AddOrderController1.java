/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import CusShoe.CusShoeDAO;
import Order.OrderDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class AddOrderController1 extends HttpServlet {

    private final String ORDERDETAILPAGE = "orderDetail.jsp";
    private final String INVALIDPAGE = "invalid.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String url = INVALIDPAGE;
        try {
            HttpSession session = request.getSession();
            String size = (String) session.getAttribute("Size");
            String gender = (String) session.getAttribute("Gender");
            String name = (String) session.getAttribute("ShoeName");
            String img = (String) session.getAttribute("Image");
            String total = (String) session.getAttribute("Total");
            int intTotal = Integer.parseInt(total);
            String[] services = (String[]) session.getAttribute("Services");
            String[] files = (String[]) session.getAttribute("Files");
            String[] serviceFlags = new String[6];
            String[] fileNames = new String[6];

            for (int i = 0; i < 6; i++) {
                fileNames[i] = files[i];
                serviceFlags[i] = (services[i] != null) ? "1" : "0";
            }
            int userID = Integer.parseInt(request.getParameter("id"));
            String date = String.valueOf(java.time.LocalDate.now());
            String time = String.valueOf(java.time.LocalTime.now());
            String status = "On going";
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            OrderDAO dao = new OrderDAO();
            boolean result = dao.insertNewOrder(userID, date, time, intTotal, status, quantity);
            if (result) {
                int orderID = dao.findOrderID(date, time);
                CusShoeDAO dao1 = new CusShoeDAO();
                boolean result1 = dao1.addCustomizedShoe(orderID, orderID, userID, userID, name,  fileNames[0], fileNames[1], fileNames[2],
                            fileNames[3], fileNames[4], fileNames[5],
                            Integer.valueOf(serviceFlags[0]), Integer.valueOf(serviceFlags[1]),
                            Integer.valueOf(serviceFlags[2]), Integer.valueOf(serviceFlags[3]),
                            Integer.valueOf(serviceFlags[4]), Integer.valueOf(serviceFlags[5]),
                        gender, size, intTotal);
                if (result1) {
                    url = ORDERDETAILPAGE;
                }
            }
        } catch (SQLException ex) {
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
