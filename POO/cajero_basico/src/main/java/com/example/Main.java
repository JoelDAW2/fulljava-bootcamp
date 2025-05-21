package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount1 = new BankAccount("Victor", 2000);
        boolean n = true;
        
        System.out.println("-> BIENVENIDO AL CAJERO: ");
        
        do{
            System.out.println("\n-> 1. Depositar saldo");
            System.out.println("-> 2. Retirar saldo");
            System.out.println("-> 3. Consultar saldo");
            System.out.println("-> 4. Salir");

            System.out.print("\nSeleccione una opción: ");
            int option = scanner.nextInt();

            switch(option) {
            case 1:
                System.out.print("\nIntroduzca el importe: ");
                int i = scanner.nextInt();
                bankAccount1.addBalance(i);
                break;
            case 2:
                System.out.print("\nIntroduzca el importe: ");
                int j = scanner.nextInt();
                bankAccount1.substractBalance(j);                break;
            case 3:
                System.out.println("\nSaldo actual: " + bankAccount1.getBalance() + " euros");
                break;
            case 4:
                n = false;
                break;
            }
        }
        while(n != false);
    }
}