package sample;

import coding.problem11.Utility;
import model.Produs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static sample.Misc.Punct11;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //That can read two numbers from the keyboard. Second is the capacity of the store in total number of products
        int capacitate = Utility.readCapacity(scanner);

        // Can read words representing product names from the keyboard until you reach the first number read.
        int nrProduse;
        System.out.print("Numar produse= ");
        while ((nrProduse = scanner.nextInt()) > capacitate) {
            System.out.println("nrProduse must less than capacity");

        }
        System.out.println(nrProduse);
        Produs[] produse = new Produs[nrProduse];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < nrProduse; i++) {
            System.out.println("Produs");
            Produs produsNou = new Produs();
            produsNou.setNume(bufferedReader.readLine());
            produse[i] = produsNou;
            //produsNou.hashCode();

        }
        for (int i = 0; i < nrProduse; i++) {
            System.out.println(produse[i]);



        }
    }

}
