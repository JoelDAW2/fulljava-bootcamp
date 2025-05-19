package com.example;

public class exercise13 {
    public static void primeNumbersInRange(int a, int b)
    {
        int low = a, high = b;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
            {
                System.out.print(low + " ");
            }

            ++low;
        }
    }

    public static void main(String[] args) {
        primeNumbersInRange(10, 20);
    }
}
