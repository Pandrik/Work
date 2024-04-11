package org.example.Task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = Short.MAX_VALUE; //переменная длины массива
        int n = 1; //переменная кол-ва имен
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
        System.out.println("Список участников:");
        while (n > 1) {
            System.out.println(name[x]);
            x--;
            n--;
        }
    }
}


