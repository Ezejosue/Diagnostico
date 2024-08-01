package com.mycompany.prueba.implementacion;

import com.mycompany.prueba.modelos.Order;
import com.mycompany.prueba.repositorio.AbstracListOrder;
import com.mycompany.prueba.repositorio.IOrden;

import java.util.ArrayList;
import java.util.List;

public class OrdenCRUD extends AbstracListOrder {

    @Override
    public void editar(Order order) {
        Order o = porId(order.getId());
        if (o != null) {
            o.setCustomer(order.getCustomer());
            o.setProducts(order.getProducts());
            o.setDate(order.getDate());
            o.setProductCounter(order.getProductCounter());
        }
    }


}
