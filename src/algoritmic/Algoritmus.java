/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Martin
 */
public abstract class Algoritmus {

    protected final int[] posloupnost;
    protected final int prvek;
    protected String nazev;
    private List<String> komentareKroku;
    protected String[] pseudokod;
    protected int zvyraznenyIndexPseudokodu = 0;

    public Algoritmus(int[] posloupnost, int prvek, String nazev, String[] pseudokod) {
        this.posloupnost = posloupnost;
        this.prvek = prvek;
        this.nazev = nazev;
        this.pseudokod = pseudokod;
        this.komentareKroku = new ArrayList();
        this.komentareKroku.add("&emsp;hledaný prvek: " + this.prvek + "&emsp;posloupnost: " + Arrays.toString(this.posloupnost));
    }

    protected final String posloupnostToString(int[] pole, int zvyraznenyIndex) {
        return IntStream.range(0, pole.length)
                .mapToObj(x -> x == zvyraznenyIndex ? "<b><em>" + pole[x] + " </em></b>" : pole[x] + "")
                .collect(Collectors.joining(", ", "[", "]"));
    }

    public final String getPseudokod() {
        return IntStream.range(0, pseudokod.length)
                .mapToObj(x -> x == zvyraznenyIndexPseudokodu ? "<b><em>" + pseudokod[x] + "&ensp;</em></b>" : pseudokod[x] + "")
                .collect(Collectors.joining("<br>"));
    }

    protected final void pridejKomentar(String komentar) {
        komentareKroku.add(getKrok() + ". " + komentar);
    }

    public final void krokVpred() {
        provedKrok();
        zvyrazniPseudokod();
    }

    protected abstract void provedKrok();

    protected abstract void zvyrazniPseudokod();

    public abstract void naKonec();

    public final int[] getPosloupnost() {
        return posloupnost;
    }

    public final int getPrvek() {
        return prvek;
    }

    public final String getNazev() {
        return nazev;
    }

    public final int getKrok() {
        return komentareKroku.size();
    }

    public final String getKomentareKroku() {
        return komentareKroku.stream().collect(Collectors.joining("<br>"));
    }
}
