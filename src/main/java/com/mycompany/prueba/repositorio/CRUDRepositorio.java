package com.mycompany.prueba.repositorio;

import java.util.List;

public interface CRUDRepositorio<T> {
    List<T> listar();

    T porId(Integer id);

    void crear(T t);

    void editar(T t);

    void eliminar(Integer id);
}
