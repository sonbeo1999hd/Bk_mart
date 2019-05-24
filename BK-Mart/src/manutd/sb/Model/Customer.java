/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutd.sb.Model;

import java.util.Date;

/**
 *
 * @author SƠN ZAI
 */
public class Customer {

    private int id;
    private String name;
    private Date dateOfBirth; // ngày sinh
    private String gender; // giới tính
    private String address; // địa chỉ
    private String mail; 
    private String phone; 
    private String username;
    private String password;
    private String cart; // giỏ hàng
    
    
    public Customer() {
        
    }
    
    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Customer(int id, String name, Date dateOfBirth, String gender, String phone, String username, String password, String address, String mail, String cart) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.address = address;
        this.mail = mail;
        this.cart = cart;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + '}';
    }
    
    

}
