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

    public AlLinearniHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek);
        this.nazev = "Lineární hledání";
        this.komentareKroku = new String[]{
            "Porovnání hledaného prvku s n-tým prvkem"
        };
    }

    @Override
    public void naKonec() {
        super.naKonec(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void krokVpred() {
        this.krok++;
        //něco
    }

}
