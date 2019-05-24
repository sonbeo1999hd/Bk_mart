/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutd.sb.Controller;

import manutd.sb.Model.Customer;
import manutd.sb.Model.Employee;
import manutd.sb.Model.Order;
import manutd.sb.Model.Product;
import manutd.sb.Model.Seller;

/**
 *
 * @author SƠN ZAI
 */
public class Main {

    public static void main(String[] args) {
//        Product[] products = ProductController.enterData(2);
//        for (int i = 0; i<products.length; i++) {
//            System.out.println(products[i].toString());
//           
//        }
//        Product p1 = new Product(1, "abc");
//        Product p2 = new Product(2, "abc");
        
        Seller seller = new Seller(1, "Tuan");
        System.out.println(seller.toString());
        Employee employee = new Employee(17, "Nam");
        System.out.println(employee.toString());
        Customer customer = new Customer(119201, "Nghia");
        System.out.println(customer.toString());
        Order order = new Order();
        order.setId(1);
        order.setEmployee(employee);
        order.setCustomer(customer);
        order.setSeller(seller);
        System.out.println(order.toString());
    }
}
