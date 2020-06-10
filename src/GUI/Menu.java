package GUI;

import GUI.Dominio;
import MEF.Step1;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonDominio = new javax.swing.JLabel();
        botonMalla = new javax.swing.JLabel();
        botonTConectividades = new javax.swing.JLabel();
        botonModelo = new javax.swing.JLabel();
        botonMEF = new javax.swing.JLabel();
        botonEnsamblaje = new javax.swing.JLabel();
        botonCContorno = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonDominio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BDominio.png"))); // NOI18N
        botonDominio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDominioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDominioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDominioMousePressed(evt);
            }
        });
        getContentPane().add(botonDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 40));

        botonMalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BMalla.png"))); // NOI18N
        botonMalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMallaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMallaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMallaMousePressed(evt);
            }
        });
        getContentPane().add(botonMalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 40));

        botonTConectividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BTConec.png"))); // NOI18N
        botonTConectividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTConectividadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTConectividadesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTConectividadesMousePressed(evt);
            }
        });
        getContentPane().add(botonTConectividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 40));

        botonModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BModelo.png"))); // NOI18N
        botonModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonModeloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonModeloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonModeloMousePressed(evt);
            }
        });
        getContentPane().add(botonModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 40));

        botonMEF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bmef.png"))); // NOI18N
        botonMEF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMEFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMEFMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMEFMousePressed(evt);
            }
        });
        getContentPane().add(botonMEF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 150, 40));

        botonEnsamblaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bensamblaje.png"))); // NOI18N
        botonEnsamblaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEnsamblajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEnsamblajeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEnsamblajeMousePressed(evt);
            }
        });
        getContentPane().add(botonEnsamblaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 150, 40));

        botonCContorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bcont.png"))); // NOI18N
        botonCContorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCContornoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCContornoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCContornoMousePressed(evt);
            }
        });
        getContentPane().add(botonCContorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/menu.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDominioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDominioMousePressed
        // TODO add your handling code here:
        dispose();
        new Dominio().setVisible(true);
    }//GEN-LAST:event_botonDominioMousePressed

    private void botonMallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMallaMousePressed
        dispose();
        new Malla().setVisible(true);
    }//GEN-LAST:event_botonMallaMousePressed

    
    //Dominio
    private void botonDominioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDominioMouseEntered
        botonDominio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BDominioover.png")));
    }//GEN-LAST:event_botonDominioMouseEntered

    private void botonDominioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDominioMouseExited
        botonDominio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BDominio.png")));
    }//GEN-LAST:event_botonDominioMouseExited

    //Malla
    private void botonMallaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMallaMouseEntered
        botonMalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BMallaover.png")));
    }//GEN-LAST:event_botonMallaMouseEntered

    private void botonMallaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMallaMouseExited
        botonMalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BMalla.png")));
    }//GEN-LAST:event_botonMallaMouseExited

    
    //Tabla de conectividades
    private void botonTConectividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTConectividadesMouseEntered
        botonTConectividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BTConecover.png")));
    }//GEN-LAST:event_botonTConectividadesMouseEntered

    private void botonTConectividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTConectividadesMouseExited
        botonTConectividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BTConec.png")));
    }//GEN-LAST:event_botonTConectividadesMouseExited

    //Modelo
    private void botonModeloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModeloMouseEntered
         botonModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BModeloover.png")));
    }//GEN-LAST:event_botonModeloMouseEntered

    private void botonModeloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModeloMouseExited
         botonModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/BModelo.png")));
    }//GEN-LAST:event_botonModeloMouseExited

    //MEF
    private void botonMEFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMEFMouseEntered
        botonMEF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bmefover.png")));
    }//GEN-LAST:event_botonMEFMouseEntered

    private void botonMEFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMEFMouseExited
        botonMEF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bmef.png")));
    }//GEN-LAST:event_botonMEFMouseExited

    //Ensamblaje
    private void botonEnsamblajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnsamblajeMouseEntered
        botonEnsamblaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bensamblajeover.png")));
    }//GEN-LAST:event_botonEnsamblajeMouseEntered

    private void botonEnsamblajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnsamblajeMouseExited
        botonEnsamblaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bensamblaje.png")));
    }//GEN-LAST:event_botonEnsamblajeMouseExited

    
    //COndiciones de contorno
    private void botonCContornoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCContornoMouseEntered
        botonCContorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bcontover.png")));
    }//GEN-LAST:event_botonCContornoMouseEntered

    private void botonCContornoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCContornoMouseExited
        botonCContorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Bcont.png")));
    }//GEN-LAST:event_botonCContornoMouseExited

    private void botonMEFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMEFMousePressed
        System.out.println("Transfiriendo al MEF ");
        dispose();
        new Step1().setVisible(true);
    }//GEN-LAST:event_botonMEFMousePressed

    private void botonTConectividadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTConectividadesMousePressed
        System.out.println("Mostrando la tabla de conectividades");
        dispose();
        new TConectividades().setVisible(true);
    }//GEN-LAST:event_botonTConectividadesMousePressed

    private void botonModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModeloMousePressed
        System.out.println("Mostrando el Modelo");
        dispose();
        new Modelo().setVisible(true);
    }//GEN-LAST:event_botonModeloMousePressed

    private void botonEnsamblajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnsamblajeMousePressed
        System.out.println("Mostrando el ensamblaje");
        dispose();
        new Ensamblaje().setVisible(true);
    }//GEN-LAST:event_botonEnsamblajeMousePressed

    private void botonCContornoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCContornoMousePressed
        System.out.println("Mostrando las condiciones de contorno");
        dispose();
        new Contorno().setVisible(true);
    }//GEN-LAST:event_botonCContornoMousePressed

    
    
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel botonCContorno;
    private javax.swing.JLabel botonDominio;
    private javax.swing.JLabel botonEnsamblaje;
    private javax.swing.JLabel botonMEF;
    private javax.swing.JLabel botonMalla;
    private javax.swing.JLabel botonModelo;
    private javax.swing.JLabel botonTConectividades;
    // End of variables declaration//GEN-END:variables
}
