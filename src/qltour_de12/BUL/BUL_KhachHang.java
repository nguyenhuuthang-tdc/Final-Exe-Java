/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.BUL;

import java.sql.ResultSet;
import java.sql.SQLException;
import qltour_de12.DAL.DAL_KhachHang;
import qltour_de12.DTO.DTO_KhachHang;

/**
 *
 * @author ASUS
 */
public class BUL_KhachHang {

    DAL_KhachHang dal = new DAL_KhachHang();

    //Lấy tấy cả khách hàng
    public ResultSet getAllKhachHang() throws SQLException {
        return dal.getAllKhachHang();
    }
    //Lấy khach hang bang ma
    public ResultSet getKhachHangByMa(String maKH) throws SQLException {
        return dal.getKhachHangByMaKH(maKH);
    }

    //Thêm khách hàng
    public Boolean InsertKhachHang(DTO_KhachHang obj) throws SQLException {
        return dal.InsertKhachHang(obj);
    }

    //Cập nhật khách hàng
    public Boolean UpdateKhachHang(DTO_KhachHang obj) throws SQLException {
        return dal.UpdateKhachHang(obj);
    }

    //Xóa khách hàng
    public Boolean DeleteKhachHang(DTO_KhachHang maKH) throws SQLException {
        return dal.DeleteKhachHang(maKH);
    }

    //Kiểm tra mã khách hàng đã tồn tại hay chưa
    public Boolean checkIDKhachHang(String maKH) {
        return dal.checkIDKhachHang(maKH);
    }

    //Tìm kiếm khách hàng theo mã khách hàng
    public ResultSet TimKiemTheoMaKH(String maKH) {
        return dal.TimKiemTheoMaKH(maKH);
    }

    //Tìm kiếm khách hàng theo tên khách hàng
    public ResultSet TimKiemTheoTenKH(String tenNV) {
        return dal.TimKiemTheoTenKH(tenNV);
    }
    
    //Sắp xếp mã khách hàng tăng dần
    public ResultSet SapXepMaKHTang() {
        return dal.SapXepMaKHTang();
    }
    
    //Sắp xếp mã khách hàng giảm dần
    public ResultSet SapXepMaKHGiam() {
        return dal.SapXepMaKHGiam();
    }
    
    //Sắp xếp tên khách hàng tăng dần
    public ResultSet SapXepTenKHTang() {
        return dal.SapXepTenKHTang();
    }
    
    //Sắp xếp tên khách hàng giảm dần
    public ResultSet SapXepTenKHGiam() {
        return dal.SapXepTenKHGiam();
    }
}
