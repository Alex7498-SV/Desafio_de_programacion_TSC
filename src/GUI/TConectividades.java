/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author alex
 */
public class TConectividades extends javax.swing.JFrame {

    /**
     * Creates new form TConectividades
     */
    public TConectividades() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(rootPane);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonReturn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bmenu.png"))); // NOI18N
        botonReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonReturnMousePressed(evt);
            }
        });
        getContentPane().add(botonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Tconectividades1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BgMalla.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReturnMouseEntered
        botonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bmenuover.png")));
    }//GEN-LAST:event_botonReturnMouseEntered

    private void botonReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReturnMouseExited
        botonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bmenu.png")));
    }//GEN-LAST:event_botonReturnMouseExited

    private void botonReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReturnMousePressed
        System.out.println("Regresando al menu");
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_botonReturnMousePressed

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
            java.util.logging.Logger.getLogger(TConectividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TConectividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TConectividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TConectividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TConectividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel botonReturn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
