package com.example;

public class exercise9 {
    // --->>>>>> NO ACABADO
    public static double calculator(int a, String c)
    {
        double result = 0;
        switch(c) {
            case "cuadrada":
                result = Math.sqrt(a);
                break;

            case "potencia":
                double num = 1;
                for (int i = 0; i < a; i++) {
                    result = num * a;
                }
                break;
            
            case "modulo":
                break;
            default:
                return 0;
        }
        return result;
    }
    public static void main(String[] args) {
    
    }
}
