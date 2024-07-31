package com.mycompany.prueba.implementacion;

import com.mycompany.prueba.modelos.Product;
import com.mycompany.prueba.repositorio.AbstracListRepositorio;
import com.mycompany.prueba.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoCRUD extends AbstracListRepositorio<Product> {

    @Override
    public void editar(Product product) {
        Product p = porId(product.getId());
        if (p != null) {
            p.setProductName(product.getProductName());
            p.setPrice(product.getPrice());
        }
    }

    @Override
    public List<Product> listar(String campo, Direccion dir) {
        List<Product> lista = new ArrayList<>(this.dataSource);
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


    public static int Ordenar(String campo, Product a, Product b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "productName" -> resultado = a.getProductName().compareTo(b.getProductName());
            case "price" -> resultado = a.getPrice().compareTo(b.getPrice());
        }
        return resultado;
    }
}
