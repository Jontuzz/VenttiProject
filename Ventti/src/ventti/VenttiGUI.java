package ventti;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import sun.security.util.Length;

public class VenttiGUI extends javax.swing.JFrame {

    //luodaan korttipakka, emäntä ja pelaaja
    Korttipakka korttipakka = new Korttipakka();
    Emanta emanta = new Emanta();
    Pelaaja pelaaja = new Pelaaja();

    /**
     * Creates new form VenttiGUI
     */
    public VenttiGUI() {
        initComponents();
        jääButton.setEnabled(false);
        jääButton.setVisible(false);
        TextAreaPelaajanKortit.setEditable(false);
        pelaajaSummaText.setText("Korttien summa: " + pelaaja.getKorttienSumma());
        TextAreaEmannanKortit.setEditable(false);
        emantaSummaText.setText("Korttien summa: " + pelaaja.getKorttienSumma());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lisääButton = new javax.swing.JButton();
        jääButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaEmannanKortit = new javax.swing.JTextArea();
        emantaSummaText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaPelaajanKortit = new javax.swing.JTextArea();
        pelaajaSummaText = new javax.swing.JTextField();
        voittoTeksti = new javax.swing.JLabel();
        random = new javax.swing.JLabel();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lisääButton.setText("Lisää");
        lisääButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisääButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lisääButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jääButton.setText("Jää");
        jääButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jääButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jääButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        TextAreaEmannanKortit.setColumns(20);
        TextAreaEmannanKortit.setLineWrap(true);
        TextAreaEmannanKortit.setRows(10);
        TextAreaEmannanKortit.setText("Emännän kortit:");
        jScrollPane3.setViewportView(TextAreaEmannanKortit);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 200));
        getContentPane().add(emantaSummaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, -1));

        TextAreaPelaajanKortit.setColumns(20);
        TextAreaPelaajanKortit.setLineWrap(true);
        TextAreaPelaajanKortit.setRows(10);
        TextAreaPelaajanKortit.setText("Pelaajan kortit:");
        jScrollPane2.setViewportView(TextAreaPelaajanKortit);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 140, 200));
        getContentPane().add(pelaajaSummaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 140, -1));
        getContentPane().add(voittoTeksti, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, 110));
        getContentPane().add(random, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventti/korttiPöytä.jpg"))); // NOI18N
        getContentPane().add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1000));

        setSize(new java.awt.Dimension(533, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lisääButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisääButtonActionPerformed
        //kun pelaaja painaa "Lisää" nappia

        jääButton.setVisible(true);
        jääButton.setEnabled(true);

        int min = 0;
        int max = korttipakka.getPakanKoko();
        // parametreiksi yläraja - alajara ja lopputulemaan lisätään alaraja
        // koska metodi palauttaa oletuksena 0 - yläraj
        int randomPelaaja = new Random().nextInt(max - min) - min;

        if (randomPelaaja <= korttipakka.getPakanKoko()) {
            pelaaja.lisaaKortti(korttipakka.getKortti(randomPelaaja));

            //haetaan pelaajan pakkaan lisätyn kortin tiedot
            String korttiMaa = korttipakka.getKortti(randomPelaaja).getMaa();
            int korttiArvo = korttipakka.getKortti(randomPelaaja).getArvo();
            String pelaajaKortti = korttiMaa + ", " + korttiArvo;
            //lisätään kortin tiedot text areaan
            TextAreaPelaajanKortit.append("\n" + pelaajaKortti);

            //poistetaan kortti koko korttipakasta
            korttipakka.poistaKorttiPakasta(randomPelaaja);

            pelaajaSummaText.setText("Korttien summa: " + pelaaja.getKorttienSumma());

            //this.random.setText("" + randomPelaaja);
        } else {
            System.out.println("Indeksi oli liian iso!");
        }

    }//GEN-LAST:event_lisääButtonActionPerformed

    private void jääButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jääButtonActionPerformed
        //kun pelaaja painaa "Jää" nappia
        lisääButton.setEnabled(false);
        lisääButton.setVisible(false);

        while (emanta.getKorttienSumma() < 15) {
            int min = 0;
            int max = korttipakka.getPakanKoko();
            // parametreiksi yläraja - alajara ja lopputulemaan lisätään alaraja
            // koska metodi palauttaa oletuksena 0 - yläraj
            int randomEmanta = new Random().nextInt(max - min) - min;
            //random.setText(" " + randomEmanta);
            if (randomEmanta <= korttipakka.getPakanKoko()) {
                //lisätään pelaajalle kortti, joka poistetaan
                emanta.lisaaKortti(korttipakka.getKortti(randomEmanta));

                //haetaan pelaajan pakkaan lisätyn kortin tiedot
                String korttiMaa = korttipakka.getKortti(randomEmanta).getMaa();
                int korttiArvo = korttipakka.getKortti(randomEmanta).getArvo();
                String pelaajaKortti = korttiMaa + ", " + korttiArvo;
                //lisätään kortin tiedot text areaan
                TextAreaEmannanKortit.append("\n" + pelaajaKortti);

                //poistetaan kortti koko korttipakasta
                korttipakka.poistaKorttiPakasta(randomEmanta);

                emantaSummaText.setText("Korttien summa: " + emanta.getKorttienSumma());
            } else {
                System.out.println("Indeksi oli liian iso!");
            }

        }
        
        TarkistaVoitto tarkistaVoitto = new TarkistaVoitto(emanta.getKorttienSumma(), pelaaja.getKorttienSumma(), pelaaja.getKorttienMaara());
        voittoTeksti.setText(tarkistaVoitto.kumpiVoitti());
        
    }//GEN-LAST:event_jääButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VenttiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenttiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenttiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenttiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenttiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaEmannanKortit;
    private javax.swing.JTextArea TextAreaPelaajanKortit;
    private javax.swing.JTextField emantaSummaText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jääButton;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JButton lisääButton;
    private javax.swing.JTextField pelaajaSummaText;
    private javax.swing.JLabel random;
    private javax.swing.JLabel voittoTeksti;
    // End of variables declaration//GEN-END:variables
}
