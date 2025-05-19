package com.example;
import java.util.ArrayList;

public class exercise5 {
    // EJERCICIO 5
    /* public static void reverseArray(int[] array)
    {
        int[] initialArray = array;
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i]);
        }
    } */

   public static void reverseArray(int[] array)
    {   
        ArrayList<Integer> reversedArray = new ArrayList<Integer>();

        for(int num : array) {
            System.out.println(num);
        }

        /* for (int i = array.length; i > 0; i--) {
            // reversedArray.add(array[i]);
            System.out.println(array[i]);
        } */
        for(int num : reversedArray) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] listOfNums = new int[]{1, 2, 3};
        reverseArray(listOfNums);
    }
}