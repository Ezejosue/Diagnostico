package com.mycompany.prueba.repositorio;

import com.mycompany.prueba.modelos.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstracListRepositorio<T extends BaseEntity> implements CRUDCentralization<T> {
    protected List<T> dataSource;

    /**
     * Constructor que inicializa la fuente de datos como una lista vacía.
     */
    public AbstracListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    /**
     * Lista todos los elementos en la fuente de datos.
     *
     * @return una lista de todos los elementos
     */
    @Override
    public List<T> listar() {
        return dataSource;
    }

    /**
     * Busca un elemento por su ID.
     *
     * @param id el ID del elemento a buscar
     * @return el elemento si se encuentra, null en caso contrario
     */
    @Override
    public T porId(Integer id) {
        for (T t : dataSource) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Crea un nuevo elemento en la fuente de datos.
     *
     * @param t el elemento a crear
     */
    @Override
    public void crear(T t) {
        dataSource.add(t);
    }

    /**
     * Edita un elemento existente en la fuente de datos.
     *
     * @param t el elemento a editar
     */
    @Override
    public void editar(T t) {
        T t1 = porId(t.getId());
        if (t1 != null) {
            t1 = t;
        }
    }

    /**
     * Elimina un elemento existente en la fuente de datos.
     *
     * @param id el ID del elemento a eliminar
     */
    @Override
    public void eliminar(Integer id) {
        T t = porId(id);
        if (t != null) {
            dataSource.remove(t);
        }
    }

    /**
     * Lista los elementos de manera paginada.
     *
     * @param desde el índice inicial (incluido)
     * @param hasta el índice final (excluido)
     * @return una lista de los elementos en el rango especificado
     */
    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    /**
     * Cuenta el número total de elementos en la fuente de datos.
     *
     * @return el número total de elementos
     */
    @Override
    public int total() {
        return dataSource.size();
    }


}
