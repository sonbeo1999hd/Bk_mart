/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutd.sb.Model;

/**
 *
 * @author SƠN ZAI
 */
public class WareHouse {
    private int id; // mã kho hàng
    private String address; // địa chỉ kho hàng
    private int total; // tổng sản phẩm trong kho
    private int totalIn; // số lượng nhập kho
    private int brokenProduct; // số lượng sản phẩm hỏng

    public WareHouse() {
    }

    public WareHouse(int id, String address, int total, int totalIn, int brokenProduct) {
        this.id = id;
        this.address = address;
        this.total = total;
        this.totalIn = totalIn;
        this.brokenProduct = brokenProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalIn() {
        return totalIn;
    }

    public void setTotalIn(int totalIn) {
        this.totalIn = totalIn;
    }

    public int getBrokenProduct() {
        return brokenProduct;
    }

    public void setBrokenProduct(int brokenProduct) {
        this.brokenProduct = brokenProduct;
    }
    
}
