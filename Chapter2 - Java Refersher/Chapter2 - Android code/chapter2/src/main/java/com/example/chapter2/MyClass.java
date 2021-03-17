package com.example.chapter2;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello world !!!");
        System.out.println("Hello Faisal !!");

        String name = "This is my name";
        System.out.println(name);

        int a = 75 ;
        int b = 10 ;

        System.out.println(a + b);
        System.out.println(name.substring(1, 3));
        System.out.println(name.codePointAt(1));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Loops in java
        for (int i = 1; i <= 10; i ++){
            System.out.println( 5 * i);
        }
    }
}