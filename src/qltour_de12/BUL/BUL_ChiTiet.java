/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.BUL;

import java.sql.ResultSet;
import java.sql.SQLException;
import qltour_de12.DAL.DAL_ChiTiet;
import qltour_de12.DTO.DTO_ChiTiet;

/**
 *
 * @author ASUS
 */
public class BUL_ChiTiet {

    DAL_ChiTiet dal = new DAL_ChiTiet();

    public ResultSet getAllChiTiet() throws SQLException {
        return dal.getAllChiTiet();
    }

    public Boolean InsertChiTiet(DTO_ChiTiet obj) throws SQLException {
        return dal.InsertChiTiet(obj);
    }
    
    public Boolean UpdateChiTiet(DTO_ChiTiet obj) throws SQLException {
        return dal.UpdateChiTiet(obj);
    }
    //
    public ResultSet getThongKeChiTiet(String maPhieu) throws SQLException {
        return dal.getThongKeChiTiet(maPhieu);
    }

    public Boolean DeleteChiTiet(DTO_ChiTiet obj) throws SQLException {
        return dal.DeleteChiTiet(obj);
    }

    public Boolean checkIDChiTiet(String id) {
        return dal.checkIDChiTiet(id);
    }

    public Boolean checkExistDataChiTiet(String id) {
        return dal.checkExistDataChiTiet(id);
    }
    //
    public Boolean checkExistMaPhieuAndMaTourChiTiet(String maPhieu, String maTour) {
        return dal.checkExistMaPhieuAndMaTour(maPhieu, maTour);
    }
    //
    public Boolean checkExistMaPhieuAndMaTourExtra(String maPhieu, String maTour, int soNguoi) {
        return dal.checkExistMaPhieuAndMaTourExtra(maPhieu, maTour, soNguoi);
    }
}
