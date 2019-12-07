package sample;

import coding.problem11.Utility;

import java.util.Scanner;

import static sample.Misc.Punct11;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        //That can read two numbers from the keyboard. Second is the capacity of the store in total number of products
       int capacitate = Utility.readCapacity( scanner );
        //Can read words representing product names from the keyboard until you reach the first number read. }

        int nrProduse;
        System.out.println("nrProduse");
        while((nrProduse = scanner.nextInt()) > capacitate){
            System.out.println("nrProduse must be less than capacity");
        }
        System.out.println(nrProduse);
        String [] produse = new String[nrProduse];






    }
}
