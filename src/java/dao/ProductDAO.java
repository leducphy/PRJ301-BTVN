/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leducphi
 */
public class ProductDAO extends DBContext {

    public Product getProductByID(int pid) {
        Product p = null;
        try {
            String sql = "select * from Product where product.id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                p = new Product(id, name, price, quantity);
            }

        } catch (SQLException e) {
        }
        return p;
    }

    public ArrayList<Product> getProductByName(String pname) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product where product.name like '%" + pname + "%'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                Product p = new Product(id, name, price, quantity);
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public ArrayList<Product> getProducts() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                Product p = new Product(id, name, price, quantity);
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new ProductDAO().getProductByName("sam").toString());
    }
}
