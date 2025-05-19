package com.example;

public class exercise7 {
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

    private static boolean assertEquals(int num1, int num2)
    {
        if(num1 == num2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static void testCalculator(int num1, int num2, char c)
    {
        if(!assertEquals(calculator(num1, num2, c), 10))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }

    public static void main(String[] args) {
        testCalculator(5, 5, '+');
        testCalculator(3, 8, '+');
        testCalculator(20, 10, '-');
        testCalculator(20, 2, '/');
    }
}
