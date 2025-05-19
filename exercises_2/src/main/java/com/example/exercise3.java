package com.example;

public class exercise3 {
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

    private static boolean assertEquals(int expected, int actual)
    {
        //return expected.equals(actual);
        if(expected == actual)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    private static void testVocals(String word, int num)
    {
        if(!assertEquals(vocals(word), num))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }

    public static void main(String[] args) {
        testVocals("hola", 7);
        testVocals("hola", 1);
        testVocals("adeu", 8);
        testVocals("adeu", 3);
    }
}