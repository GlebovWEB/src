package com.pb.Hliebov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите число х");
        x = scan.nextInt();
        int y;
        System.out.println("Введите число у");
        y = scan.nextInt();
        String sign;
        System.out.println("выбирите действие");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Данное действие не возможно");
                } else {
                    System.out.println(x / y);
                }
                break;
        }

    }

}