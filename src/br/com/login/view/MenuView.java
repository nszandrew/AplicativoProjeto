
package br.com.login.view;

import br.com.login.model.Login;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URI;


public class MenuView extends javax.swing.JFrame {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public MenuView() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonUsar = new javax.swing.JButton();
        jButtonOnuLink = new javax.swing.JButton();
        jButtonContato = new javax.swing.JButton();
        jButtonMenuStay = new javax.swing.JButton();
        jButtonProjeto = new javax.swing.JButton();
        jButtonCrieProjeto = new javax.swing.JButton();
        jButtonOds8 = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jToggleButtonOds9 = new javax.swing.JToggleButton();
        jButtonProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonUsar.setBorder(null);
        jButtonUsar.setContentAreaFilled(false);
        jButtonUsar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 20));

        jButtonOnuLink.setBorder(null);
        jButtonOnuLink.setContentAreaFilled(false);
        jButtonOnuLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOnuLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOnuLinkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOnuLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 120, 120));

        jButtonContato.setBorder(null);
        jButtonContato.setContentAreaFilled(false);
        jButtonContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 70, 20));

        jButtonMenuStay.setBorder(null);
        jButtonMenuStay.setContentAreaFilled(false);
        jButtonMenuStay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonMenuStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 50, 20));

        jButtonProjeto.setBorder(null);
        jButtonProjeto.setContentAreaFilled(false);
        jButtonProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjetoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 70, 20));

        jButtonCrieProjeto.setBorder(null);
        jButtonCrieProjeto.setContentAreaFilled(false);
        jButtonCrieProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCrieProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrieProjetoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrieProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 330, 50));

        jButtonOds8.setBorder(null);
        jButtonOds8.setContentAreaFilled(false);
        jButtonOds8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOds8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOds8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOds8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 567, 110, 110));

        jButtonLogOut.setBorder(null);
        jButtonLogOut.setContentAreaFilled(false);
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 30, 30));

        jToggleButtonOds9.setBorder(null);
        jToggleButtonOds9.setBorderPainted(false);
        jToggleButtonOds9.setContentAreaFilled(false);
        jToggleButtonOds9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonOds9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOds9ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonOds9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 120, 120));

        jButtonProfile.setBorder(null);
        jButtonProfile.setContentAreaFilled(false);
        jButtonProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfileActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/MenuViewRedimensionado.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsarActionPerformed
        UsarView usarView = new UsarView();
        usarView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUsarActionPerformed

    private void jButtonOnuLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOnuLinkActionPerformed
        try {
            URI link = new URI("https://brasil.un.org/pt-br/sdgs/10");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.err.println(erro);
        }
    }//GEN-LAST:event_jButtonOnuLinkActionPerformed

    private void jButtonContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoActionPerformed
        Contato contato = new Contato();
        this.setVisible(false);
        contato.setVisible(true);
    }//GEN-LAST:event_jButtonContatoActionPerformed

    private void jButtonProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjetoActionPerformed
        ProjetoView projetoView = new ProjetoView();
        this.setVisible(false);
        projetoView.setVisible(true);
    }//GEN-LAST:event_jButtonProjetoActionPerformed

    private void jButtonOds8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOds8ActionPerformed
               try {
            URI link = new URI("https://brasil.un.org/pt-br/sdgs/8");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.err.println(erro);
        }   
    }//GEN-LAST:event_jButtonOds8ActionPerformed

    private void jToggleButtonOds9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOds9ActionPerformed
        
        try {
            URI link = new URI("https://brasil.un.org/pt-br/sdgs/9");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.err.println(erro);
        } 
    }//GEN-LAST:event_jToggleButtonOds9ActionPerformed

    private void jButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfileActionPerformed
       ProfileView perfilView = new ProfileView();
       perfilView.setEmail(this.getEmail());
       perfilView.setVisible(true);
    }//GEN-LAST:event_jButtonProfileActionPerformed

    private void jButtonCrieProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrieProjetoActionPerformed
        // TODO add your handling code here:
        CadastroProjetoView projetoView = new CadastroProjetoView();
        projetoView.setVisible(true);
        Login log = new Login();
        projetoView.setEmail(log.getEmail());

       
    }//GEN-LAST:event_jButtonCrieProjetoActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed

       this.setVisible(false);
       LoginView view = new LoginView();
       view.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed
    

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContato;
    private javax.swing.JButton jButtonCrieProjeto;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonMenuStay;
    private javax.swing.JButton jButtonOds8;
    private javax.swing.JButton jButtonOnuLink;
    private javax.swing.JButton jButtonProfile;
    private javax.swing.JButton jButtonProjeto;
    private javax.swing.JButton jButtonUsar;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButtonOds9;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/resoucer/Icon.png"));
    }
}
