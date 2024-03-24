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
public class AlLinearniHledani extends Algoritmus {

    private int zkoumanyIndex = 0;
    private final int KROK_KONEC = 0;
    private final int KROK_POROVNEJ = 1;
    private final int KROK_PRESUN = 2;
    private int dalsiKrok = KROK_POROVNEJ;

    public AlLinearniHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek, "Lineární vyhledávání",
                new String[]{
                    "porovnej",
                    "když nerovná",
                    "&ensp;tak přesuň",
                    "&ensp;opakuj od začátku",
                    "&ensp;jinak hotovo"
                });
    }

    private void porovnej() {
        if (posloupnost[zkoumanyIndex] == prvek) {
            dalsiKrok = KROK_KONEC;
            pridejKomentar(arrayToString() + " Porovnání hledaného prvku úspěšné, prvek nalezen na indexu: " + zkoumanyIndex);
        } else {
            dalsiKrok = KROK_PRESUN;
            pridejKomentar(arrayToString() + " Porovnání hledaného prvku neúspěšné");
        }
    }

    private void presun() {
        zkoumanyIndex++;
        if (zkoumanyIndex == posloupnost.length) {
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
                zvyraznenyIndexPseudokodu = 4;
            case KROK_POROVNEJ ->
                zvyraznenyIndexPseudokodu = 0;
            case KROK_PRESUN ->
                zvyraznenyIndexPseudokodu = 2;
            default -> //chyba
                throw new IllegalArgumentException("Špatná hodnota přečtena v: AlLinearniHledani.dalsiKrok");
        }
    }

    private String arrayToString() {
        return posloupnostToString(posloupnost, zkoumanyIndex);
    }
}
