package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //long, int, byte, float, double, boolean, char,
        //String str;
        int a;
        System.out.println("Вкажіть значення");
        Scanner in = new Scanner(System.in);
        a =  in.nextInt();
        if(a==12)
            System.out.println("Найкраща оцінка");
        else
            System.out.println("Треба підтягуватися");
    }
}