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
public class Seller {

    private int id;
    private String name;
    public String picture; 
    private Date dateOfBirth;
    private String phone;
    private String address;
    private String email;
    private String CMT; // chứng minh thư
    private String accountBank; // tài khoản ngân hàng
    private String username;
    private String password;
    public int vote; // lượt đánh giá
    public String comment; // bình luận
    public boolean status; // trạng thái
    public String timeOpen; // thời gian mở cửa

    public Seller() {
    }

    public Seller(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Seller(int id, String name, String picture, Date dateOfBirth, String phone, String address, String email, String CMT, String accountBank, String username, String password, int vote, String comment, boolean status, String timeOpen) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.CMT = CMT;
        this.accountBank = accountBank;
        this.username = username;
        this.password = password;
        this.vote = vote;
        this.comment = comment;
        this.status = status;
        this.timeOpen = timeOpen;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
