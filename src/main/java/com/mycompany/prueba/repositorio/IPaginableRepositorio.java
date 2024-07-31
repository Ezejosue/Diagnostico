package com.mycompany.prueba.repositorio;

import java.util.List;

public interface IPaginableRepositorio<T> {
    public List<T> listar(int desde, int hasta);
}
