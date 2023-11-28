/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

/**
 *
 * @author Martin
 */
public class Krok {

    private int cislo;
    private int[] posloupnost;
    private String komentar;

    public Krok(int cislo, int[] posloupnost, String komentar) {
        this.cislo = cislo;
        this.posloupnost = posloupnost;
        this.komentar = komentar;
    }

    public int getCislo() {
        return cislo;
    }

    public int[] getPosloupnost() {
        return posloupnost;
    }

    public String getKomentar() {
        return komentar;
    }
}
