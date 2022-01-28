/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.DTO;

/**
 *
 * @author ASUS
 */
public class DTO_ChiTiet {
    private String maPhieu;
    private String maTour;
    private String oldMaTour;

    private int soNguoi;

    public DTO_ChiTiet() {
    }

    public DTO_ChiTiet(String maPhieu, String maTour, int soNguoi) {
        this.maPhieu = maPhieu;
        this.maTour = maTour;
        this.soNguoi = soNguoi;
    }
    
    public DTO_ChiTiet(String maPhieu, String maTour, int soNguoi, String oldMaTour) {
        this.maPhieu = maPhieu;
        this.maTour = maTour;
        this.soNguoi = soNguoi;
        this.oldMaTour = oldMaTour;
    }
    
    public DTO_ChiTiet(String maPhieu) {
        this.maPhieu = maPhieu;
    }
    
    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }
    
    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }
    
    public String getOldMaTour() {
        return oldMaTour;
    }

    public void setOldMaTour(String oldMaTour) {
        this.oldMaTour = oldMaTour;
    }
}
