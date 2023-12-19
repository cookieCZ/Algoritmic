/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Martin
 */
public class AlLinearniHledani extends Algoritmus {

    private int zkoumanyIndex = 0;
    private final int KROK_KONEC = 0;
    private final int KROK_POROVNEJ = 1;
    private final int KROK_PRESUN = 2;
    private int dalsiKrok = KROK_POROVNEJ;

    public AlLinearniHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek);
        this.nazev = "Lineární hledání";
        this.pseudokod = new String[]{"porovnej", "když nerovná", "tak přesuň", "jinak hotovo"};
    }

    private void porovnej() {
        if (posloupnost[zkoumanyIndex] == prvek) {
            dalsiKrok = KROK_KONEC;
            komentareKroku.add(getKrok() + ". " + posloupnostToString() + " Porovnání hledaného prvku úspěšné, prvek nalezen na indexu: " + zkoumanyIndex);
        } else {
            dalsiKrok = KROK_PRESUN;
            komentareKroku.add(getKrok() + ". " + posloupnostToString() + " Porovnání hledaného prvku neúspěšné");
        }
    }

    private void presun() {
        zkoumanyIndex++;
        if (zkoumanyIndex == posloupnost.length) {
            dalsiKrok = KROK_KONEC;
            komentareKroku.add(getKrok() + ". Hledaný prvek se v posloupnosti nevyskytuje.");
        } else {
            dalsiKrok = KROK_POROVNEJ;
            komentareKroku.add(getKrok() + ". " + posloupnostToString() + " Budeme porovnávat hledaný prvek s prvkem na indexu: " + zkoumanyIndex);
        }
    }

    @Override
    public void naKonec() {
        while (dalsiKrok != KROK_KONEC) {
            krokVpred();
        }
    }

    @Override
    public void krokVpred() {
        switch (dalsiKrok) {
            case KROK_KONEC -> {
            }
            case KROK_POROVNEJ ->
                porovnej();
            case KROK_PRESUN ->
                presun();
            default -> //chyba
                throw new IllegalArgumentException("Špatná hodnota přečtena v: AlLinearniHledani.dalsiKrok");
        }
    }

    private String posloupnostToString() {
        return IntStream.range(0, posloupnost.length)
                .mapToObj(x -> x == zkoumanyIndex ? "<b><em>" + posloupnost[x] + "</em></b>" : posloupnost[x] + "")
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
