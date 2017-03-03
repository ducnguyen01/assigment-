/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.ConnecDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Product;
import model.Category;






/**
 *
 * @author hoanghuynh
 */
public class CategoryDAO {


public ArrayList<Category> getListCategory() {
        Connection con = ConnecDB.getConnecttion();
        String sql = "SELECT * FROM LOAI_SP";
        ArrayList<Category> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setMaLoai(rs.getString("Ma_loai"));
                category.setLoaiSP(rs.getString("Loai_sp"));
                list.add(category);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    //Thêm
  public boolean insert(Category c) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnecttion();
         String sql = "INSERT INTO LOAI_SP VALUES(?,?)";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getMaLoai());
         ps.setString(2, c.getLoaiSP());
         return ps.executeUpdate()==1;
    } catch (SQLException e) {
         return false;
    }
}
  

public boolean update(Category c) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnecttion();
         String sql = "UPDATE LOAI_SP SET Loai_sp = ? WHERE Ma_loai = ?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getMaLoai());
         ps.setString(2, c.getLoaiSP());
         
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (SQLException e) {
         return false;
    }
}

public boolean delete(String MaLoai) throws SQLException {
    try {
        Connection connection = ConnecDB.getConnecttion();
        String sql = "DELETE FROM LOAI_SP WHERE Ma_sp = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, MaLoai);
        int temp = ps.executeUpdate();
            return temp == 1;
    } catch (SQLException e) {
        return false;
    }
}


    public static void main(String[] args) {
     CategoryDAO dao = new CategoryDAO();
        for (Category ds : dao.getListCategory()) {
            System.out.println(ds.getLoaiSP()+ " - " + ds.getMaLoai());
        }
    }
}
