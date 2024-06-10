/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Dao.LivrosDao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Livro;

/** Classe ListarLivrosAdmin
 * Esta classe é a tela aonde serão listados os livros cadastrados no banco de dados na tela do administrador.
 *
 * @author marcos.gustavo
 * @version 1.0
 * @since 31/05/2024
 */
public class ListarLivrosAdmin extends javax.swing.JFrame {

    

            /** Leitura JTable
     * é o metodo utilizado para adicionar livros na tabela. Basicamente ele adiciona um livro a uma linha, assim listando os livros na tela
     * 
     */
public void LeituraJTable(){
                          LivrosDao livrodao = new LivrosDao();
 DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
 
 
   int contagem = tabela.getRowCount();
   for(int i = 0;i<contagem;i++){
       tabela.removeRow(i-i);
       
   }
 
        for (Livro livro : livrodao.listarLivros()) {
                String Id = String.valueOf(livro.getId());
             String Nome = livro.getNome();
             String Autor = livro.getAutor();
             String Editora = livro.getEditora();
             String Categoria = livro.getCategoria();
             String DataPublicacao = livro.getDataPublicacao();
             String DataConvertida = DataPublicacao.substring(8,10) + "/" + DataPublicacao.substring(5,7) + "/" + DataPublicacao.substring(0,4); 
      
            
        String Object[] = {Id,Nome, Autor,Editora,Categoria,DataConvertida};
        
        
       
         tabela.addRow(Object);
        }
        
}
       

/** pesquisa(String nome)
 * 
 * Este é um método utilizado para pesquisar livros no banco de dados e retornar os resultados.
 * @param nome guarda uma palavra que o banco de dados vai usar para procurar um livro que tenha essa palavra no Nome, Autor, Categoria, Editora ou Id.
 */

 public void pesquisa(String nome){
                          LivrosDao livrodao = new LivrosDao();
                          
 DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
 
 
   int contagem = tabela.getRowCount();
   for(int i = 0;i<contagem;i++){
       tabela.removeRow(i-i);
       
   }
 
        for (Livro livro : livrodao.pesquisarLivros(nome)) {
                String Id = String.valueOf(livro.getId());
             String Nome = livro.getNome();
             String Autor = livro.getAutor();
             String Categoria = livro.getCategoria();
             String Editora = livro.getEditora();
             String DataPublicacao = livro.getDataPublicacao();
            String DataConvertida = DataPublicacao.substring(8,10) + "/" + DataPublicacao.substring(5,7) + "/" + DataPublicacao.substring(0,4); 
      
            
        String Object[] = {Id,Nome, Autor,Editora,Categoria,DataConvertida};
        
        
       
         tabela.addRow(Object);
        }
        
}
    /** atualizarBanco()
     * Este método serve para atualizar a tabela que lista os dados dos livros. O tipo dessa varíavel é TimerTask, já que ela deve acontecer de tempos em tempos automaticamente.
     */
  TimerTask atualizarBanco = new TimerTask(){
      public void run(){
          LivrosDao livrodao = new LivrosDao();
 DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
 
 
   int contagem = tabela.getRowCount();
   for(int i = 0;i<contagem;i++){
       tabela.removeRow(i-i);
       
   }
 
        for (Livro livro : livrodao.listarLivros()) {
                String Id = String.valueOf(livro.getId());
             String Nome = livro.getNome();
             String Autor = livro.getAutor();
             String Editora = livro.getEditora();
             String Categoria = livro.getCategoria();
             String DataPublicacao = livro.getDataPublicacao();
String DataConvertida = DataPublicacao.substring(8,10) + "/" + DataPublicacao.substring(5,7) + "/" + DataPublicacao.substring(0,4); 

      
            
        String Object[] = {Id,Nome, Autor,Editora,Categoria,DataConvertida};
        
        
       
         tabela.addRow(Object);
        }
  }
  };
  
  /**Timer()
   * Este método é um complemento do método anterior! Nele basicamente é instanciado um método do tipo Timer ou Temporizador. Quando o temporizador chega em determinado tempo de funcionamento da tela, será inicializado o método atualizaBanco()
   */
 public void Timer(){
     
     
     Timer timer = new Timer();
     
    timer.schedule(atualizarBanco,1000);
        
};
 
 /** ListarLivrosAdmin()
   * é aqui aonde serão inicializadas a tela e suas informações. Aqui também é utilizado o método LeituraJTable para adicionar dados na tabela!
   */
     
    public ListarLivrosAdmin() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        LeituraJTable();
        Timer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Livros");

