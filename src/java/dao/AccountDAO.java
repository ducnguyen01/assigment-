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
import model.Account;


/**
 *
 * @author hoanghuynh
 */
public class AccountDAO {
     public ArrayList<Account> getListAccounts(String Username) throws SQLException {
        Connection con = ConnecDB.getConnecttion();
        String sql = "SELECT * FROM TAI_KHOAN WHERE Username = '" + Username + "'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Account> list = new ArrayList<>();
        while (rs.next()) {
            Account account = new Account();
            account.setTendangnhap(rs.getString("Username"));
            account.setMatKhau(rs.getString("Pass"));
            account.setVaitro(rs.getString("Vai_tro"));
            account.setHoTen(rs.getString("Ho_ten"));
            account.setDiaChi(rs.getString("Dia_chi"));
            account.setEmail(rs.getString("Email"));
            account.setSoDienThoai(rs.getString("Sdt"));
            
            list.add(account);
        }
        return list;
    }
      public boolean insert(Account c) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnecttion();
         String sql = "INSERT INTO TAI_KHOAN VALUES(?,?,?,?,?,?,?)";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getTendangnhap());
         ps.setString(2, c.getMatKhau());
         ps.setString(3, c.getVaitro());
         ps.setString(4, c.getHoTen());
         ps.setString(5, c.getDiaChi());
         ps.setString(6, c.getEmail());
         ps.setString(7, c.getSoDienThoai());
         
         return ps.executeUpdate()==1;
    } catch (SQLException e) {
         return false;
    }
      
}
}