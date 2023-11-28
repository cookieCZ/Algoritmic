/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public abstract class Algoritmus {

    protected final int[] puvodniPosloupnost;
    protected int[] aktualniPosloupnost;
    protected final int prvek;
    protected String nazev;
    protected List<Krok> komentareKroku;
    protected String[] pseudokod;

    public Algoritmus(int[] posloupnost, int prvek) {
        this.puvodniPosloupnost = posloupnost;
        this.aktualniPosloupnost = posloupnost;
        this.prvek = prvek;
        this.komentareKroku = new ArrayList();
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

    public int getKrok() {
        return komentareKroku.size();
    }

    public List<Krok> getKomentareKroku() {
        return komentareKroku;
    }

    public String[] getPseudokod() {
        return pseudokod;
    }
}
