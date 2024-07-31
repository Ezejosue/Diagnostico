package com.mycompany.prueba.test_ventas;

import com.mycompany.prueba.implementacion.ClienteCRUD;
import com.mycompany.prueba.modelos.Customer;
import com.mycompany.prueba.repositorio.CRUDCentralization;
import com.mycompany.prueba.repositorio.Direccion;
import com.mycompany.prueba.repositorio.PaymentType;

public class CustomerCRUDGeneric {
    public static void main(String[] args) {
        CRUDCentralization<Customer> repository = new ClienteCRUD();

        // Crear y agregar clientes
        repository.crear(new Customer("Josue Avalos", PaymentType.CASH));
        repository.crear(new Customer("Gabriela Alas", PaymentType.CREDIT));
        repository.crear(new Customer("Juan Perez", PaymentType.CASH));
        repository.crear(new Customer("Maria Lopez", PaymentType.CREDIT));

        // Listar los clientes
        repository.listar().forEach(System.out::println);

        System.out.println("==== paginable ====");
        // Listar clientes de manera paginada
        repository.listar(1, 4).forEach(System.out::println);

        System.out.println("==== ordenar ====");
        // Listar clientes ordenados por nombre en orden ascendente
        repository.listar("customerName", Direccion.ASC).forEach(System.out::println);

        System.out.println("==== editar ====");
        // Editar un cliente existente
        Customer josueUpdate = new Customer("Josue Avalos Alas", PaymentType.CREDIT);
        josueUpdate.setId(1); // Asignar el ID del cliente a actualizar
        repository.editar(josueUpdate);

        // Obtener un cliente por su ID y mostrarlo en la consola
        Customer josue = repository.porId(1);
        System.out.println(josue);
        System.out.println("================");

        // Listar clientes ordenados por tipo de pago en orden ascendente
        repository.listar("paymentType", Direccion.ASC).forEach(System.out::println);
        System.out.println("================");

        // Eliminar un cliente por su ID
        repository.eliminar(2);

        // Listar todos los clientes y mostrarlos en la consola
        repository.listar().forEach(System.out::println);
        System.out.println("======= TOTAL ========");

        System.out.println("Total de clientes: " + repository.total());
    }
}
