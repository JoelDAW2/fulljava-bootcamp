package com.example;

public class exercise10 {
    public static boolean  advancedPalindrom(String phrase)
    {
        String joinedPhrase = "";
        String[] parts = phrase.split(" ");
        
        for(String word : parts) {
            joinedPhrase += word;
        }

        String reversedStr = "";
        for (int i = 0; i < joinedPhrase.length(); i++) {
            reversedStr = joinedPhrase.charAt(i) + reversedStr;
        }

        if(joinedPhrase.toLowerCase().equals(reversedStr.toLowerCase()))
        {
            return true;
        }
        return false;
    }

    private static boolean assertEquals(Boolean expected, Boolean actual)
    {
        return expected.equals(actual);
    }

    private static void testPalindromWord(String word, Boolean reversedPalindrom)
    {
        if(!assertEquals(advancedPalindrom(word), reversedPalindrom))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }
    public static void main(String[] args) {
        testPalindromWord("Amo la paloma", true);
        testPalindromWord("Mañana es martes", false);
    }
}
