/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import br.com.login.dao.ProjetoDAO;
import br.com.login.model.InfoProjeto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;


public class CadastroProjetoView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProjetoView
     */
    public CadastroProjetoView() { 
        super ("Cadastro projeto");
        initComponents();
        buscarProjeto();
    }
    
    
    public ArrayList minhaODS (){
        ArrayList<String> ods = new ArrayList<>();

        // Popula o ArrayList com os valores desejados
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
        // Retorna o ArrayList populado
        return ods;
    }
    
    private void buscarProjeto(){

        // Obtém a lista de ODS chamando o método minhaODS
        ArrayList<String> ods = minhaODS();

        // Adiciona os elementos da lista ao JComboBox
        for (String item : ods) {
        ComboBoxCadastroProjeto.addItem(item);
    }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        ComboBoxCadastroProjeto = new javax.swing.JComboBox<>();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
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
        getContentPane().add(ComboBoxCadastroProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 20));

        jTextFieldNome.setBorder(null);
        jTextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 20));

        jTextFieldData.setBorder(null);
        getContentPane().add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 20));

        jTextFieldDescricao.setBorder(null);
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 230, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/AdicionarProjeto.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxCadastroProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCadastroProjetoActionPerformed
        try {
            String selecao = (String) ComboBoxCadastroProjeto.getSelectedItem();
                // Insere a seleção do usuário no banco de dados MySQL
                ProjetoDAO projetoDAO = new ProjetoDAO();
            projetoDAO.inserirProjeto(selecao, jTextFieldDescricao.getText());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProjetoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboBoxCadastroProjetoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
