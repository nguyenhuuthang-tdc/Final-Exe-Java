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
import qltour_de12.DTO.DTO_KhachHang;

/**
 *
 * @author ASUS
 */
public class DAL_KhachHang {

    Connection conn = null; //Kết nối database

    //Show tất cả khách hàng kèm tên phòng ban mà khách hàng đó làm
    public ResultSet getAllKhachHang() throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
    //get khach hang bang ma
    public ResultSet getKhachHangByMaKH(String maKH) throws SQLException {
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang where maKH = '" + maKH + "'";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }

    //Them khách hàng
    public Boolean InsertKhachHang(DTO_KhachHang obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Insert into khach_hang "
                    + "values('" + obj.getMaKH() + "','" + obj.getHoTen() + "','" + obj.getDiaChi()+ "')";
            if (state.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return kq;
    }

    //Cập nhật thông tin khách hàng
    public Boolean UpdateKhachHang(DTO_KhachHang obj) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "update khach_hang "
                    + "set maKH ='" + obj.getMaKH()+ "', "
                    + "tenKH = '" + obj.getHoTen()+ "', "
                    + "diaChi = '" + obj.getDiaChi()+ "'"
                    + "where maKH ='" + obj.getMaKH()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    //Xóa khách hàng
    public Boolean DeleteKhachHang(DTO_KhachHang maNV) throws SQLException {
        Boolean kq = false;
        try {
            conn = DAL_Connections.getConnection();
            Statement st = conn.createStatement();
            String sql = "Delete from khach_hang where maKH = '" + maNV.getMaKH()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return kq;
    }

    //Kiểm tra mã khách hàng đã tồn tại hay chưa
    public Boolean checkIDKhachHang(String maKH) {
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement();
            String sql = "Select * from khach_hang Where maKH = '" + maKH + "'";
            rs = state.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    //Tìm kiếm khách hàng theo mã khách hàng
    public ResultSet TimKiemTheoMaKH(String maKH){
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang WHERE maKH LIKE '%" + maKH + "%'";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    //Tìm kiếm khách hàng theo tên khách hàng
    public ResultSet TimKiemTheoTenKH(String tenKH){
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang WHERE tenKH LIKE '%" + tenKH + "%'";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }   
    //Sắp xếp khách hàng theo mã khách hàng tăng dần
    public ResultSet SapXepMaKHTang(){
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang ORDER BY maKH";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
    
     //Sắp xếp khách hàng theo mã khách hàng giảm dần
    public ResultSet SapXepMaKHGiam(){
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang ORDER BY maKH DESC";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
    
    //Sắp xếp khách hàng theo tên khách hàng tăng dần
    public ResultSet SapXepTenKHTang(){
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang ORDER BY tenKH";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
    
     //Sắp xếp khách hàng theo tên khách hàng giảm dần
    public ResultSet SapXepTenKHGiam(){
        ResultSet rs = null;
        try {
            conn = DAL_Connections.getConnection();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM khach_hang ORDER BY tenKH DESC";
            rs = state.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }
}
