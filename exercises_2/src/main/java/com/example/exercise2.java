package com.example;

public class exercise2 {
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

    private static boolean assertEquals(Boolean expected, Boolean actual)
    {
        return expected.equals(actual);
    }

    private static void testPalindromWord(String word)
    {
        if(!assertEquals(palindromWord(word), true))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }
    public static void main(String[] args) {
        testPalindromWord("hola");
    }
}