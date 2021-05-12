package com.company;

public class Main2 {
    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        System.out.println("a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a -= b;


        System.out.println("a = " + a + " b = " + b);

    }

}
