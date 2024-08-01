package com.mycompany.prueba.repositorio;

import com.mycompany.prueba.modelos.Order;
import com.mycompany.prueba.modelos.Product;

public interface IOrden {
    void crear(Order order);

    void editar(Order order);

    void eliminar(Integer id);

    void addProduct(Order order, Product product);

    Order porId(Integer id);

    Double calculateOrderTotal(Order order);

    void mostrarOrden(Order order);
}
