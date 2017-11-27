package com.part_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task_2");
        System.out.println("----------------------------------------");
        String name;
        int age;
        System.out.println("Введіть ваше ім'я");
        name = sc.nextLine();
        System.out.println("Введіть ваш вік");
        age = sc.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Отож, ");
        System.out.println("Вас звати - " + name);
        System.out.println("І");
        System.out.println("Вам - " + age + " років");
        System.out.println("----------------------------------------");
    }
}
