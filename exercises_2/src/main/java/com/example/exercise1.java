package com.example;

public class exercise1 {
    public static int factorialNumber(int num)
    {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static boolean assertEquals(int expected, int actual)
    {
        if(expected == actual)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static void testFactorialNumber(int factorialNum, int result)
    {
        if(!assertEquals(factorialNumber(factorialNum), result))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }
    public static void main(String[] args) {
        testFactorialNumber(1, 1);
        testFactorialNumber(2, 2);
        testFactorialNumber(3, 6);
        testFactorialNumber(4, 24);
        testFactorialNumber(5, 120);
        testFactorialNumber(6, 720);
        testFactorialNumber(7, 5040);
        testFactorialNumber(8, 40320);

    }
}