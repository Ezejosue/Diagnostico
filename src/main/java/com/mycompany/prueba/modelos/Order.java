package com.mycompany.prueba.modelos;

import java.util.Arrays;
import java.util.Date;

public class Order extends BaseEntity {

    private Product[] products;
    private Customer customer;
    private Date date;
    private int productCounter;
    public static final int MAX_PRODUCTS = 10;

    public Order(Customer customer) {
        super();
        this.customer = customer;
        this.products = new Product[MAX_PRODUCTS];
        this.date = new Date();
    }

    public Product[] getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public int getProductCounter() {
        return productCounter;
    }

    public void setProductCounter(int productCounter) {
        this.productCounter = productCounter;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "products=" +
                Arrays.toString(products)
                + ", customer=" + customer + ", date=" + date + ", productCounter=" + productCounter + '}';
    }

}
