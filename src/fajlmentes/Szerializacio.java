package fajlmentes;

import java.util.ArrayList;

public class Szerializacio {
    
    ArrayList<Kartya> kartyak = new ArrayList<>();
    
    public static void main(String[] args) {
        new Szerializacio().feladat();
    }

    private void feladat() {
        feltoltes();
        tartalom("feltöltés után:");
        szerializalas();
        
        kartyak = null;
        tartalom("üres");
        
        deszerializalas();
        tartalom("visszaolvasva:");
    }

    private void feltoltes() {
        Kartya k1 = new Kartya("K1", "V1");
        Kartya k2 = new Kartya("K2", "V2");
        
        kartyak.add(k1);
        kartyak.add(k2);
    }

    private void tartalom(String feltöltés_után) {
        
    }

    private void szerializalas() {
        
    }

    private void deszerializalas() {
        
    }
}
