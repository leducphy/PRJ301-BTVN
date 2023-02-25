/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Account;
import dto.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leducphi
 */
public class AccountDAO extends DBContext {

    public Account getAccountByUsernameAndPassword(String txtUsername, String txtPassword) {
        Account a = null;
        try {
            String sql = "select * from Account where username = ? and password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, txtUsername);
            ps.setString(2, txtPassword);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("account_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                int phone_number = rs.getInt("phone_number");
                String username = rs.getString("username");
                String password = rs.getString("password");
                a = new Account(id, name, address, phone_number, username, password);
            }

        } catch (SQLException e) {
        }
        return a;
    }
    
    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> list = new ArrayList<>();
        try {
            String sql = "select * from Account";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("account_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                int phone_number = rs.getInt("phone_number");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Account a = new Account(id, name, address, phone_number, username, password);
                list.add(a);
            }

        } catch (SQLException e) {
        }
        return list;
    }
    

    public int insertAccount(Account acc) {
        int result = 0;
        try {
            String sql = "insert into Account(name, address, phone_number, username, password) values (?, ?, ?, ?, ?) ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, acc.getName());
            ps.setString(2, acc.getAddress());
            ps.setInt(3, acc.getPhone_number());
            ps.setString(4, acc.getUsername());
            ps.setString(5, acc.getPassword());

            result = ps.executeUpdate();
        } catch (SQLException e) {
        }

        if (result != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//        Account acc = new Account(3, "Pham Dat", "Ha Noi", 123123123, "phamdat", "345");
        System.out.println(new AccountDAO().getAllAccount());
    }
}
