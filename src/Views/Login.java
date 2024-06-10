/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/** Classe Login
 * Esta classe é a tela aonde o usuário poderá fazer login como administrador.
 *
 * @author Pedro
 * @version 1.0
 * @since 31/05/2024
 */
public class Login extends javax.swing.JFrame {

  
    
    /** Logar()
     * Neste método é pego os dados inseridos pelo usuário no Nome e na Senha para fazer Login. Se os dados estiverem certos, o usuário faz login como administrador e é levado até a tela de Listar Livros como Administrador. Caso contrário, ele emite um erro.
     */
    public void logar(){
        
       
                 String usuario = jNome.getText();
        String senha = jSenha.getText();
        
         if(     "admin".equals(usuario) || "administrador".equals(usuario) || "Administrador".equals(usuario) || "Administrator".equals(usuario) || "administrator".equals(usuario)   ){
             usuario = "Admin";
         }
        if ("Admin".equals(usuario) && "123".equals(senha)) {
            JOptionPane.showMessageDialog(this, "Login Bem-Sucedido!");
            ListarLivrosAdmin listarlivrosadmin = new ListarLivrosAdmin();
            listarlivrosadmin.setVisible(true);
            this.dispose();
        }else {
           JOptionPane.showMessageDialog(null, "O Usuário ou a Senha são invalidos!", "LOGIN INVÁLIDO!", JOptionPane.ERROR_MESSAGE);
             jNome.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
              jSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }
    
    /**Login()
     * Aqui são inicializados os componentes da tela além de centralizá-la para abrir no meio da tela.
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jSair = new javax.swing.JButton();
        jVerificar = new javax.swing.JButton();
        jSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(350, 365));
        setSize(new java.awt.Dimension(300, 300));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 90, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 60, 20);

        jNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNome.setActionCommand("null");
        jNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jNome.setDragEnabled(true);
        jNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNomeMouseClicked(evt);
            }
        });
        getContentPane().add(jNome);
        jNome.setBounds(50, 100, 210, 30);

        jSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSair.setText("Sair");
        jSair.setToolTipText("");
        jSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        getContentPane().add(jSair);
        jSair.setBounds(20, 300, 60, 24);

        jVerificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jVerificar.setText("Entrar");
        jVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(jVerificar);
        jVerificar.setBounds(120, 240, 80, 30);

        jSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSenhaMouseClicked(evt);
            }
        });
        jSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jSenha);
        jSenha.setBounds(50, 180, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/** Botão LOGIN
 * Neste método quando se clica no botão de Login é inicializado o método Logar() para verificar se o usuário pode ou não logar como administrador.
 * @param evt 
 */
    private void jVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerificarActionPerformed
        // TODO add your handling code here:
        logar();

    }//GEN-LAST:event_jVerificarActionPerformed
/**Botão SAIR
 * Neste método o usuário pode retornar para a tela de menu().
 * @param evt 
 */
    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        
          this.dispose();  
        Menu men = new Menu();
        men.setVisible(true);
        
    }//GEN-LAST:event_jSairActionPerformed

    private void jSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSenhaActionPerformed
/** Este método serve para a borda do Nome e da Senha  ficar cinza após o usuário errar o Nome ou a Senha.
 * 
 * @param evt 
 */
    private void jNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNomeMouseClicked
        jNome.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    }//GEN-LAST:event_jNomeMouseClicked

    private void jSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSenhaMouseClicked
       jSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    }//GEN-LAST:event_jSenhaMouseClicked

    /** O método Main instancia e inicializa a tela de Login.
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNome;
    private javax.swing.JButton jSair;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JButton jVerificar;
    // End of variables declaration//GEN-END:variables
}
