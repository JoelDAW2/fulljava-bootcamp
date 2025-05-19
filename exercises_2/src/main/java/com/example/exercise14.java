package com.example;

public class exercise14 {
    public static boolean findTheWord(String phrase, String word)
    {
        String[] words = phrase.split(" ");
        for (String w : words) {
            if(w.toLowerCase().equals(word.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }
    
    private static boolean assertEquals(Boolean expected, Boolean actual)
    {
        return expected.equals(actual);
    }

    private static void testFindTheWord(String phrase, String word, Boolean b)
    {
        if(!assertEquals(findTheWord(phrase, word), b))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }
    public static void main(String[] args) {
       testFindTheWord("Hola mundo", "mundo", true);
       testFindTheWord("La clase de java empieza a las 9 de la mañana", "JAVA", true);
       testFindTheWord("La clase de java empieza a las 9 de la mañana", "spider-man", false);
    }
}
