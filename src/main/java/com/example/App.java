package com.example;

public final class App {

    public static int sum(int a, int b){
        return a+b;
    }

    public static boolean checkEven(int a){
        return (a % 2 == 0) ? true : false;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 30;

        System.out.println(sum(a, b));
        System.out.println((checkEven(sum(a, b))) ? "Even" : "Odd");
    }
}
