/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_qly.MANAGER;

import java.util.List;

public class ThongKeServiceImpl implements ThongKeService{

private ThongKeDao thongKeDAO = null;

    public ThongKeServiceImpl() {
        this.thongKeDAO = new ThongKeDAOImpl();
    }

    public List<Nguoi_cach_ly> getListByNCL() {
        return thongKeDAO.getListByNCL();
    }
}
