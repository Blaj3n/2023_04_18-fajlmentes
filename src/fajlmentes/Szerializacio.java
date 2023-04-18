package fajlmentes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        FileOutputStream kiFajl;
        try{
            kiFajl = new FileOutputStream("adat.ser");
            ObjectOutputStream kiObj = new ObjectOutputStream(kiFajl);
            kiObj.writeObject(kartyak);
            kiObj.close();
        } catch (FileNotFoundException ex){
            Logger.getLogger(Szerializacio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Szerializacio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deszerializalas() throws ClassNotFoundException {
        FileInputStream beFajl;
        try {
            beFajl = new FileInputStream("adat.ser");
            ObjectInputStream beObj = new ObjectInputStream(beFajl);
            kartyak = (ArrayList<Kartya>)beObj.readObject();
            beObj.close();
        }catch (FileNotFoundException ex){
            Logger.getLogger(Szerializacio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Szerializacio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
