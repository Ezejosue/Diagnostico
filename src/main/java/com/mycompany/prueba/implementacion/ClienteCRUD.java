package com.mycompany.prueba.implementacion;

import com.mycompany.prueba.modelos.Customer;
import com.mycompany.prueba.repositorio.AbstracListRepositorio;
import com.mycompany.prueba.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteCRUD extends AbstracListRepositorio<Customer> {

    @Override
    public void editar(Customer customer) {
        Customer c = porId(customer.getId());
        if (c != null) {
            c.setCustomerName(customer.getCustomerName());
            c.setPaymentType(customer.getPaymentType());
        }
    }

    @Override
    public List<Customer> listar(String campo, Direccion dir) {
        List<Customer> lista = new ArrayList<>(this.dataSource);
        lista.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = Ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = Ordenar(campo, b, a);
            }
            return resultado;
        });
        return lista;
    }

    public static int Ordenar(String campo, Customer a, Customer b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "customerName" -> resultado = a.getCustomerName().compareTo(b.getCustomerName());
            case "paymentType" -> resultado = a.getPaymentType().compareTo(b.getPaymentType());
        }
        return resultado;
    }
}
