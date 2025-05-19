package com.example;
import java.util.ArrayList;
import java.util.Arrays;

public class exercise5 {
   public static void reverseArray(int[] array)
    {   
        ArrayList<Integer> reversedArray = new ArrayList<Integer>();
        // String orderedArray = "[";

        for (int i = array.length - 1; i >= 0; i--) {
            // orderedArray += Integer.toString(array[i]);
            reversedArray.add(array[i]);
        }
        // orderedArray += "]";
        // System.out.println(orderedArray);
        String result = reversedArray.toString();

        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }
/* 
    private static boolean assertEquals(Boolean expected, Boolean actual)
    {
        return expected.equals(actual);
    }

    private static void testReverseArrau(String word)
    {
        if(!assertEquals(reverseArray(array), true))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    } */

    public static void main(String[] args) {
        int[] listOfNums = { 6, 7, 8, 0, 2, 6, 8 };
        reverseArray(listOfNums);
    }
}