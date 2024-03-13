/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class GUIvolba extends javax.swing.JFrame {

    private List<String> volby = List.of("Binární vyhledávání", "Lineární vyhledávání");
    private boolean chyba;

    /**
     * Creates new form GUIvolba
     */
    public GUIvolba() {
        initComponents();
        volbyComboBox.removeAllItems();
        volby.stream().forEach(x -> volbyComboBox.addItem(x));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        posloupnostTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prvekTextField = new javax.swing.JTextField();
        volbyComboBox = new javax.swing.JComboBox<>();
        zobrazButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pocetPrvkuSlider = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        maxPrvekSlider = new javax.swing.JSlider();
        duplicityCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(5, 1));

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("     Zadejte posloupnost čísel oddělených čárkou (nechte prázdné pro vygenerování náhodné posloupnosti):   ");
        jPanel4.add(jLabel1);
        jPanel4.add(posloupnostTextField);

        getContentPane().add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Hledaný prvek (nechte prázdné pro náhodný):");
        jPanel1.add(jLabel2);

        prvekTextField.setMinimumSize(new java.awt.Dimension(50, 20));
        prvekTextField.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(prvekTextField);

        volbyComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        volbyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pokus" }));
        jPanel1.add(volbyComboBox);

        zobrazButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zobrazButton.setText("zobraz");
        zobrazButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zobrazButtonActionPerformed(evt);
            }
        });
        jPanel1.add(zobrazButton);

        jPanel5.add(jPanel1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Parametry náhodného generování");
        jPanel5.add(jLabel3);

        getContentPane().add(jPanel5);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Počet prvků v posloupnosti:");
        jPanel2.add(jLabel4);

        pocetPrvkuSlider.setMajorTickSpacing(1);
        pocetPrvkuSlider.setMaximum(20);
        pocetPrvkuSlider.setMinimum(5);
        pocetPrvkuSlider.setMinorTickSpacing(1);
        pocetPrvkuSlider.setPaintLabels(true);
        pocetPrvkuSlider.setPaintTicks(true);
        pocetPrvkuSlider.setValue(10);
        pocetPrvkuSlider.setMinimumSize(new java.awt.Dimension(250, 45));
        pocetPrvkuSlider.setPreferredSize(new java.awt.Dimension(250, 45));
        jPanel2.add(pocetPrvkuSlider);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("    Maximální velikost prvků:");
        jPanel3.add(jLabel5);

        maxPrvekSlider.setMajorTickSpacing(10);
        maxPrvekSlider.setMinimum(10);
        maxPrvekSlider.setMinorTickSpacing(1);
        maxPrvekSlider.setPaintLabels(true);
        maxPrvekSlider.setPaintTicks(true);
        maxPrvekSlider.setToolTipText("");
        maxPrvekSlider.setValue(100);
        maxPrvekSlider.setMinimumSize(new java.awt.Dimension(250, 45));
        maxPrvekSlider.setPreferredSize(new java.awt.Dimension(250, 45));
        jPanel3.add(maxPrvekSlider);

        getContentPane().add(jPanel3);

        duplicityCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        duplicityCheckBox.setSelected(true);
        duplicityCheckBox.setText("povolit duplicitní členy v posloupnosti");
        duplicityCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(duplicityCheckBox);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zobrazButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zobrazButtonActionPerformed
        int maxPrvek = maxPrvekSlider.getValue();
        int pocetPrvku = pocetPrvkuSlider.getValue();
        boolean duplicity = duplicityCheckBox.isSelected();

        int prvek;
        String input = prvekTextField.getText();
        if (input.isBlank()) {
            Random random = new Random();
            prvek = random.nextInt(maxPrvek);
        } else {
            try {
                prvek = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nesprávný formát hledaného prvku. Zadejte číslo.", "Chyba", JOptionPane.ERROR_MESSAGE);
                //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                return;
            }
        }

        int[] posloupnost;
        input = posloupnostTextField.getText();
        if (input.isBlank()) {
            Collection<Integer> c;
            if (duplicity) {
                c = new ArrayList();
            } else {
                if (maxPrvek < pocetPrvku) {
                    JOptionPane.showMessageDialog(this, "Posloupnost nelze vygenerovat. Maximální velikost prvku musí být nejméně tolik, kolik je počet prvků v posloupnosti při generování bez duplicit. Vyberte jiná čísla.", "Chyba", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    c = new HashSet();
                }
            }

            Random random = new Random();
            while (c.size() < pocetPrvku) {
                c.add(random.nextInt(maxPrvek));
            }

            List<Integer> l = c.stream().collect(Collectors.toCollection(ArrayList::new));
            Collections.shuffle(l);
            posloupnost = l.stream().mapToInt(Integer::intValue).toArray();
        } else {
            chyba = false;
            posloupnost = Arrays.stream(input.split(",")).map(String::trim).mapToInt(x -> {
                try {
                    return Integer.parseInt(x);
                } catch (NumberFormatException e) {
                    //JOptionPane.showMessageDialog(this, "Nesprávný formát posloupnosti. Zadejte čísla ve formátu \"1,2,3,4,5\".", "Chyba", JOptionPane.ERROR_MESSAGE);
                    //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    chyba = true;
                    return 0;
                }
            }).toArray();

            if (chyba) {
                JOptionPane.showMessageDialog(this, "Nesprávný formát posloupnosti. Zadejte čísla ve formátu \"1,2,3,4,5\".", "Chyba", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        Algoritmus alg = null;
        String a = volbyComboBox.getSelectedItem().toString();
        switch (volby.indexOf(a)) {
            case 0 ->
                alg = new AlBinarniHledani(posloupnost, prvek);
            case 1 ->
                alg = new AlLinearniHledani(posloupnost, prvek);
            default ->
                throw new IllegalArgumentException("Špatná hodnota přečtena v: GUIvolba.volbyComboBox");
        }

        new GUIzobrazovani(alg).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zobrazButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIvolba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIvolba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIvolba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIvolba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIvolba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox duplicityCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSlider maxPrvekSlider;
    private javax.swing.JSlider pocetPrvkuSlider;
    private javax.swing.JTextField posloupnostTextField;
    private javax.swing.JTextField prvekTextField;
    private javax.swing.JComboBox<String> volbyComboBox;
    private javax.swing.JButton zobrazButton;
    // End of variables declaration//GEN-END:variables
}
