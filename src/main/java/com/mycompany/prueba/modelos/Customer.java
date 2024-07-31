/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.modelos;

import com.mycompany.prueba.repositorio.PaymentType;

/**
 * @author PC
 */
public class Customer extends BaseEntity {

    private String customerName;
    private PaymentType paymentType;

    public Customer(String customerName, PaymentType paymentType) {
        super();
        this.customerName = customerName;
        this.paymentType = paymentType;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer: ID: " + id
                + ", Name: " + customerName
                + ", Payment Type: " + paymentType;
    }
}
