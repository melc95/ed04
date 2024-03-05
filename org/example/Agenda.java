package org.example;

import java.util.*;

/**
  *Clase que representa una agenda de contactos.
  */

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor de la clase Agenda .
     * Inicializa la lista de contactos como una lista vacía .
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }


     /**
      * Agrega un nuevo contacto a la agenda.Si el contacto ya existe, agrega el número de teléfono a la lista existente .
      * @param name El nombre del contacto.
      * @param phone El número de teléfono del contacto.
      */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda.
     * @param name El nombre del contacto que se va a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /** Modifica el número de teléfono de un contacto.
     * @param name El nombre del contacto del que se quiere modificar el número.
     * @param oldPhone El número de teléfono antiguo.
     * @param newPhone El número de teléfono nuevo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos de la agenda.
     * @return La lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}