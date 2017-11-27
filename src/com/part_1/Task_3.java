package com.part_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task_4");
        int m , n = 0;
        System.out.println("Введіть змінну m ");
        m = sc.nextInt();
        System.out.println("Змінна m = " + m);
        if (m > 0)
        {
            n = 1;
        }
        else if ( m == 0){
            n = 0;
        }
        else if (m < 0){
            n = -1;
        }
        System.out.println("Змінна n = " + n);
        System.out.println("----------------------------------------");
    }
}
