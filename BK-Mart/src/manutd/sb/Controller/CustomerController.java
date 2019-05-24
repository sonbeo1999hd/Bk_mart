/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutd.sb.Controller;

import manutd.sb.Model.Product;

/**
 *
 * @author SƠN ZAI
 */
public class CustomerController {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(0);
        product.setName("abc");
        product.setDetail("asdjhhjashdg");

        Product product2 = new Product(0, "Xe VINFAST");
        Product product3 = new Product(0, "Xe VINFAST 2", 100000);
        System.out.println(product3.MSRP);
        System.out.println(product3.getMSRP());
        System.out.println(product3.getName());
        System.out.println(product3.getId());
        System.out.println(product3.getDetail());

        product3.setDetail("Xe may dien cua VIN");
        System.out.println(product3.getDetail());

    }
}
