package com.mycompany.prueba.repositorio;

import com.mycompany.prueba.modelos.Order;
import com.mycompany.prueba.modelos.Product;

public interface IOrdenInterface extends CRUDRepositorio<Order> {
    Double calularTotal();
    void mostrarOrden();
}
