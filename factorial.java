package com;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0)
        {
            System.out.println("Factorial of 0 is: 1");
        }
        else {
            int answer = 1;
            for (int i = 2; i <= n; i++) {
                answer *= i;

            }
            System.out.println("Factorial of " + n + " is: " + answer);

        }
    }

}

