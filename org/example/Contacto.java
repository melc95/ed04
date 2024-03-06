package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto en una agenda.
 */

class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Contacto
     * @param name El nombre del contacto.
     * @param phone El número de teléfono del contacto
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Método para obtener el nombre del contacto.
     * @return el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método para obtener la lista de teléfonos del contacto.
     * @return La lista de teléfonos del contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}