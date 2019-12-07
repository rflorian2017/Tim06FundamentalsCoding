package model;

import java.util.ArrayList;
import java.util.List;

public class Depozit {
    private int capacitateInterna;
    private List<Produs> produse;
    private List<Integer> cantitati;

    public Depozit(int capacitate) {
        capacitateInterna = capacitate;
        produse = new ArrayList<>();
        cantitati = new ArrayList<>();
    }

    public boolean addProdus(Produs produs, int cantitate) {
        if (cantitate <= capacitateInterna) {
            produse.add(produs);
            cantitati.add(cantitate);
            capacitateInterna = capacitateInterna - cantitate;
        } else {

            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        String textToReturn = "";
        for (int i = 0; i < produse.size(); i++) {
            textToReturn = textToReturn + produse.get(i) + ":" + cantitati.get(i) + "\n";
        }
        return textToReturn;
    }
}
