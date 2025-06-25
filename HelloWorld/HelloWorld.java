import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        
        // EJERCICIO 1
        System.out.println("---> EJERCICIO 1: HELLO WORLD");
        System.out.println("Hello, World!");
        System.out.println();
        // EJERCICIO 2
        System.out.println("---> EJERCICIO 2: SUMAR DOS NUMEROS");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = input.nextInt(); 
        System.out.print("La suma de los números es: " +  (num1 + num2));
        System.out.println();
        // EJERCICIO 3
        System.out.println("---> EJERCICIO 3: NUMEROS PRIMOS");
        System.out.print("Introduce un número mayor que 0: ");
        int num3 = input.nextInt();
        if(num3 % 2 == 0)
        {
            System.out.println("Número primo");
        } else {
            System.out.println("Número no primo");
        } 
        // EJERCICIO 4   
        System.out.println("---> EJERCICIO 3: FIZZ BUZZ");
        System.out.print("Introduce un número mayor a 0: ");
        int num4 = input.nextInt();
        for (int i = 0; i < num4; i++) {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.err.print(" FizzBuzz ");
            } 
            else if (i % 3 == 0) 
            {
                System.err.print(" Fizz ");                
            }
            else if(i % 5 == 0) 
            {
                System.err.print(" Buzz ");
            }
            else
            {
                System.err.print(" " + i + " ");
            }
        }
    }
}