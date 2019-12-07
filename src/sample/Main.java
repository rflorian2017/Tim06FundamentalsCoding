package sample;

import coding.problem11.Utility;
import model.Depozit;
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
        nrProduse = scanner.nextInt();

        System.out.println(nrProduse);
        Produs[] produse = new Produs[nrProduse];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Depozit dep = new Depozit(capacitate);

        for (int i = 0; i < nrProduse; i++) {
            System.out.println("Produs");
            Produs produsNou = new Produs();
            produsNou.setNume(bufferedReader.readLine());
            System.out.println("Dati si cantitatea");
            produsNou.setNumar(Integer.parseInt(bufferedReader.readLine()));
            produse[i] = produsNou;
            //produsNou.hashCode();

        }
        for (int i = 0; i < nrProduse; i++) {
            System.out.println(produse[i]);
        }
        for (int i = 0; i < nrProduse; i++) {
            System.out.println(produse[i]);
            System.out.println("Cate vrei ?: ");
            int cantitate = Integer.parseInt(bufferedReader.readLine());
            produse[i].setNumar(produse[i].getNumar() - cantitate);
            dep.addProdus(produse[i], cantitate);
        }
        //Can read numbers representing quantities of each product read at the previous step.
        // Careful to the capacity

    }

}
