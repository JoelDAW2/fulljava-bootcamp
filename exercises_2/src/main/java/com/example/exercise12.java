package com.example;

public class exercise12 {
    public static String replaceChar(String phrase)
    {
        String newPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == 'a')
            {
                newPhrase += "@";
            }
            else 
            {
                newPhrase += phrase.charAt(i);
            }     
        }
        return newPhrase;
    }

    private static boolean assertEquals(String expected, String actual)
    {
        return expected.equals(actual);
    }

    private static void testReplaceChar(String phrase, String expectedPhrase)
    {
        if(!assertEquals(replaceChar(phrase), expectedPhrase))
        {
            System.out.println("Test failed!");
        }
        else 
        {
            System.out.println("Test completed!");
        }
    }
    public static void main(String[] args) {
        testReplaceChar("Hola mundo", "Hol@ mundo");
        testReplaceChar("A las 9 de la mañana", "A l@s 9 de l@ m@ñ@n@");
        testReplaceChar("Caracola", "C@r@col@");
        testReplaceChar("Caracola", "C@r@col@");
    }
}
