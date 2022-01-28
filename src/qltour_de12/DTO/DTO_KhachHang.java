/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.DTO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class DTO_KhachHang {

    private String maKH;
    private String hoTen;
    private String diaChi;

    public DTO_KhachHang(String maKH,String hoTen, String diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public DTO_KhachHang(String maKH) {
        this.maKH = maKH;
    }

    public DTO_KhachHang() {
        this.maKH = "";
        this.hoTen = "";
        this.diaChi = "";
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
    
    
}
