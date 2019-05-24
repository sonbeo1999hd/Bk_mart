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
public class Employee {

    private int id;
    private Date dateOfBirth;
    private String picture; 
    private boolean status; // trạng thái đang làm việc hay ko
    private String name;
    private String phone;
    private String CMT; // chứng minh thư
    private String accountBank; // tài khoản ngân hàng
    private String address;
    private String email;
    private String username;
    private String password;
    

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, Date dateOfBirth, String picture, boolean status, String name, String phone, String CMT, String accountBank, String address, String email, String username, String password) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.picture = picture;
        this.status = status;
        this.name = name;
        this.phone = phone;
        this.CMT = CMT;
        this.accountBank = accountBank;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Employee{" + "id=" + id + ", name=" + name + '}';
    }
    

    

}
