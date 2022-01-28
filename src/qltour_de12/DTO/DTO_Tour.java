/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.DTO;

//import java.util.Date;

/**
 *
 * @author ASUS
 */
public class DTO_Tour {
    private String maTour;
    private String loTrinh;
    private String hanhTrinh;
    private int gia;

    public DTO_Tour(String maTour, String loTrinh, String hanhTrinh, int gia) {
        this.maTour = maTour;
        this.loTrinh = loTrinh;
        this.hanhTrinh = hanhTrinh;
        this.gia = gia;
    }

    public DTO_Tour(String maTour) {
        this.maTour = maTour;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getLoTrinh() {
        return loTrinh;
    }

    public void setLoTrinh(String loTrinh) {
        this.loTrinh = loTrinh;
    }

    public String getHanhTrinh() {
        return hanhTrinh;
    }

    public void setHanhTrinh(String hanhTrinh) {
        this.hanhTrinh = hanhTrinh;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
}
