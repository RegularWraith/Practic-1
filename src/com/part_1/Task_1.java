package com.part_1;
import java.util.Scanner;
public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task_1");
        System.out.println("----------------------------------------");
        System.out.println("Введіть змінну а ");
        int a = sc.nextInt();
        System.out.println("Введіть змінну b ");
        int b = sc.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Змінна a = " + a);
        System.out.println("Змінна b = " + b);
        System.out.println("----------------------------------------");
        int sum , difference , multiplication , division;
        sum = a + b;
        difference = a - b;
        multiplication = a * b;
        division = a / b;
        System.out.println("Сума змінних a + b = " + sum);
        System.out.println("Різниця a - b = " + difference);
        System.out.println("Множення a * b = " + multiplication);
        System.out.println("Ділення a / b = " + division);
        System.out.println("----------------------------------------");
    }
}
