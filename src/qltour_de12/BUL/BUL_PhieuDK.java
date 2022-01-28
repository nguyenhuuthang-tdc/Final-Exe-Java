/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.BUL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import qltour_de12.DAL.DAL_PhieuDK;
import qltour_de12.DTO.DTO_PhieuDK;

/**
 *
 * @author ASUS
 */
public class BUL_PhieuDK {
    DAL_PhieuDK dal = new DAL_PhieuDK();
    
    //Lấy tấy cả dữ liệu
    public ResultSet getAllPhieuDK() throws SQLException{
        return dal.getAllPhieuDK();
    }
    //Lấy tấy cả dữ liệu bằng mã
    public ResultSet getPhieuDKByMaKH(String maKH) throws SQLException{
        return dal.getPhieuDKByMaKH(maKH);
    }
    //Them dữ liệu phiếu đăng ký
    public Boolean InsertPhieuDK(DTO_PhieuDK obj) throws SQLException{
        return dal.InsertPhieuDK(obj);
    }
    
    //Cập nhật dữ liệu 
    public Boolean UpdatePhieuDK(DTO_PhieuDK obj) throws SQLException{
        return dal.UpdatePhieuDK(obj);
    }
    
    //Xóa dữ liệu
    public Boolean DeletePhieuDK(DTO_PhieuDK obj){
        return dal.DeletePhieuDK(obj);
    }
}
