/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.Arrays;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Martin
 */
public class Algoritmic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Optional<LookAndFeelInfo> o = Arrays.stream(UIManager.getInstalledLookAndFeels()).filter(x -> x.getName().equals("Nimbus")).findAny();
            if (o.isPresent()) {
                LookAndFeelInfo l = (LookAndFeelInfo) o.get();
                UIManager.setLookAndFeel(l.getClassName());
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUIvolba.class.getName()).log(Level.SEVERE, null, ex);
        }
        new GUIvolba().setVisible(true);
    }

}
