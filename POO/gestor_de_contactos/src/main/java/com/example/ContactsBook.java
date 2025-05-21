package com.example;
import java.util.*;

public class ContactsBook {
    public static void listAllContacts(List<Contact> contacts)
    {
        System.out.println();
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ". " + contacts.get(i).getName());
        }
    }

    public static void createContact(String name, int phone, String email, List<Contact> contactsList)
    {
        for (Contact contact : contactsList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("\n** ERROR: Este usuario ya existe **");
                return;
            }
        }
        Contact newContact = new Contact(name, phone, email);
        contactsList.add(newContact);
        System.out.println("-> Contacto añadido");
    }

    public static Contact findContact(String name, List<Contact> contactsList)
    {
        for (Contact contact : contactsList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
