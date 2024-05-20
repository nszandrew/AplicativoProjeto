
package br.com.login.view;

import br.com.login.controller.LoginController;
import br.com.login.hashcode.HashCode;
import br.com.login.model.InformacoesLogin;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProfileView extends javax.swing.JFrame {
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     
     
    public void setJTextFieldEmail(String email) {
        jTextFieldEmail.setText(email);    
}
    public void setjTextFieldNome(String nome) {
        jTextFieldNome.setText(nome);
    }
    public void setjTextFieldSenha(String senha) {
        jTextFieldSenha.setText(senha);
    }
    public void setjTextFieldTelefone(String Telefone) {
        jTextFieldTelefone.setText(Telefone);
    }
    
    
    public ProfileView() {
        initComponents();
        setIcon();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogOut = new javax.swing.JButton();
        jButtonEditarPerfil = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JPasswordField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Perfil");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogOut.setBorder(null);
        jButtonLogOut.setContentAreaFilled(false);
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 320, 40));

        jButtonEditarPerfil.setBorder(null);
        jButtonEditarPerfil.setContentAreaFilled(false);
        jButtonEditarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 220, 30));

        jButtonSalvar.setBorder(null);
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 210, 30));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 270, 30));

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setBorder(null);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, 30));

        jTextFieldSenha.setEditable(false);
        jTextFieldSenha.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSenha.setBorder(null);
        jTextFieldSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jTextFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 270, 30));

        jTextFieldTelefone.setEditable(false);
        jTextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefone.setBorder(null);
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 270, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/ProfileViewTela.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPerfilActionPerformed
        // TODO add your handling code here:
           LoginController loginCon = new LoginController();
           InformacoesLogin usuario = null;
        try {
           usuario = loginCon.buscarInformacoes(email);
        if(usuario != null) {   
           setJTextFieldEmail(usuario.getEmail());
           jTextFieldEmail.setEditable(true);    
           
           setjTextFieldNome(usuario.getNome());
           jTextFieldNome.setEditable(true);
           
           setjTextFieldSenha(usuario.getSenha());
           jTextFieldSenha.setEditable(true);
           
           setjTextFieldTelefone(usuario.getTelefone());
           jTextFieldTelefone.setEditable(true);
           jButtonEditarPerfil.setEnabled(false);
           jButtonSalvar.setEnabled(true);
          // jButtonEditarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        }   
        } catch (SQLException ex) {
            Logger.getLogger(ProfileView.class.getName()).log(Level.SEVERE, null, ex);
        }
           

           
                                         
    }//GEN-LAST:event_jButtonEditarPerfilActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        LoginController loginCon = new LoginController();
        try {
            HashCode hs = new HashCode();
            String pass = hs.hashPassword(jTextFieldSenha.getText());
            loginCon.alterarInformacoes(jTextFieldEmail.getText(), jTextFieldNome.getText(), pass, jTextFieldTelefone.getText(), this.getEmail());
            jButtonEditarPerfil.setEnabled(true);
            jButtonSalvar.setEnabled(false);
        } catch (SQLException e) {
            Logger.getLogger(ProfileView.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarPerfil;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JPasswordField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/resoucer/Icon.png"));
    }
}
