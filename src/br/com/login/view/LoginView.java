package br.com.login.view;

import br.com.login.controller.LoginController;
import br.com.login.model.InformacoesLogin;
import br.com.login.writer.FileUtil;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class LoginView extends javax.swing.JFrame {
    
    private String email;
    
   
    public void setEmail(String email) {
        this.email = email;
    }    
    
    public String getEmail(){
        return jTextFieldEmail.getText();
    }
    
    public LoginView() {
        initComponents();
        setIcon();
        adicionarShutdownHook();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonRealizarCadastro = new javax.swing.JButton();
        jButtonEntrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextFieldEmail.setBorder(null);
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 340, 30));

        jPasswordFieldSenha.setBorder(null);
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 340, 30));

        jButtonRealizarCadastro.setForeground(new java.awt.Color(255, 102, 204));
        jButtonRealizarCadastro.setText("Não tem uma conta? Cadastrar");
        jButtonRealizarCadastro.setBorderPainted(false);
        jButtonRealizarCadastro.setContentAreaFilled(false);
        jButtonRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 220, 30));

        jButtonEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar1.setContentAreaFilled(false);
        jButtonEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 260, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/Login-Purple.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarCadastroActionPerformed
        CadastroView telaDeCadastro = new CadastroView();
        this.setVisible(false);
        telaDeCadastro.setVisible(true);
        
    }//GEN-LAST:event_jButtonRealizarCadastroActionPerformed

    
    private void jButtonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrar1ActionPerformed

        if(jTextFieldEmail.getText().matches("")|| jPasswordFieldSenha.getText().matches("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        } else {
            
        try {
            LoginController login = new LoginController();
            boolean resultado = login.loginUsuario(this);
        if (resultado) {            
            MenuView menuView = new MenuView();
            FileUtil.salvarEmail(jTextFieldEmail.getText());
            menuView.setVisible(true);
            this.setVisible(false);
            
            
        
        }else {
        JOptionPane.showMessageDialog(null, "Email ou senha invalidos", "Tente Novamente", 0);
        }
        } catch(SQLException sql) {
        JOptionPane.showMessageDialog(null, "Erro SQL", "Tente Novamente", 0);
        }

    }//GEN-LAST:event_jButtonEntrar1ActionPerformed
    }
    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    
    
    
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar1;
    private javax.swing.JButton jButtonRealizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/resoucer/Icon.png"));
    }

    private void adicionarShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(FileUtil::deletarArquivo));
    }
}
