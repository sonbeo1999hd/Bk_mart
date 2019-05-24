/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutd.sb.Controller;

import java.util.Scanner;
import manutd.sb.Model.Product;

/**
 *
 * @author SƠN ZAI
 */
public class ProductController {
    public static Product[] enterData(int soluong){
        
        Product[] rs = new Product[soluong];
        for (int i = 0; i<soluong; i++) {
            int id = (int) longData("Nhap vao id: ");
            String name = stringData("Nhap vao ten san pham: ");
            rs[i] = new Product(id,name);
        }
        
        return rs; 
    }
    public static long longData(String mes){
        System.out.println(mes);       
        return new Scanner(System.in).nextLong();
    }

    public static double doubleData(String mes){
        System.out.println(mes);       
        return new Scanner(System.in).nextDouble();
    }
    public static String stringData(String mes){
        System.out.println(mes);       
        return new Scanner(System.in).nextLine();
    }
    public static boolean booleanData(String mes){
        System.out.println(mes);       
        return new Scanner(System.in).nextBoolean();
    }
    
}
