package com.mycompany.prueba.repositorio;

import java.util.List;

public interface IOrdenableRepositorio<T> {
    public List<T> listar(String campo, Direccion dir);
}
