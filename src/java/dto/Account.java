/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author leducphi
 */
public class Account {
    int account_id;
    String name;
    String address;
    int phone_number;
    String username;
    String password;

    public Account() {
    }

    public Account(int account_id, String name, String address, int phone_number, String username, String password) {
        this.account_id = account_id;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "account_id=" + account_id + ", name=" + name + ", address=" + address + ", phone_number=" + phone_number + ", username=" + username + ", password=" + password + '}' + '\n';
    }
    
    
}
