package com.mycompany.prueba.modelos;

import java.util.Objects;

/**
 * Clase base para entidades con un identificador único.
 */
public class BaseEntity {
    protected Integer id;

    private static int ultimoId;

    /**
     * Constructor que asigna un ID único a cada instancia.
     */
    public BaseEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Compara esta entidad con otra para verificar si son iguales.
     *
     * @param obj el objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        BaseEntity baseEntity = (BaseEntity) obj;

        return Objects.equals(id, baseEntity.id);
    }

    /**
     * Calcula el código hash de la entidad.
     *
     * @return el código hash de la entidad
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
