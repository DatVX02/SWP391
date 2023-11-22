package Brand;

import Database.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class brandDAO implements Serializable {
    public int getBrandID(String brandName) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT [BrandID] FROM [Brand]"
                        + " WHERE [BrandName] like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, brandName);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("BrandID");
                }
            } 
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return -1;
    }
}
