package org.example;

import org.example.Model.Category;
import org.example.Model.Order;
import org.example.Model.Product;
import org.example.Model.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        User user = new User(1,"Şeyhmus","Erol","erol.sehmus1@gmail.com","tobeto");
        Product product = new Product(1,"İphone 14 Pro Max", 52.999,79,1);
        Category category = new Category(1,"Telefon");
        Order order = new Order(1,1,"01-08-2023", "05-08-2023");


        user.info();
        product.info();
        category.info();
        order.info();


        System.out.println("Commitleme sıras geldi");








    }
}