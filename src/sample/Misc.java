package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Misc {
    public static int point_i_readNumber(Scanner scanner) {
        System.out.print("Enter number :");
        return scanner.nextInt();
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i+=2) {
            System.out.println(generateLine(size - i, i/2, size));
        }
        if(size %2 == 0) {
            System.out.println(generateLine(1, size / 2, size));
        }
    }

    public static String generateLine(int nr_stars, int nr_spaces, int size) {
        String stars = "";
        String spaces = "";
        for (int i = 0; i < nr_stars; i++) {
            stars += "*";
        }

        for (int i = 0; i < nr_spaces; i++) {
            spaces += " ";
        }

        return (size % 2 == 0 ? spaces + " ": spaces) + stars + spaces;
    }

    public static void task1_loop1000() {
        for (int i = 1; i <= 1000; i += 5) {
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
            i += 5;
            if (i == 1000) {
                System.out.println(1000);
            }
        }

        i = 1;
        do {
            if (i == 5 || i == 55 || i == 555) {
                System.out.println(i);
            }
            i += 5;
            if (i == 1000) {
                System.out.println(1000);
            }
        }
        while (i <= 1000);
    }

    public static void Punct11(Scanner scan) {
        //Read a seuqnce of numbers separated by space. Print the sum of them and product. Also the difference between the biggest and the smallest.
        System.out.println("Dati numerele: ");
        String sirNumere = scan.nextLine();
        String[] sirArrays = sirNumere.split(" ");
        int[] arrays = new int[sirArrays.length];
        for (int i = 0; i < sirArrays.length; i++) {
            String x = sirArrays[i];
            arrays[i] = Integer.parseInt(x);
            System.out.println("index[" + i + "]= " + arrays[i]);
        }
        int sum = 0;
        int prod = 1;
        for (int i : arrays) {
            sum = sum + i;
            prod = prod * i;
        }
        System.out.println("suma este: " + sum);
        System.out.println("produsul este: " + prod);
    }

    public static void task2(int first, int second) {
        for (int i = 1; i != second; i = i + first) {
            System.out.println(i);
        }
    }
}
