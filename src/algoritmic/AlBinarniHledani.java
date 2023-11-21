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
public class AlBinarniHledani extends Algoritmus {

    public AlBinarniHledani(int[] posloupnost, int prvek) {
        super(posloupnost, prvek);
        this.nazev = "Binární hledání";
        this.komentareKroku = new String[]{
            "Seřazení posloupnosti",
            "Porovnání hledaného prvku s prostředním prvkem"
        };
    }

}
