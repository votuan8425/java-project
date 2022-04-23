/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_qly.MANAGER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ThongKeDAOImpl implements ThongKeDao {
      @Override
    public List<Nguoi_cach_ly> getListByNCL() {
        String sql = "SELECT noi_dieu_tri, COUNT(*) as so_luong FROM Nguoi_lq_covid GROUP BY noi_dieu_tri";
        List<Nguoi_cach_ly> list = new ArrayList<>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection cons = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = cons.createStatement();
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nguoi_cach_ly lopHocBean = new Nguoi_cach_ly();
                lopHocBean.settrangThai(rs.getString("trang_thai"));
                lopHocBean.setnoiDieuTri(rs.getString("noi_dieu_tri"));
                list.add(lopHocBean);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
