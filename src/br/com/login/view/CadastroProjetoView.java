package br.com.login.view;

import br.com.login.dao.ProjetoDAO;
import br.com.login.model.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class CadastroProjetoView extends javax.swing.JFrame {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public CadastroProjetoView() { 
        super ("Cadastro projeto");
        initComponents();
        buscarProjeto();
    }
    
    
    public ArrayList minhaODS (){
        ArrayList<String> ods = new ArrayList<>();

        ods.add("1- Erradicação da pobreza");
        ods.add("2- Fome zero e agricultura sustentável");
        ods.add("3 - Saúde e Bem-Estar");
        ods.add("4 - Educação de qualidade");
        ods.add("5 - Igualdade de género");
        ods.add("6 - Água potável e saneamento");
        ods.add("7 - Energia limpa e acessível");
        ods.add("8 - Trabalho decente e crescimento económico");
        ods.add("9 - Indústria, inovação e infraestrutura");
        ods.add("10 - Redução das desigualdades");
        ods.add("11 - Cidades e comunidades sustentáveis");        
        ods.add("12 - Consumo e produção responsáveis");
        ods.add("13 - Ação contra a mudança global do clima");
        ods.add("14 - Vida na água"); 
        ods.add("15 - Vida terrestre");
        ods.add("16 - Paz, justiça e instituições eficazes");
        ods.add("17 - Parcerias e meios de implementação");
        return ods;
    }
    
    private void buscarProjeto(){

        ArrayList<String> ods = minhaODS();

        for (String item : ods) {
        ComboBoxCadastroProjeto.addItem(item);
    }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        ComboBoxCadastroProjeto = new javax.swing.JComboBox<>();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxCadastroProjeto.setToolTipText("");
        ComboBoxCadastroProjeto.setBorder(null);
        ComboBoxCadastroProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboBoxCadastroProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCadastroProjetoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxCadastroProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 20));

        jTextFieldDescricao.setBorder(null);
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 30));

        jButtonAdicionar.setBorder(null);
        jButtonAdicionar.setContentAreaFilled(false);
        jButtonAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 200, 40));

        jButtonMenu.setBorder(null);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 437, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/AddNewProject.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxCadastroProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCadastroProjetoActionPerformed

    }//GEN-LAST:event_ComboBoxCadastroProjetoActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        try {
            String selecao = (String) ComboBoxCadastroProjeto.getSelectedItem();
                // Insere a seleção do usuário no banco de dados MySQL
                ProjetoDAO projetoDAO = new ProjetoDAO();
                Login lg = new Login();
            projetoDAO.inserirProjeto(selecao, lg.getEmail(),jTextFieldDescricao.getText(), true);
            System.out.println(lg.getEmail());
            int response = JOptionPane.showConfirmDialog(null, "Deseja consultar seu projeto cadastrado?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION){
                this.setVisible(false);
                ProjetoView pv = new ProjetoView();
                pv.setVisible(true);
            } else if ( response == JOptionPane.NO_OPTION) {
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProjetoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed
    
    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProjetoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProjetoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCadastroProjeto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
}
