/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahmi_penampil_gambar;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author fahmi
 */
public class GambarButon1 extends javax.swing.JFrame {

    /**
     * Creates new form GambarButon
     */
    public GambarButon1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPane = new javax.swing.JPanel();
        glashfishBT = new javax.swing.JButton();
        javaeeBT = new javax.swing.JButton();
        postgresqlBT = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        pilihan = new javax.swing.JComboBox<>();
        imagePane = new javax.swing.JPanel();
        gambar1LB = new javax.swing.JLabel();
        gambar2LB = new javax.swing.JLabel();
        gambar3LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        glashfishBT.setText("GlassFish");
        glashfishBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glashfishBTActionPerformed(evt);
            }
        });
        buttonPane.add(glashfishBT);

        javaeeBT.setText("JavaEE");
        javaeeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeBTActionPerformed(evt);
            }
        });
        buttonPane.add(javaeeBT);

        postgresqlBT.setText("PostgreSQL");
        postgresqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresqlBTActionPerformed(evt);
            }
        });
        buttonPane.add(postgresqlBT);

        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        buttonPane.add(keluar);

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gambar-1", "Gambar-2", "Gambar-3", " " }));
        pilihan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanItemStateChanged(evt);
            }
        });
        buttonPane.add(pilihan);

        getContentPane().add(buttonPane, java.awt.BorderLayout.PAGE_START);

        imagePane.setLayout(new java.awt.CardLayout());

        gambar1LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar1LB.setIcon(new javax.swing.ImageIcon("D:\\AA KULIAH\\PBO\\FAHMI_GUI\\src\\img\\1.png")); // NOI18N
        imagePane.add(gambar1LB, "0");

        gambar2LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar2LB.setIcon(new javax.swing.ImageIcon("D:\\AA KULIAH\\PBO\\FAHMI_GUI\\src\\img\\2.png")); // NOI18N
        imagePane.add(gambar2LB, "1");

        gambar3LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar3LB.setIcon(new javax.swing.ImageIcon("D:\\AA KULIAH\\PBO\\FAHMI_GUI\\src\\img\\3.png")); // NOI18N
        imagePane.add(gambar3LB, "2");

        getContentPane().add(imagePane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void glashfishBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glashfishBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePane.getLayout());
        cl.show(imagePane, "0");
    }//GEN-LAST:event_glashfishBTActionPerformed

    private void javaeeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePane.getLayout());
        cl.show(imagePane, "1");
    }//GEN-LAST:event_javaeeBTActionPerformed

    private void postgresqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresqlBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePane.getLayout());
        cl.show(imagePane, "2");
    }//GEN-LAST:event_postgresqlBTActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void pilihanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanItemStateChanged
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePane.getLayout());
        cl.show(imagePane, String.valueOf(pilihan.getSelectedIndex()));
    }//GEN-LAST:event_pilihanItemStateChanged

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
            java.util.logging.Logger.getLogger(GambarButon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GambarButon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GambarButon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GambarButon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GambarButon1 fullFrame = new GambarButon1();
                GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPane;
    private javax.swing.JLabel gambar1LB;
    private javax.swing.JLabel gambar2LB;
    private javax.swing.JLabel gambar3LB;
    private javax.swing.JButton glashfishBT;
    private javax.swing.JPanel imagePane;
    private javax.swing.JButton javaeeBT;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JButton postgresqlBT;
    // End of variables declaration//GEN-END:variables
}
