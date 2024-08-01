package com.mycompany.prueba.repositorio;

import com.mycompany.prueba.modelos.Order;
import com.mycompany.prueba.modelos.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstracListOrder implements IOrden {
    private List<Order> orders;

    public AbstracListOrder() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void crear(Order order) {
        orders.add(order);
    }

    @Override
    public void editar(Order order) {
        Order existingOrder = porId(order.getId());
        if (existingOrder != null) {
            int index = orders.indexOf(existingOrder);
            orders.set(index, order);
        }
    }

    @Override
    public void eliminar(Integer id) {
        orders.removeIf(order -> order.getId().equals(id));
    }

    @Override
    public void addProduct(Order order, Product product) {
        if (order.getProductCounter() < Order.MAX_PRODUCTS) {
            order.getProducts()[order.getProductCounter()] = product;
            order.setProductCounter(order.getProductCounter() + 1);
        } else {
            System.out.println("La cantidad máxima de productos que se puede ingresar es: " + Order.MAX_PRODUCTS);
        }
    }

    @Override
    public Double calculateOrderTotal(Order order) {
        double total = 0.0;
        for (int i = 0; i < order.getProductCounter(); i++) {
            total += order.getProducts()[i].getPrice();
        }
        return total;
    }

    @Override
    public void mostrarOrden(Order order) {
        System.out.println("Orden #" + order.getId());
        System.out.println("Cliente: " + order.getCustomer());
        System.out.println("Fecha: " + order.getDate());
        System.out.println("Productos: ");
        for (int i = 0; i < order.getProductCounter(); i++) {
            System.out.println("  - " + order.getProducts()[i]);
        }
        System.out.println("Total: $" + calculateOrderTotal(order));
    }

    @Override
    public Order porId(Integer id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public void listar() {
        for (Order order : orders) {
            mostrarOrden(order);
        }
    }


}
