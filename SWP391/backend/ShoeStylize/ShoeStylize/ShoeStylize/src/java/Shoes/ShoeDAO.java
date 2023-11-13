/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shoes;

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
public class ShoeDAO implements Serializable {

    public ArrayList<ShoeDTO> AlllistShoe() throws SQLException {
        ArrayList<ShoeDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT [ShoeID]\n"
                    + "      ,[BrandID]\n"
                    + "      ,[ShoesName]\n"
                    + "      ,[Category]\n"
                    + "      ,[Description]\n"
                    + "      ,[Image]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[Price]\n"
                    + "      ,[SizeID]\n"
                    + "  FROM [dbo].[Shoes]";
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    int BrandID = rs.getInt("BrandID");
                    String ShoesName = rs.getString("ShoesName");
                    String Description = rs.getString("Description");
                    String Image = rs.getString("Image");
                    int Quantity = rs.getInt("Quantity");
                    double Price = rs.getDouble("Price");
                    int SizeID = rs.getInt("SizeID");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, BrandID, ShoesName, Image, Description, Image, Quantity, Price, SizeID);
                    list.add(shoes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ShoeDTO> CatelistShoe(String by) throws SQLException {
        ArrayList<ShoeDTO> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            String sql = "SELECT [ShoeID]\n"
                    + "      ,[BrandID]\n"
                    + "      ,[ShoesName]\n"
                    + "      ,[Category]\n"
                    + "      ,[Description]\n"
                    + "      ,[Image]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[Price]\n"
                    + "      ,[SizeID]\n"
                    + "  FROM [dbo].[Shoes]\n"
                    + "  Where [Category] = ?";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, by);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int ShoeID = rs.getInt("ShoeID");
                    int BrandID = rs.getInt("BrandID");
                    String ShoesName = rs.getString("ShoesName");
                    String Description = rs.getString("Description");
                    String Image = rs.getString("Image");
                    int Quantity = rs.getInt("Quantity");
                    double Price = rs.getDouble("Price");
                    int SizeID = rs.getInt("SizeID");
                    ShoeDTO shoes = new ShoeDTO(ShoeID, BrandID, ShoesName, Image, Description, Image, Quantity, Price, SizeID);
                    list.add(shoes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