        jTable1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Autor", "Editora", "Categoria", "Ano de Publicação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(225);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(225);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(225);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("VER MAIS");
        jButton4.setMaximumSize(new java.awt.Dimension(94, 28));
        jButton4.setMinimumSize(new java.awt.Dimension(94, 28));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EDITAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 204, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CRIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("EXCLUIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(621, 621, 621))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(149, 149, 149)
                .addComponent(jButton2)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/** Neste método é utilizado o método LeituraJTable quando o usuário clicar no botão ATUALIZAR.
 * 
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
   
        LeituraJTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed
/** Botão de SAIR
 * Este método serve para quando o Administrador clicar no botão SAIR, aparecerá na tela uma mensagem pedindo pro Administrador confirmar a decisão já que ele será deslogado.
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         String[] options = {"Continuar", "Sair"};
         
           int Resposta = JOptionPane.showOptionDialog(null, "Se você sair, terá que logar como Administrador novamente!",
                "ATENÇÃO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
       
    if(Resposta == 1){
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }  
    }//GEN-LAST:event_jButton2ActionPerformed

/** Botão VER MAIS
 * Este método é utilizado quando se clica no botão VER MAIS. Este método leva o usuário até a tela SobreLivros.
 * Detalhe que este método é apenas utilizado quando o usuário seleciona um livro na tabela pegando o Id do livro nesse processo. O id desse livro é armazenado na varíavel pública Id lá na tela SobreLivros.
 * @param evt 
 */
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                   int selectedRow = jTable1.getSelectedRow();
        
        if(selectedRow!=-1){
      LivrosDao livrosdao=new LivrosDao();
      
      SobreLivros sobrelivros = new SobreLivros();
      Livro livro = new Livro();
      DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
      
      sobrelivros.id =String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0));
   
      
        sobrelivros.TelaAdmin = 1;
      sobrelivros.setVisible(true);
      sobrelivros.PuxaBanco();
      this.dispose();
     
        }else{
             JOptionPane.showMessageDialog(this, "Selecione um livro na tabela para ver mais detalhes.", "Nenhum livro selecionado", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton4ActionPerformed
/**
 * Neste método é inicializado o método pesquisa() adicionando o valor que será pesquisado no banco de dados ao clicar no botão BUSCAR
 * @param evt 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        pesquisa(jTextField1.getText());
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
/** Botão EDITAR
 * Este método é utilizado quando se clica no botão EDITAR. Este método leva o usuário até a tela EditarLivros para alterar algum dado neste livro.
 * Detalhe que este método é apenas utilizado quando o usuário seleciona um livro na tabela pegando o Id do livro nesse processo. O id desse livro é armazenado na varíavel pública Id lá na tela SobreLivros.
 * @param evt 
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              int selectedRow = jTable1.getSelectedRow();
           if(selectedRow!=-1){
        LivrosDao livrosdao = new LivrosDao();
               EditarLivros editarlivros = new EditarLivros();
               Livro livro = new Livro();
              DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
       
         editarlivros.id = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
         
         
            
        
        editarlivros.setVisible(true);
         editarlivros.PuxarBanco();
        this.dispose();
           } else{
             JOptionPane.showMessageDialog(this, "Selecione um livro na tabela para ver mais detalhes.", "Nenhum livro selecionado", JOptionPane.WARNING_MESSAGE);

        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
/** Botão CRIAR
 * Este método é utilizado para levar o administrador até a tela CriarLivros para o administrador criar livros.
 * @param evt 
 */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        

        CriarLivros criarlivros = new CriarLivros();
        criarlivros.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed
/** Botão Excluir
 * Este método serve para o administrador excluir o livro desejado. Antes de deletar o livro, aparece uma tela aonde o administrador deve confirmar a decisão.
 * @param evt 
 */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
         
        int selectedRow = jTable1.getSelectedRow();

if (selectedRow != -1) {
    DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
    String idString = tabela.getValueAt(selectedRow, 0).toString();

    try {
        String[] options = {"Cancelar", "Excluir"};
        int resposta = JOptionPane.showOptionDialog(null, "Deseja realmente excluir o livro?",
                "ATENÇÃO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (resposta == 1) {
            int idlivro = Integer.parseInt(idString);
            LivrosDao livrosDao = new LivrosDao();
            livrosDao.excluir(idlivro);
            LeituraJTable(); 
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um livro válido para excluir.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Por favor, selecione um livro para excluir.");
}
        

        
        
    }//GEN-LAST:event_jButton7ActionPerformed
    
    /**
     * Neste método Main é inicializado esta tela de Listar livros para o administrador.
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
            java.util.logging.Logger.getLogger(ListarLivrosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLivrosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLivrosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLivrosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLivrosAdmin().setVisible(true);
            }
        });
        
  
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}       
