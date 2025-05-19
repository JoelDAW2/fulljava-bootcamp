package com.example;

public class exercise15 {
    public static String calculateDegrees(double num, char n)
    {
        double c; // Celsius
        double f; // Fahrenheit
        double k; // Kelvin

        String result = "";

        switch(n) {
            case 'C':
                f = (num * (9.0 / 5.0)) + 32;
                k = num + 273.15;
                result = Double.toString(f) + "ºF / " + Double.toString(k) + "ºK"; 
                break;
            case 'F':
                c = (num - 32) * (5.0 / 9.0);
                k = (num - 32) * 5.0 / 9.0 + 273.15;
                result = Double.toString(c) + "ºC / " + Double.toString(k) + "ºK";
                break;
            case 'K':
                c = num - 273.15;
                f = (num - 273.15) * 9.0 / 5.0 + 32;
                result = Double.toString(c) + "ºC / " + Double.toString(f) + "ºF";
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        String calculo = calculateDegrees(100, 'K');
        System.out.println("CONVERSION: " + calculo);
    }
}
