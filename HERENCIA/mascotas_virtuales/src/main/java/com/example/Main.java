package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner optionScanner = new Scanner(System.in);
        boolean p = false;
        VirtualPet selectedVirtualPet;

        VirtualDog vDog = new VirtualDog(10, 20, "Pluto");
        VirtualCat vCat = new VirtualCat(5, 10, "Doraemon");
        VirtualHamster vHamster = new VirtualHamster(5, 5, "Hamtaro");

        System.out.println("<<< MASCOTAS VIRTUALES >>>");

        System.out.println("-> SELECCIONA TU MASCOTA");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Hamster");
        System.out.print("-> Selecciona una opción: ");
        int opt = optionScanner.nextInt();

        if(opt == 1)
        {
            selectedVirtualPet = vDog;
        }
        else if(opt == 2)
        {
            selectedVirtualPet = vCat;
        }
        else
        {
            selectedVirtualPet = vHamster;
        }

        System.out.print("\nMASCOTA SELECCIONADA: " + selectedVirtualPet.name + "\n");

        do { 
            System.out.println("\nSELECCIONA UNA ACCIÓN: ");
            Scanner actionOpt = new Scanner(System.in);
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Mostrar estado");
            System.out.println("4. Dejar de jugar");
            System.out.print("-> Selecciona una opción: ");
            int action = actionOpt.nextInt();
            System.out.println();

            switch (action) {
                case 1:
                    selectedVirtualPet.eat();
                    break;
                case 2:
                    selectedVirtualPet.play();
                    break;
                case 3:
                    selectedVirtualPet.showState();
                    break;
                case 4:
                    p = true; 
                    break;
            }
        } while (!p);
    }
}