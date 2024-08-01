package com.mycompany.prueba.test_ventas;

import com.mycompany.prueba.implementacion.ClienteCRUD;
import com.mycompany.prueba.implementacion.OrdenCRUD;
import com.mycompany.prueba.implementacion.ProductoCRUD;
import com.mycompany.prueba.modelos.Customer;
import com.mycompany.prueba.modelos.Order;
import com.mycompany.prueba.modelos.Product;
import com.mycompany.prueba.repositorio.AbstracListOrder;
import com.mycompany.prueba.repositorio.CRUDCentralization;
import com.mycompany.prueba.repositorio.IOrden;
import com.mycompany.prueba.repositorio.PaymentType;

import java.util.Date;

public class OrderCRUDGeneric {
    public static void main(String[] args) {
        // Crear una instancia del repositorio
        CRUDCentralization<Product> repositoryProduct = new ProductoCRUD();

        // Creat y agregar productos
        repositoryProduct.crear(new Product("Laptop", 1000.0));
        repositoryProduct.crear(new Product("Mouse", 10.0));
        repositoryProduct.crear(new Product("Keyboard", 20.0));
        repositoryProduct.crear(new Product("Monitor", 200.0));

        // Listar los productos
        repositoryProduct.listar().forEach(System.out::println);
        System.out.println("=======================================");

        CRUDCentralization<Customer> repositoryCustomer = new ClienteCRUD();
        // Crear y agregar clientes
        repositoryCustomer.crear(new Customer("Josue Avalos", PaymentType.CASH));
        repositoryCustomer.crear(new Customer("Gabriela Alas", PaymentType.CREDIT));
        repositoryCustomer.crear(new Customer("Juan Perez", PaymentType.CASH));
        repositoryCustomer.crear(new Customer("Maria Lopez", PaymentType.CREDIT));

        // Listar los clientes
        repositoryCustomer.listar().forEach(System.out::println);

        System.out.println("=======================================");


        // Crear una instancia del repositorio
        AbstracListOrder repositoryOrder = new OrdenCRUD();

        // Crear una orden
        repositoryOrder.crear(new Order(repositoryCustomer.porId(6)));

        //Añaadir productos a la orden
        repositoryOrder.addProduct(repositoryOrder.porId(9), repositoryProduct.porId(1));
        repositoryOrder.addProduct(repositoryOrder.porId(9), repositoryProduct.porId(2));
        repositoryOrder.addProduct(repositoryOrder.porId(9), repositoryProduct.porId(3));
        repositoryOrder.addProduct(repositoryOrder.porId(9), repositoryProduct.porId(4));

        //Mostar la orden
        repositoryOrder.mostrarOrden(repositoryOrder.porId(9));


    }
}
