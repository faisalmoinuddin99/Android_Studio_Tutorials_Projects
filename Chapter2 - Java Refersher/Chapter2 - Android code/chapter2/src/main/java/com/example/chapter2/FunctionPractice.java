package com.example.chapter2;

public class FunctionPractice {

    public static double avg (int a, int b ,int c) {
        return (a + b + c) / 3.0 ;
    }
    public static void main(String[] args) {
        int a  = 65 ;
        int b =  5 ;
        int c = 78 ;


        System.out.println( avg(a,b,c));

        ClassEx ce = new ClassEx();
        ce.method1();
    }
}
