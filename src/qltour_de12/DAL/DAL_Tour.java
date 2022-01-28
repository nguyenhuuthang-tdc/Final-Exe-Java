/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import qltour_de12.DTO.DTO_Tour;

/**
 *
 * @author ASUS
 */
public class DAL_Tour {

    Connection conn = null;

    public ResultSet getAllTour() throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM tour";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }

    //Them dữ liệu tam ứng
    public Boolean InsertTour(DTO_Tour obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Insert into tour "
                    + "values('" + obj.getMaTour()+ "','" + obj.getLoTrinh() + "','" + obj.getHanhTrinh()+ "'," + obj.getGia() + ")";
            if (state.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
    
    //Cập nhật dữ liệu tạn ứng
    public Boolean UpdateTour(DTO_Tour obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "update tour "
                    + "set maTour ='" + obj.getMaTour() + "', "
                    + "loTrinh = '" + obj.getLoTrinh()+ "', "
                    + "hanhTrinh = '" + obj.getHanhTrinh()+ "', "
                    + "giaTour = '" + obj.getGia()+ "'"
                    + "where maTour ='" + obj.getMaTour()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
    
    //Xóa tour
    public Boolean DeleteTour(DTO_Tour obj) throws SQLException{
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "Delete from tour where maTour = '" + obj.getMaTour()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
    
    //Kiểm tra Số phiếu tồn tại hay chưa
    public Boolean checkIDTour(String id) {
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Select * from tour Where maTour = '" + id + "'";
            rs = state.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
}
