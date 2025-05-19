package com.example;

public class exercise4 {
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

    private static void testMaxNum(int[] nums, int num)
    {
        if(!assertEquals(maxNum(nums), num))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }

    public static void main(String[] args) {
        int[] numsList = {1, 2, 3, 5};
        testMaxNum(numsList, 5);
        testMaxNum(numsList, 2);
    }
}