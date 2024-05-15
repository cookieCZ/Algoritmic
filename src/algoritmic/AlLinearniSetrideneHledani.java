/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.Arrays;

/**
 *
 * @author Martin
 */
public class AlLinearniSetrideneHledani extends Algoritmus {

    private int[] serazenaPosloupnost;
    private int zkoumanyIndex = 0;
    private final int KROK_KONEC = 0;
    private final int KROK_SERAD = 1;
    private final int KROK_POROVNEJ = 2;
    private final int KROK_PRESUN = 3;
    private int dalsiKrok = KROK_SERAD;

    public AlLinearniSetrideneHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek, "Lineární setříděné vyhledávání",
                new String[]{
                    "seřaď",
                    "porovnej",
                    "když nerovná",
                    "&ensp;tak přesuň",
                    "&ensp;opakuj od začátku",
                    "&ensp;jinak hotovo"
                });
    }

    private void serad() {
        serazenaPosloupnost = Arrays.stream(posloupnost).sorted().toArray();
        dalsiKrok = KROK_POROVNEJ;
        pridejKomentar(Arrays.toString(serazenaPosloupnost) + " Seřazení posloupnosti");
    }

    private void porovnej() {
        if (serazenaPosloupnost[zkoumanyIndex] == prvek) {
            dalsiKrok = KROK_KONEC;
            pridejKomentar(arrayToString() + " Porovnání hledaného prvku úspěšné, prvek nalezen na indexu: " + zkoumanyIndex);
        } else {
            dalsiKrok = KROK_PRESUN;
            pridejKomentar(arrayToString() + " Porovnání hledaného prvku neúspěšné");
        }
    }

    private void presun() {
        zkoumanyIndex++;
        if (zkoumanyIndex == serazenaPosloupnost.length) {
            dalsiKrok = KROK_KONEC;
            pridejKomentar("Hledaný prvek se v posloupnosti nevyskytuje.");
        } else {
            dalsiKrok = KROK_POROVNEJ;
            pridejKomentar(arrayToString() + " Budeme porovnávat hledaný prvek s prvkem na indexu: " + zkoumanyIndex);
        }
    }

    @Override
    public void naKonec() {
        while (dalsiKrok != KROK_KONEC) {
            krokVpred();
        }
    }

    @Override
    public void provedKrok() {
        switch (dalsiKrok) {
            case KROK_KONEC -> {
            }
            case KROK_SERAD -> 
                serad();
            case KROK_POROVNEJ ->
                porovnej();
            case KROK_PRESUN ->
                presun();
            default -> //chyba
                throw new IllegalArgumentException("Špatná hodnota přečtena v: AlLinearniHledani.dalsiKrok");
        }
    }

    @Override
    protected void zvyrazniPseudokod() {
        switch (dalsiKrok) {
            case KROK_KONEC ->
                zvyraznenyIndexPseudokodu = 5;
            case KROK_SERAD ->
                zvyraznenyIndexPseudokodu = 0;
            case KROK_POROVNEJ ->
                zvyraznenyIndexPseudokodu = 1;
            case KROK_PRESUN ->
                zvyraznenyIndexPseudokodu = 3;
            default -> //chyba
                throw new IllegalArgumentException("Špatná hodnota přečtena v: AlLinearniHledani.dalsiKrok");
        }
    }

    private String arrayToString() {
        return posloupnostToString(serazenaPosloupnost, zkoumanyIndex);
    }
}
