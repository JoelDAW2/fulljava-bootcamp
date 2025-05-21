package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Contact> contactsList = new ArrayList<>();

        Contact c1 = new Contact("Jorge", 603568345, "jorge@gmail.com");
        Contact c2 = new Contact("Lorena", 620648767, "lorelore@gmail.com");
        Contact c3 = new Contact("Jonathan", 612224983, "jon4than@gmail.com");
        
        contactsList.add(c1);
        contactsList.add(c2);
        contactsList.add(c3);

        boolean n = true;

        System.out.println("<<< CONTACTOS >>>");
        
        do{
            System.out.println("\n1. Listar contactos");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");

            System.out.print("\n-> Seleccione una opción: ");
            
            int option = scanner.nextInt();
            
            if (option < 1 || option > 4) {
                System.out.println("\n** ERROR: Opción fuera de rango **");
            }
            else 
            {
                Scanner sca = new Scanner(System.in);
                switch(option) {
                    case 1:
                        ContactsBook.listAllContacts(contactsList);
                        break;
                    case 2:
                        System.out.print("-> Nombre: ");
                        String newName = sca.nextLine();
                        
                        System.out.print("-> Número de teléfono: ");                
                        int newPhone = scanner.nextInt();
                        
                        System.out.print("-> Correo electrónico: ");                
                        String newEmail = sca.nextLine();
                        
                        ContactsBook.createContact(newName, newPhone, newEmail, contactsList);
                        break;
                    case 3:
                        System.out.print("\n-> Buscar contacto: ");
                        String existingContact = sca.nextLine();
                        Contact foundContact = ContactsBook.findContact(existingContact, contactsList);
                        if (foundContact != null) {
                            System.out.println("\nContacto encontrado: ");
                            System.out.println();
                            System.out.println("Nombre: " + foundContact.getName());
                            System.out.println("Teléfono: " + foundContact.getPhone());
                            System.out.println("Correo electrónico: " + foundContact.getEmail());
                        }
                        else
                        {
                            System.out.println("** ERROR: Usuario no encontrado **");
                        }

                        break;
                    case 4:
                        n = false;
                        break;
                }
            }
        }
        while(n != false);
    }
}