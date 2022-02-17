package com;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        int rem=0;
        while(temp>0) {
            rem = temp % 10;
            temp /= 10;
            sum += rem * rem * rem;
        }
        if(sum==n) {
            System.out.println("Amstrong number");
        }
        else {
            System.out.println("Not a Amstrong number");
        }
    }
}
