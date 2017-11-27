package com.part_2;
import java.util.Scanner;
import java.lang.*;
public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("Введіть висоту піраміди");
        int q = sc.nextInt();
        System.out.println("----------------------------------------");
        for (int i = 0, o = 1; i < q; i++, o += 2) {
            System.out.print("|");
            for (int p = 0; p < o; p++)
                System.out.print(" * ");
            System.out.println("|");

        }
    }
}