package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = 30;
        int n = 1;
        boolean exit = false;
        String[] name = new String[x];
        while (!exit) {
            System.out.println("Введите имя " + n + " участника или exit");
            name[x - 1] = console.nextLine();
            if (name[x - 1].equalsIgnoreCase("exit")) {
                break;
            }
            x--;
            n++;
        }
        System.out.println(x);
        System.out.println(n);
        while (n > 1) {
            x++;
            n--;
        }
    }
}




