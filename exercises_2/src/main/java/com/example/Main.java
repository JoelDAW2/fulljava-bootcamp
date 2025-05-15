package com.example;
import java.util.Random;

public class Main {
    // EJERCICIO 1
    /* public static int factorialNumber(int num)
    {   
        int factorialNumber = 1;
        for (int i = 1; i <= num; i++) {
            factorialNumber = factorialNumber * 1;  
        }
        return factorialNumber;
    } */
    // EJERCICIO 2
    public static Boolean palindromWord(String word)
    {   
        String reversedStr = "";
        for (int i = 0; i < word.length(); i++) {
            reversedStr = word.charAt(i) + reversedStr;
        }
        if(word.equals(reversedStr))
        {
            return true;
        }
        return false;
    }
    // EJERCICIO 3
    public static int vocals(String phrase)
    {
        int vocalsCount = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.println(phrase.toLowerCase());

        for (int n = 0; n < phrase.length(); n++) {
            if(phrase.toLowerCase().charAt(n) == 'a')
            {
                a++;
            }
            else if(phrase.toLowerCase().charAt(n) == 'e')
            {
                e++;
            }
            else if(phrase.toLowerCase().charAt(n) == 'i')
            {
                i++;
            }
            else if(phrase.toLowerCase().charAt(n) == 'o')
            {
                o++;
            }
            else if(phrase.toLowerCase().charAt(n) == 'u')
            {
                u++;
            }
        }
        System.err.println("A: " + a);
        System.err.println("E: " + e);
        System.err.println("I: " + i);
        System.err.println("O: " + o);
        System.err.println("U: " + u);

        vocalsCount = a + e + i + o + u;
        return vocalsCount;
    }
    // EJERCICIO 4
    public static int maxNum(int nums[])
    {
        int actualNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > actualNum)
            {
                actualNum = nums[i];
            }
        }
        return actualNum;
    }
    // EJERCICIO 5
    /* public static void reverseArray(int[] array)
    {
        int[] initialArray = array;
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i]);
        }
    } */

    // EJERCICIO 6
    /* public static int[] orderArray(int[] array)
    {
        int count;
        for (int i = 0; i < array.length; i++) {
            count = i;
            if(array[i])
        }
    } */

   // EJERCICIO 7
   public static int calculator(int a, int b, char c)
   {
        switch(c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
   }
    // EJERCICIO 8
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
    // EJERCICIO 9
    public static int extendCalculator(int a, char c)
    {
        switch(c) {
            case 'r':
                return a;
            default:
                return 0;
        }
    }
    
    public static void main(String[] args) {
    }
}