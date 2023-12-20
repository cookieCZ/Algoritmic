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
public class AlBinarniHledani extends Algoritmus {

    private int[] aktualniPosloupnost;
    private final int KROK_KONEC = 0;
    private final int KROK_SERAD = 1;
    private final int KROK_POROVNEJ_PROSTREDNI = 2;
    private final int KROK_ROZPUL_POLE = 3;
    private int dalsiKrok = KROK_SERAD;

    public AlBinarniHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek);
        this.nazev = "Binární hledání";
        this.pseudokod = new String[]{
            "seřaď",
            "porovnej prostřední",
            "když nerovná",
            "&ensp;tak když prostřední > hledaný",
            "&ensp;&ensp;tak vezmi první půlku pole",
            "&ensp;&ensp;jinak vezmi druhou půlku pole",
            "&ensp;znovu porovnej prostřední",
            "&ensp;jinak hotovo"
        };
    }

    private void serad() {
        aktualniPosloupnost = Arrays.stream(posloupnost).sorted().toArray();
        dalsiKrok = KROK_POROVNEJ_PROSTREDNI;
        pridejKomentar(Arrays.toString(aktualniPosloupnost) + " Seřazení posloupnosti");
    }

    private void porovnej() {
        if (aktualniPosloupnost[aktualniPosloupnost.length / 2] == prvek) {
            dalsiKrok = KROK_KONEC;
            pridejKomentar(posloupnostToString() + " Porovnání hledaného prvku úspěšné, prvek nalezen");
        } else {
            dalsiKrok = KROK_ROZPUL_POLE;
            pridejKomentar(posloupnostToString() + " Porovnání hledaného prvku neúspěšné");
        }
    }

    private void rozpul() {
        if (aktualniPosloupnost.length == 1) {
            dalsiKrok = KROK_KONEC;
            if (aktualniPosloupnost[0] == prvek) {
                pridejKomentar("Prvek nalezen");
            } else {
                pridejKomentar("Prvek nenalezen");
            }
        } else {
            String pulka;
            if (aktualniPosloupnost[aktualniPosloupnost.length / 2] > prvek) {
                aktualniPosloupnost = Arrays.copyOfRange(aktualniPosloupnost, 0, aktualniPosloupnost.length / 2);
                pulka = "první";
            } else {
                aktualniPosloupnost = Arrays.copyOfRange(aktualniPosloupnost, aktualniPosloupnost.length / 2, aktualniPosloupnost.length);
                pulka = "druhou";
            }
            dalsiKrok = KROK_POROVNEJ_PROSTREDNI;
            pridejKomentar(Arrays.toString(aktualniPosloupnost) + " Vezmeme " + pulka + " půlku posloupnosti");
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
            case KROK_SERAD ->
                serad();
            case KROK_POROVNEJ_PROSTREDNI ->
                porovnej();
            case KROK_ROZPUL_POLE ->
                rozpul();
            default -> //chyba
                throw new IllegalArgumentException("Špatná hodnota přečtena v: AlLinearniHledani.dalsiKrok");
        }
    }

    private String posloupnostToString() {
        return IntStream.range(0, aktualniPosloupnost.length)
                .mapToObj(x -> x == aktualniPosloupnost.length / 2 ? "<b><em>" + aktualniPosloupnost[x] + "</em></b>" : aktualniPosloupnost[x] + "")
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
