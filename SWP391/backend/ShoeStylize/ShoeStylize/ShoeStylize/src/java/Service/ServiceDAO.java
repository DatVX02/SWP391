/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Database.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author duong
 */
public class ServiceDAO implements Serializable {
     public ServiceDTO listService(int serviceID) throws SQLException {
        ServiceDTO service = new ServiceDTO();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql ="SELECT [ServiceID], [OutLeftCost], [OutRightCost], [InLeftCost], [InRightCost], [BackCost], [OverlookCost] FROM [ShoesStylize].[dbo].[Service] WHERE [ServiceID] = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, serviceID);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                  while (rs.next()) {
                    int OutRightCost = rs.getInt("OutRightCost");
                    int ServiceID = rs.getInt("ServiceID");
                    int OutLeftCost  = rs.getInt("OutLeftCost");
                    int InLeftCost = rs.getInt("InLeftCost");
                    int InRightCost = rs.getInt("InRightCost");
                    int BackCost = rs.getInt("BackCost");
                    int OverlookCost = rs.getInt("OverlookCost");
                    service = new ServiceDTO(ServiceID, OutLeftCost, OutRightCost, InLeftCost, InRightCost, BackCost, OverlookCost);     
                  }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return service;
    }
}
