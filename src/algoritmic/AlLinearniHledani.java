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

    private String komentar = "Porovnání hledaného prvku (%d) s %d. prvkem";

    public AlLinearniHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek);
        this.nazev = "Lineární hledání";
        this.pseudokod = new String[]{"Porovnání hledaného prvku s n-tým prvkem.", "Pokud se rovnají, prvek nalezen."};
    }

    @Override
    public void naKonec() {
        while (prvek != puvodniPosloupnost[getKrok() - 1] && getKrok() < puvodniPosloupnost.length) {
            krokVpred();
        }
    }

    @Override
    public void krokVpred() {
        //něco
        int krok = getKrok();

        komentareKroku.add(new Krok(krok + 1, puvodniPosloupnost, String.format(komentar, prvek, krok + 1)));
    }

}
