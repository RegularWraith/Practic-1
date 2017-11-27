package com.part_2;

import static java.lang.Math.*;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task_1");
        System.out.println("----------------------------------------");
        System.out.println("Введіть радіус круга");
        int radius = sc.nextInt();
        double perimeter, area;
        perimeter = 2 * PI * radius;
        System.out.println("Периметр круга = " + perimeter);
        area= PI * pow ( radius , 2 );
        System.out.println("Площа = " + area);
        System.out.println("----------------------------------------");

        System.out.println("Task_4");
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("Task_4");
        System.out.println("----------------------------------------");
        System.out.println("     *    ");
        System.out.println("   * * *  ");
        System.out.println(" * * * * *");
    }
}
