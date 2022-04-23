/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_qly.MANAGER;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Nguoi_cach_ly {
    private String ma_nguoi_LQ;
    private String ho_LQ;  
    private String ten_LQ;
    private int CMND_CCCD;
    private int namSinh;   
    private String diaChi;
    private String trangThai;
    private String noiDieuTri;
    private String lienQuanDenAi;
    private String lichsuTrangThai;                 

    public Nguoi_cach_ly(String ma_nguoi_LQ, String ho_LQ, String ten_LQ, int CMND_CCCD, int namSinh, String diaChi, String trangThai, String noiDieuTri, String lienQuanDenAi, String lichsuTrangThai) {
        this.ma_nguoi_LQ = ma_nguoi_LQ;
        this.ho_LQ = ho_LQ;
        this.ten_LQ = ten_LQ;
        this.CMND_CCCD = CMND_CCCD;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.noiDieuTri = noiDieuTri;
        this.lienQuanDenAi = lienQuanDenAi;
        this.lichsuTrangThai = lichsuTrangThai;
    }
    Nguoi_cach_ly(){};





    public String getMa_nguoi_LQ() {
        return ma_nguoi_LQ;
    }

    public void setMa_nguoi_LQ(String ma_nguoi_LQ) {
        this.ma_nguoi_LQ = ma_nguoi_LQ;
    }

    public String getHo_LQ() {
        return ho_LQ;
    }

    public void setHo_LQ(String ho_LQ) {
        this.ho_LQ = ho_LQ;
    }

    public String getTen_LQ() {
        return ten_LQ;
    }

    public void setTen_LQ(String ten_LQ) {
        this.ten_LQ = ten_LQ;
    }

    public int getCMND_CCCD() {
        return CMND_CCCD;
    }

    public void setCMND_CCCD(int CMND_CCCD) {
        this.CMND_CCCD = CMND_CCCD;
    }

    public int getnamSinh() {
        return namSinh;
    }

    public void setnamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String gettrangThai() {
        return trangThai;
    }

    public void settrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getnoiDieuTri() {
        return noiDieuTri;
    }

    public void setnoiDieuTri(String noiDieuTri) {
        this.noiDieuTri = noiDieuTri;
    }

    public String getlienQuanDenAi() {
        return lienQuanDenAi;
    }

    public void setlienQuanDenAi(String lienQuanDenAi) {
        this.lienQuanDenAi = lienQuanDenAi;
    }

    public String getlichsuTrangThai() {
        return lichsuTrangThai;
    }

    public void setlichsuTrangThai(String lichsuTrangThai) {
        this.lichsuTrangThai = lichsuTrangThai;
    }

    public String toString(){
          return 
               "Ma nguoi lien quan covid: " +this.ma_nguoi_LQ
               + "Ho :" + this.ho_LQ
               + "Ten: "+ this.ten_LQ
               + "CMND/CCCD" + this.CMND_CCCD
               + "Nam sinh: "+this.namSinh
               + "Dia chi: " + this.diaChi
               + "Trang thai: "+this.trangThai
               + "Noi dieu tri: "+this.noiDieuTri
               + "Lien quan den ai: "+this.lienQuanDenAi
               + "Lich su qua trinh: "+this.lichsuTrangThai;
    }
}