package com.mycompany.prueba.implementacion;

import com.mycompany.prueba.modelos.Order;
import com.mycompany.prueba.repositorio.IOrdenInterface;

import java.util.List;

public class OrdenCRUD implements IOrdenInterface {

    @Override
    public Double calularTotal() {
        return null;
    }

    @Override
    public void mostrarOrden() {

    }

    @Override
    public List<Order> listar() {
        return List.of();
    }

    @Override
    public Order porId(Integer id) {
        return null;
    }

    @Override
    public void crear(Order order) {

    }

    @Override
    public void editar(Order order) {

    }

    @Override
    public void eliminar(Integer id) {

    }
}
