/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CusShoe;

import Database.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SivaRyi
 */
public class CusShoeDAO {
    
    public boolean addCustomizedShoe(int orderID, int shoeID, int userID, int serviceID, String shoesName,
                                  String imageLink1,String imageLink2,String imageLink3,String imageLink4,String imageLink5,String imageLink6, 
                                  int outLeft, int outRight, int inLeft, int inRight,
                                  int back, int overlook, String gender, String size, int totalAmount) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO CustomizeShoes (OrderID, ShoeID, UserID, ServiceID, ShoesName, \" +\n" +
"                    \"ImageLink1,ImageLink2,ImageLink3,ImageLink4,ImageLink5,ImageLink6, OutLeft, OutRight, InLeft, InRight, Back, Overlook, Gender, Size, totalamount) \" +\n" +
"                    \"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, orderID);
                stm.setInt(2, shoeID);
                stm.setInt(3, userID);
                stm.setInt(4, serviceID);
                stm.setString(5, shoesName);
                stm.setString(6, imageLink1);
                stm.setString(7, imageLink2);
                stm.setString(8, imageLink3);
                stm.setString(9, imageLink4);
                stm.setString(10, imageLink5);
                stm.setString(11, imageLink6);
                stm.setInt(12, outLeft);
                stm.setInt(13, outRight);
                stm.setInt(14, inLeft);
                stm.setInt(15, inRight);
                stm.setInt(16, back);
                stm.setInt(17, overlook);
                stm.setString(18, gender);
                stm.setString(19, size);
                stm.setInt(20, totalAmount);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
}
