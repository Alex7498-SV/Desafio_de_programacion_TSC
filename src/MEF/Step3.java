/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEF;

/**
 *
 * @author alex
 */
public class Step3 extends javax.swing.JFrame {

    /**
     * Creates new form Step3
     */
    public Step3() {
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

        botonSig = new javax.swing.JLabel();
        botonBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/next.png"))); // NOI18N
        botonSig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSigMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSigMousePressed(evt);
            }
        });
        getContentPane().add(botonSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        botonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/back.png"))); // NOI18N
        botonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBackMousePressed(evt);
            }
        });
        getContentPane().add(botonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MEF/S3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 350));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MEF/3.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMouseEntered
        botonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/nextover.png")));
    }//GEN-LAST:event_botonSigMouseEntered

    private void botonSigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMouseExited
       botonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/next.png")));
    }//GEN-LAST:event_botonSigMouseExited

    private void botonSigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMousePressed
        System.out.println("Renderizando paso 4");
        dispose();
        new Step4().setVisible(true);
    }//GEN-LAST:event_botonSigMousePressed

    private void botonBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBackMouseEntered
       botonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/backover.png")));
    }//GEN-LAST:event_botonBackMouseEntered

    private void botonBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBackMouseExited
        botonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/back.png")));
    }//GEN-LAST:event_botonBackMouseExited

    private void botonBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBackMousePressed
        System.out.println("Regresando al paso 2");
        dispose();
        new Step2().setVisible(true);
    }//GEN-LAST:event_botonBackMousePressed

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
            java.util.logging.Logger.getLogger(Step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Step3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel botonBack;
    private javax.swing.JLabel botonSig;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
