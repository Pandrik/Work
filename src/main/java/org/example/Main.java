package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = Short.MAX_VALUE;
        int n = 1;
        boolean exit = false;
        String[] name = new String[x + 1];
        while (!exit) {
            System.out.println("Введите имя " + n + " участника или exit");
            name[x] = console.nextLine();
            if (name[x].equalsIgnoreCase("exit")) {
                break;
            }
            x--;
            n++;
        }

        x = Short.MAX_VALUE;                   //вывод имен по порядку с 1 по n
        while (n > 1) {

            System.out.println(name[x]);
            x--;
            n--;
        }
    }
}




