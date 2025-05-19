package com.example;
import java.util.Random;

public class exercise8 {
    
    public static String passwordGenerator(int num)
    {
            Random r = new Random();
            String password = "";
            char[] array = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                                'h', 'i', 'j', 'k', 'l', 'm', 'n', 
                                'o', 'p', 'q', 'r', 's', 't', 'u',
                                'v', 'w', 'x', 'y', 'z', 'A', 'B', 
                                'C', 'D', 'E', 'F', 'G', 'H', 'I', 
                                'J', 'K', 'L', 'M', 'N', 'O', 'P', 
                                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 
                                'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}; 

            for (int i = 0; i < num; i++) {
                int randomPos = r.nextInt(61);
                password += array[randomPos];
            }

            return password;
    }

    public static void main(String[] args) {
        String password = passwordGenerator(8);
        System.out.print("CONTRASEÑA CIFRADA: " + password);
    }
}
