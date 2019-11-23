package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        task1_loop1000();
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        task2(first, second);



    }

    public static void task1_loop1000() {
        for (int i = 1; i <= 1000; i+=5) {
            if (i == 5 || i == 55 || i == 555) {
                System.out.println(i);
            }
            if (i == 1000) {
                System.out.println(1000);
            }
        }

        int i = 1;
        while (i <= 1000) {
            if (i == 5 || i == 55 || i == 555) {
                System.out.println(i);
            }
            i+=5;
            if (i == 1000) {
                System.out.println(1000);
            }
        }

        i = 1;
        do {
            if (i == 5 || i == 55 || i == 555) {
                System.out.println(i);
            }
            i+=5;
            if (i == 1000) {
                System.out.println(1000);
            }
        }
        while (i <= 1000);
    }

    public static void task2(int first, int second) {
        for (int i = 1; i != second; i = i + first) {
            System.out.println(i);
        }
    }
}
