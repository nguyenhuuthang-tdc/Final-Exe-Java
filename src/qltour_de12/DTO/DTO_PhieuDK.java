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
public class DTO_PhieuDK {
    private String maPhieu;
    private Date ngDK;
    private String maKH;

    public DTO_PhieuDK(String maPhieu, Date ngDK, String maKH) {
        this.maPhieu = maPhieu;
        this.ngDK = ngDK;
        this.maKH = maKH;
    }

    public DTO_PhieuDK(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public DTO_PhieuDK(String maPhieu, Date ngDK) {
        this.maPhieu = maPhieu;
        this.ngDK = ngDK;
    }

    public DTO_PhieuDK() {
        this.maPhieu = "";
        this.maKH = "";
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getNgDK() {
        return ngDK;
    }

    public void setNgDK(Date ngDK) {
        this.ngDK = ngDK;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
     
    
    
}
