package com.mycompany.prueba.test_ventas;

import com.mycompany.prueba.implementacion.ProductoCRUD;
import com.mycompany.prueba.modelos.Product;
import com.mycompany.prueba.repositorio.CRUDCentralization;
import com.mycompany.prueba.repositorio.Direccion;

import java.util.List;

public class ProductCRUDGeneric {
    public static void main(String[] args) {
//
//        // Crear una instancia del repositorio
//        CRUDCentralization<Product> repository = new ProductoCRUD();
//
//        // Creat y agregar productos
//        repository.crear(new Product("Laptop", 1000.0));
//        repository.crear(new Product("Mouse", 10.0));
//        repository.crear(new Product("Keyboard", 20.0));
//        repository.crear(new Product("Monitor", 200.0));
//
//        // listar los productos
//        List<Product> products = repository.listar();
//        products.forEach(System.out::println);
//
//        System.out.println("==== paginable ====");
//        // Listar productos de manera paginada
//        List<Product> paginable = repository.listar(1, 4);
//        paginable.forEach(System.out::println);
//
//        System.out.println("==== ordenar ====");
//        // Listar productos ordenados por nombre en orden ascendente
//        List<Product> productsOrderAsc = repository.listar("productName", Direccion.ASC);
//        for (Product p : productsOrderAsc) {
//            System.out.println(p);
//        }
//
//        System.out.println("==== editar ====");
//        // Editar un producto existente
//        Product laptopUpdate = new Product("Laptop ACER", 1200.0);
//        laptopUpdate.setId(1); // Asignar el ID del producto a actualizar
//        repository.editar(laptopUpdate);
//
//        // Obtener un producto por su ID y mostrarlo en la consola
//        Product laptop = repository.porId(1);
//        System.out.println(laptop);
//        System.out.println("================");
//
//        // Listar productos ordenados por precio en orden ascendente
//        repository.listar("price", Direccion.ASC).forEach(System.out::println);
//        System.out.println("================");
//
//        // Eliminar un producto por su ID
//        repository.eliminar(2);
//
//        // Listar todos los productos y mostrarlos en la consola
//        repository.listar().forEach(System.out::println);
//        System.out.println("======= TOTAL ========");
//
//        System.out.println("Total de productos: " + repository.total());
    }
}
