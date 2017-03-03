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

/**
 *
 * @author hoanghuynh
 */
public class ProductDAO {

    public ArrayList<Product> getListProductByCategory(String Ma_loai) throws SQLException {
        Connection connection = ConnecDB.getConnecttion();
        String sql = "SELECT * FROM SAN_PHAM WHERE Ma_loai = '" + Ma_loai + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setMaSP(rs.getString("Ma_sp"));
            product.setTenSP(rs.getString("Ten_sp"));
            product.setMoTa(rs.getString("Mo_ta"));
            product.setSoLuong(rs.getInt("So_luong"));
            product.setDonGia(rs.getInt("Don_gia"));
            product.setHinhAnh(rs.getString("Hinh_anh"));
            product.setNhaSanXuat(rs.getString("Nha_sx"));
            product.setMaLoai(rs.getString("Ma_loai"));
            list.add(product);
        }
        return list;
    }
    //Thêm
  public boolean insert(Product p) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnecttion();
         String sql = "INSERT INTO SAN_PHAM VALUES(?,?,?,?,?,?,?,?)";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, p.getMaSP());
         ps.setString(2, p.getTenSP());
         ps.setString(3, p.getMoTa());
         ps.setInt(4, p.getSoLuong());
         ps.setDouble(5, p.getDonGia());
         ps.setString(6, p.getHinhAnh());
         ps.setString(7, p.getNhaSanXuat());
         ps.setString(8, p.getMaLoai());
         
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (SQLException e) {
         return false;
    }
}
  

public boolean update(Product p) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnecttion();
         String sql = "UPDATE SAN_PHAM SET Ten_sp = ?, Mo_ta = ?,So_luong = ?,Don_gia = ?,Hinh_anh = ?,Nha_sx = ?,Ma_loai = ? WHERE Ma_sp = ?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, p.getMaSP());
         ps.setString(2, p.getTenSP());
         ps.setString(3, p.getMoTa());
         ps.setInt(4, p.getSoLuong());
         ps.setDouble(5, p.getDonGia());
         ps.setString(6, p.getHinhAnh());
         ps.setString(7, p.getNhaSanXuat());
         ps.setString(8, p.getMaLoai());
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (SQLException e) {
         return false;
    }
}

public boolean delete(long category_id) throws SQLException {
    try {
        Connection connection = ConnecDB.getConnecttion();
        String sql = "DELETE FROM category WHERE Ma_sp = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, category_id);
        int temp = ps.executeUpdate();
            return temp == 1;
    } catch (SQLException e) {
        return false;
    }
}

    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
        for (Product p : dao.getListProductByCategory("sp001")) {
            System.out.println(p.getMaLoai() + "---" + p.getTenSP());
        }
    }
}
