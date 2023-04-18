package fajlmentes;

import java.util.ArrayList;

public class Mentesek {
    public static void main(String[] args) {
        Kartya k1 = new Kartya("K1", "V1");
        Kartya k2 = new Kartya("K2", "V2");
        
        ArrayList<Kartya> kartyak = new ArrayList<>();
        kartyak.add(k1);
        kartyak.add(k2);
        
    }
}
