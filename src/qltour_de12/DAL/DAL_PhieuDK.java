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
import java.util.Date;
import javax.swing.JOptionPane;
import qltour_de12.DTO.DTO_PhieuDK;

/**
 *
 * @author ASUS
 */
public class DAL_PhieuDK {

    Connection conn = null;

    //Show tất cả dữ liệu trong bảng phiếu đăng ký
    public ResultSet getAllPhieuDK() throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM phieu_dang_ky";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
    //Show phiếu đăng ký bằng mã
    public ResultSet getPhieuDKByMaKH(String maKH) throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM phieu_dang_ky where maKH = '" + maKH + "'";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }

    //Them dữ liệu phiếu đăng ký
    public Boolean InsertPhieuDK(DTO_PhieuDK obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Insert into phieu_dang_ky "
                    + "values('" + obj.getMaPhieu() + "','" + new java.sql.Date(obj.getNgDK().getTime()) + "','" + obj.getMaKH()+ "')";
            if (state.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return kq;
    }

    //Cập nhật dữ liệu phiếu đăng ký
    public Boolean UpdatePhieuDK(DTO_PhieuDK obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "update phieu_dang_ky "
                    + "set maPhieu ='" + obj.getMaPhieu()+ "', "
                    + "ngayDK = '" + new java.sql.Date(obj.getNgDK().getTime()) + "', "
                    + "maKH = '" + obj.getMaKH()+ "'"
                    + "where maPhieu = '" + obj.getMaPhieu()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    //Xóa dữu liệu phiếu đăng ký
    public Boolean DeletePhieuDK(DTO_PhieuDK obj) {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "Delete from phieu_dang_ky where maPhieu = '" + obj.getMaPhieu()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return kq;
    }
}
