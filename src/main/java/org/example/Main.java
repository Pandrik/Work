package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = 1;
        int n = 1;
        //boolean exit;
        //exit = console.nextLine().equalsIgnoreCase("exit");
        System.out.println("Введите имя 1 участника. Или exit");
        boolean exit;
        exit = console.nextLine().equalsIgnoreCase("exit");
        while (console.hasNextLine()) {
            String[] name = new String[100];
            if (!exit) {
                name[x] = console.nextLine();
                x++;
                System.out.println("Введите имя " + x + " участника. Или exit");
            } else break;
            System.out.println(name[1]);
        }


    }
}

