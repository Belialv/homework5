package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = x.nextInt();
        System.out.println("Введите второе число:");
        double b = x.nextInt();
        System.out.println("Введите третье число:");
        double c = x.nextInt();
        System.out.println("Введите степень для выражения (a + b):");
        int p = x.nextInt();
        double d = Math.abs(a - b) / Math.pow((a + b), p) - Math.sqrt(c);
        System.out.println("Результат решения Вашего выражения:" + d);

    }
}
