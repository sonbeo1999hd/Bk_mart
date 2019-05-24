/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutd.sb.Model;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author SƠN ZAI
 */
public class Order {
    private int id; // id đơn hàng
    public Date day; // ngày đặt hàng
    public int quantity; // số lượng sản phẩm
    public double totalMoney; // tổng tiền đơn hàng
    public Customer customer; // khách hàng đặt
    public Product[] product; // danh sách sản phẩm đặt trong đơn hàng
    public Seller seller; // người bán
    public Employee employee; // nhân viên 
    public String typeShip; // hình thức vận chuyển
    public String htThanhToan; // hình thức thanh toán
    public String idSale; // mã giảm giá

    public Order() {
    }

    public Order(int id, Date day, int quantity, double totalMoney, Customer customer, Product[] product, Employee employee, String typeShip, String htThanhToan, String idSale) {
        this.id = id;
        this.day = day;
        this.quantity = quantity;
        this.totalMoney = totalMoney;
        this.customer = customer;
        this.product = product;
        this.employee = employee;
        this.typeShip = typeShip;
        this.htThanhToan = htThanhToan;
        this.idSale = idSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTypeShip() {
        return typeShip;
    }

    public void setTypeShip(String typeShip) {
        this.typeShip = typeShip;
    }

    public String getHtThanhToan() {
        return htThanhToan;
    }

    public void setHtThanhToan(String htThanhToan) {
        this.htThanhToan = htThanhToan;
    }

    public String getIdSale() {
        return idSale;
    }

    public void setIdSale(String idSale) {
        this.idSale = idSale;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customer=" + customer + ", seller=" + seller + ", employee=" + employee + '}';
    }
    
    
}
