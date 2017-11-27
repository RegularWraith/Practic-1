package com.part_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рік");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
            System.out.println("Рік високосний");
        }else {
            System.out.println("Рік не високосний");
        }
    }
}
