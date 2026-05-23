package com.demo;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String getGreeting() {
        return "Hello from Java + Gradle CI/CD!";
    }

    public static void main(String[] args) {
        System.out.println(getGreeting());
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("10 - 4 = " + subtract(10, 4));
        System.out.println("6 x 7 = " + multiply(6, 7));
    }
}
