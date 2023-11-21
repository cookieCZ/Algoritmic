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

    protected final int[] puvodniPosloupnost;
    protected final int prvek;
    protected String nazev;
    protected int krok;
    protected String[] komentareKroku;

    public Algoritmus(int[] posloupnost, int prvek) {
        this.puvodniPosloupnost = posloupnost;
        this.prvek = prvek;
        this.krok = 0;
    }

    public void krokVpred() {
    }

    public void naKonec() {
    }

    public int[] getPuvodniPosloupnost() {
        return puvodniPosloupnost;
    }

    public int getPrvek() {
        return prvek;
    }

    public String getNazev() {
        return nazev;
    }
}
