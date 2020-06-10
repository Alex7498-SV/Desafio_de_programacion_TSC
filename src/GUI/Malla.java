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
public class Malla extends javax.swing.JFrame {

    /**
     * Creates new form Malla
     */
    public Malla() {
        initComponents();
        setResizable(false);
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
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Boton.png"))); // NOI18N
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
        getContentPane().add(botonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gif/mallaf.gif"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReturnMousePressed
        // TODO add your handling code here:
        System.out.println("Regresando al menu");
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_botonReturnMousePressed

    private void botonReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReturnMouseEntered
        botonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Botonover.png")));
    }//GEN-LAST:event_botonReturnMouseEntered

    private void botonReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReturnMouseExited
        botonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Boton.png")));
    }//GEN-LAST:event_botonReturnMouseExited

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
            java.util.logging.Logger.getLogger(Malla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Malla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Malla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Malla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Malla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel botonReturn;
    // End of variables declaration//GEN-END:variables
}
