/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import java.awt.Toolkit;

/**
 *
 * @author Andrew
 */
public class ProjetoView extends javax.swing.JFrame {

    /**
     * Creates new form ProjetoView
     */
    public ProjetoView() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMenu = new javax.swing.JButton();
        jButtonUsar = new javax.swing.JButton();
        jButtonProjetoStay = new javax.swing.JButton();
        jButtonContato = new javax.swing.JButton();
        jButtonProfile = new javax.swing.JButton();
        jButtonMenu2 = new javax.swing.JButton();
        jLabelProjeto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMenu.setBorder(null);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 50, 20));

        jButtonUsar.setBorder(null);
        jButtonUsar.setContentAreaFilled(false);
        jButtonUsar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 20));

        jButtonProjetoStay.setBorder(null);
        jButtonProjetoStay.setContentAreaFilled(false);
        jButtonProjetoStay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonProjetoStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 70, 20));

        jButtonContato.setBorder(null);
        jButtonContato.setContentAreaFilled(false);
        jButtonContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 70, 20));

        jButtonProfile.setBorder(null);
        jButtonProfile.setContentAreaFilled(false);
        jButtonProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfileActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 30, 30));

        jButtonMenu2.setBorder(null);
        jButtonMenu2.setContentAreaFilled(false);
        jButtonMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        jLabelProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/ProjectView.png"))); // NOI18N
        getContentPane().add(jLabelProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        MenuView menuView = new MenuView();
        this.setVisible(false);
        menuView.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenu2ActionPerformed
        MenuView menuView = new MenuView();
        this.setVisible(false);
        menuView.setVisible(true);
    }//GEN-LAST:event_jButtonMenu2ActionPerformed

    private void jButtonUsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsarActionPerformed
        UsarView usarView = new UsarView();
        this.setVisible(false);
        usarView.setVisible(true);
    }//GEN-LAST:event_jButtonUsarActionPerformed

    private void jButtonContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoActionPerformed
       Contato contato = new Contato();
       this.setVisible(false);
       contato.setVisible(true);
    }//GEN-LAST:event_jButtonContatoActionPerformed

    private void jButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfileActionPerformed
       this.setVisible(false);
       LoginView view = new LoginView();
       view.setVisible(true);
    }//GEN-LAST:event_jButtonProfileActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContato;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonMenu2;
    private javax.swing.JButton jButtonProfile;
    private javax.swing.JButton jButtonProjetoStay;
    private javax.swing.JButton jButtonUsar;
    private javax.swing.JLabel jLabelProjeto;
    // End of variables declaration//GEN-END:variables
        private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/resoucer/Icon.png"));
    }
}
