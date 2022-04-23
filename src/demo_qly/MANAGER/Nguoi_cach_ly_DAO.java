/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_qly.MANAGER;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Nguoi_cach_ly_DAO {
    List<Nguoi_cach_ly> lsNg = new ArrayList<>();

public int add(Nguoi_cach_ly ng){
    lsNg.add(ng);
    return 1;
}

public int count(){
    return lsNg.size();
}

public Nguoi_cach_ly findByID(String ma_nguoi_LQ){
 for (Nguoi_cach_ly Ngg : lsNg){
   if (Ngg.getMa_nguoi_LQ().equalsIgnoreCase(ma_nguoi_LQ) )
    { return Ngg;}
}
return null;
}
 public int edit(Nguoi_cach_ly Ng){
     for (Nguoi_cach_ly cl: lsNg){
      if (cl.getMa_nguoi_LQ().equalsIgnoreCase(Ng.getMa_nguoi_LQ())){
         cl.setHo_LQ(Ng.getHo_LQ());
         cl.setTen_LQ(Ng.getTen_LQ());
         cl.setCMND_CCCD(Ng.getCMND_CCCD());
         cl.setnamSinh(Ng.getnamSinh());
         cl.setdiaChi(Ng.getdiaChi());
         cl.settrangThai(Ng.gettrangThai());
         cl.setnoiDieuTri(Ng.getnoiDieuTri());
         cl.setlienQuanDenAi(Ng.getlienQuanDenAi());
         cl.setlichsuTrangThai(Ng.getlichsuTrangThai());
         return 1;
         }
         }
return -1;
}
  public int del (String ma_nguoi_LQ){
   Nguoi_cach_ly Ng = findByID( ma_nguoi_LQ);
   if (Ng != null){
      lsNg.remove(Ng);
      return 1;
}
    return -1;
}

public Nguoi_cach_ly getOneNguoicachlyAtPostion(int pos){
    return lsNg.get(pos);
}

public List<Nguoi_cach_ly> getAllNCL(){
   return lsNg;
}

}


