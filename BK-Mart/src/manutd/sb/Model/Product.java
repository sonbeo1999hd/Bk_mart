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
public class Product {
    private int id; //  mã sản phẩm
    private String name; // tên sản phẩm
    private String picture; // ảnh sản phẩm
    private String introduction; // giới thiệu sản phẩm
    private String detail; // chi tiết sản phẩm
    private String vendor; // nhà cung cấp
    private Date expiryDate; // hết hạn sử dụng
    private int quantityBought; // so luong đã bán
    public int quantityAvailable; // số lượng hàng có sẵn
    private double purchasePrice; // giá mua
    private double salePrice; // giá bán
    public double MSRP; // gia niêm yết
    private float scale; // phần trăm giảm giá
    private String idWareHouse; // kho hàng
    public String vote; // đánh giá từ khách hàng

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, double MSRP) {
        this.id = id;
        this.name = name;
        this.MSRP = MSRP;
    }

    public Product(int id, String name, String picture, String introduction, String detail, String vendor, Date expiryDate, int quantityBought, int quantityAvailable, double purchasePrice, double salePrice, float scale, String idWareHouse) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.introduction = introduction;
        this.detail = detail;
        this.vendor = vendor;
        this.expiryDate = expiryDate;
        this.quantityBought = quantityBought;
        this.quantityAvailable = quantityAvailable;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.scale = scale;
        this.idWareHouse = idWareHouse;
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantityBought() {
        return quantityBought;
    }

    public void setQuantityBought(int quantityBought) {
        this.quantityBought = quantityBought;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getMSRP() {
        return MSRP;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public String getWareHouse() {
        return idWareHouse;
    }

    public void setWareHouse(String idWareHouse) {
        this.idWareHouse = idWareHouse;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + '}';
    }
    public boolean equalsId(Object obj){
        boolean rs = false;
        if(this==obj){
            rs= true;
        }else if(obj instanceof Product){
            Product p = (Product) obj;
            if(p.getId() == this.getId()){
                rs = true;
            }
        }
        return rs;
    }
    public boolean equalsName(Object obj){
        boolean rs = false;
        if(this == obj){
            rs =true;
        }else if(obj instanceof Product){
            Product p = (Product) obj;
            if(p.getName() == this.getName()){
                rs = true;
            }
        }
        return rs;
        
    }
}
