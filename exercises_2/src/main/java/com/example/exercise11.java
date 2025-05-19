package com.example;

public class exercise11 {
    public static int countWords(String phrase)
    {
        int counter = 0;
        String[] parts = phrase.split(" ");
        for (int i = 0; i < parts.length; i++) {
            counter++;
        }
        return counter;
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

    private static void testCountWords(String phrase, int numOfWords)
    {
        if(!assertEquals(countWords(phrase), numOfWords))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }
    public static void main(String[] args) {
        testCountWords("Hola mundo", 2);
        testCountWords("Hola mundo", 3);
        testCountWords("La Formacion de java empieza a las 9", 8);
        testCountWords("La Formacion de java empieza a las 9", 2);
        testCountWords("La formacion de java termina cada dia a la misma hora", 11);
    }
}
