/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_qly.MANAGER;


public class Product {

     private String ma_SP ;
     private String ten_SP;
     private String product_image;
     private String don_vi_tinh;
     private int gia;
     private byte[] path;

//public Product(String ma_SP, String ten_SP, String product_image, String don_vi_tinh, int gia) {
//super();
//this.ma_SP = ma_SP;
//this.ten_SP = ten_SP;
//this.product_image = product_image;
//this.don_vi_tinh = don_vi_tinh;
//this.gia = gia;
//}

public String getProduct_image() {
return product_image;
}

public void setProduct_image(String product_image) {
this.product_image = product_image;
}

public byte[] getPath() {
return path;
}

public void setPath(byte[] path) {
this.path = path;
}



public String getMa_SP() {
return ma_SP;
}

public void setMa_SP(String ma_SP) {
this.ma_SP = ma_SP;
}

public String getTen_SP() {
return ten_SP;
}

public void setTen_SP(String ten_SP) {
this.ten_SP = ten_SP;
}

public String getproduct_image() {
return product_image;
}

public void setHinhAnh(String product_image) {
this.product_image = product_image;
}

public String getDon_vi_tinh() {
return don_vi_tinh;
}

public void setDon_vi_tinh(String don_vi_tinh) {
this.don_vi_tinh = don_vi_tinh;
}

public int getGia() {
return gia;
}

public void setGia(int gia) {
this.gia = gia;
}

}


