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
import qltour_de12.DTO.DTO_ChiTiet;

/**
 *
 * @author ASUS
 */
public class DAL_ChiTiet {

    Connection conn = null;

    //Lấy tất cả thông tin chi tiêt
    public ResultSet getAllChiTiet() throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from ct_phieudk";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
    //Lấy tất cả thông tin chi tiêt
    public ResultSet getThongKeChiTiet(String maPhieu) throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "Select tour.maTour, tour.loTrinh, tour.hanhTrinh, tour.giaTour, ct_phieudk.soNguoi, (tour.giaTour * ct_phieudk.soNguoi) from ct_phieudk, tour, phieu_dang_ky where "
                       + "phieu_dang_ky.maPhieu = ct_phieudk.maPhieu and "
                       + "tour.maTour = ct_phieudk.maTour and phieu_dang_ky.maPhieu = '" + maPhieu + "'";
            rs = state.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }

    //Them dữ liệu chi tiet
    public Boolean InsertChiTiet(DTO_ChiTiet obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Insert into ct_phieudk "
                    + "values('" + obj.getMaPhieu() + "','" + obj.getMaTour() + "','" + obj.getSoNguoi() + "')";
            if (state.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return kq;
    }

    //Cập nhật dữ liệu chi tiet
    public Boolean UpdateChiTiet(DTO_ChiTiet obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "update ct_phieudk "
                    + "set maPhieu ='" + obj.getMaPhieu()+ "', "
                    + "maTour ='" + obj.getMaTour()+ "', "
                    + "soNguoi ='" + obj.getSoNguoi()+ "' "
                    + " where maPhieu ='" + obj.getMaPhieu() + "' and maTour = '" + obj.getOldMaTour()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    //Xóa chi tiet
    public Boolean DeleteChiTiet(DTO_ChiTiet id) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "Delete from ct_phieudk where maPhieu = '" + id.getMaPhieu()+ "' " + "and maTour = '" + id.getMaTour() + "' " + "and soNguoi = '" + id.getSoNguoi()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return kq;
    }

    //Kiểm tra ma chi tiet tồn tại hay chưa
    public Boolean checkIDChiTiet(String id) {
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Select * from ct_phieudk Where ma_pb = '" + id + "'";
            rs = state.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
    
    //Kiểm tra có tồn tại nhân viên của chi tiêt này hay không
    public  Boolean checkExistDataChiTiet(String maPB){
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Select * from nhanvien nv, phongban pb Where nv.ma_pb = '" + maPB + "' AND pb.ma_pb = '"+maPB+"'";
            rs = state.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
    //Kiểm tra tồn tại mã phiếu, mã tour giống nhau
    public Boolean checkExistMaPhieuAndMaTour(String maPhieu, String maTour) {
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Select * from ct_phieudk Where maPhieu = '" + maPhieu + "' and maTour = '" + maTour + "'";
            rs = state.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
    //Kiểm tra tồn tại mã phiếu, mã tour, số người giống nhau
    public Boolean checkExistMaPhieuAndMaTourExtra(String maPhieu, String maTour, int soNguoi) {
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Select * from ct_phieudk Where maPhieu = '" + maPhieu + "' and maTour = '" + maTour + "' and soNguoi = '" + soNguoi + "'";
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
