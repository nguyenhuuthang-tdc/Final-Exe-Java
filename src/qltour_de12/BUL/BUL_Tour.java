/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.BUL;

import java.sql.ResultSet;
import java.sql.SQLException;
import qltour_de12.DAL.DAL_Tour;
import qltour_de12.DTO.DTO_Tour;

/**
 *
 * @author ASUS
 */
public class BUL_Tour {
    DAL_Tour dal = new DAL_Tour();
    
    //Lấy tấy cả dữ liệu
    public ResultSet getAllTour() throws SQLException{
        return dal.getAllTour();
    }
    
    //Thêm dữ liệu
    public Boolean InsertTour(DTO_Tour obj) throws SQLException{
        return dal.InsertTour(obj);
    }
    
     //Cập nhật dữ liệu
    public Boolean UpdateTour(DTO_Tour obj) throws SQLException{
        return dal.UpdateTour(obj);
    }
    
    //Xóa tour
    public Boolean DeleteTour(DTO_Tour id) throws SQLException {
        return dal.DeleteTour(id);
    }
    
    public Boolean checkIDTour(String id){
        return dal.checkIDTour(id);
    }
}
