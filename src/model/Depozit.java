package model;

import java.util.ArrayList;
import java.util.List;

public class Depozit {
    private int capacitateInterna;
    private List<Produs> produse;

    public Depozit(int capacitate) {
        capacitateInterna = capacitate;
        produse = new ArrayList<>();
    }
}
