/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.modelos;

import java.util.Date;

/**
 * @author PC
 */
public class Order extends BaseEntity {

    private Product[] products;
    private Customer customer;
    private Date date;
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;

    public Order(Customer customer) {
        super();
        this.customer = customer;
        this.products = new Product[MAX_PRODUCTS];
        this.date = new Date();
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        if (productCounter < MAX_PRODUCTS) {
            this.products[productCounter++] = product;
        } else {
            System.out.println("La cantidad máxima de productos que se puede ingresar es: " + MAX_PRODUCTS);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCounter; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Orden #" + id);
        System.out.println("Cliente: " + customer);
        System.out.println("Fecha: " + date);
        System.out.println("Productos: ");
        for (int i = 0; i < productCounter; i++) {
            System.out.println("  - " + this.products[i]);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
