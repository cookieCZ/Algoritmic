/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Martin
 */
public abstract class Algoritmus {

    protected final int[] posloupnost;
    protected final int prvek;
    protected String nazev;
    protected List<String> komentareKroku;
    protected String[] pseudokod;

    public Algoritmus(int[] posloupnost, int prvek) {
        this.posloupnost = posloupnost;
        this.prvek = prvek;
        this.komentareKroku = new ArrayList();
        this.komentareKroku.add("&emsp;hledaný prvek: " + this.prvek + "&emsp;posloupnost: " + Arrays.toString(this.posloupnost));
    }

    public void krokVpred() {
    }

    public void naKonec() {
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

    public int getKrok() {
        return komentareKroku.size();
    }

    public List<String> getKomentareKroku() {
        return komentareKroku;
    }

    public String[] getPseudokod() {
        return pseudokod;
    }
}
