package com.mycompany.prueba.repositorio;

public interface CRUDCentralization<T> extends IOrdenableRepositorio<T>, IPaginableRepositorio<T>, CRUDRepositorio<T>, IContableRepositorio {
}
