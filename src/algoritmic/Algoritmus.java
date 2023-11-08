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
public abstract class Algoritmus {

    protected int[] posloupnost;
    protected int prvek;
    protected String nazev;
    protected int krok;

    public Algoritmus(int[] posloupnost, int prvek, String nazev) {
        this.posloupnost = posloupnost;
        this.prvek = prvek;
        this.nazev = nazev;
        this.krok = 0;
    }

    public int[] getPosloupnost() {
        return posloupnost;
    }

    public int getPrvek() {
        return prvek;
    }

    public String getNazev() {
        return nazev;
    }
}
