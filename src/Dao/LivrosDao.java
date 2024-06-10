/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import database.Conexao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Livro;
/** Classe LivrosDao
 * Nesta classe estão métodos utilizados para manipular os dados no banco de dados pelo código, como Criar, Excluir, Alterar e Listar, por exemplo.
 * @author marcos.gustavo
 * @version 1.0
 * @since 31/05/2024
 */


public class LivrosDao {
    
            /** Método Criar()
     * Este método é utilizado quando se quer criar um livro novo no banco de dados.
     * @param livro é utilizado para pegar os dados que foram manipulados na classe Livro e traze-los para aqui.
     */
    
    public void criar(Livro livro) {
        
        String sql = "INSERT INTO livro(nome, categoria, autor, editora, sinopse, dataPublicacao) VALUES (?,?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = Conexao.createConnectionToMysql();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
             pstm.setString(1,livro.getNome());
            pstm.setString(2, livro.getCategoria());
            pstm.setString(3, livro.getAutor());
            pstm.setString(4,livro.getEditora());
            pstm.setString(5,livro.getSinopse());
            pstm.setString(6, livro.getDataPublicacao());
        
            pstm.execute();
            
            System.out.println("Livro Cadastrado com sucesso!!");
           } catch (Exception e) {
               
               System.out.println("Não foi possível realizar o cadastro!");
               e.printStackTrace();
           } finally {
            
            try {
                if (pstm != null) {pstm.close();}
                if(conn != null) {conn.close();}
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
                  /** Método listarLivros()
     * Este método é utilizado quando se quer Listar VÁRIOS Livros na tela.
     * @return Retorna TODOS os livros em forma de lista.
     */    

    
    public List<Livro>listarLivros(){
        
        String sql = "SELECT * FROM livro";
        
        List<Livro> livros = new ArrayList<Livro>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            conn = Conexao.createConnectionToMysql();
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        
        rset = pstm.executeQuery();
        
        while (rset.next()){
            
            Livro livro = new Livro();
            
            livro.setId(rset.getInt("idLivro"));
            livro.setNome(rset.getString("nome"));
            livro.setCategoria(rset.getString("categoria"));
            livro.setAutor(rset.getString("autor"));
            livro.setEditora(rset.getString("editora"));
            livro.setSinopse(rset.getString("sinopse"));
            livro.setDataPublicacao(rset.getString("dataPublicacao"));
            
          livros.add(livro);
        
        }
            System.out.println("Livros listados com sucesos!");
        } catch (Exception e) {
            System.out.println("Erro ao listar os livros!!");
          e.printStackTrace();
        } finally {
            try{
                if(pstm != null){ pstm.close();}
                if(conn != null){conn.close();}
                if(rset != null) {rset.close();}
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return livros;
    }
    
                 /** Método pesquisarLivros()
     * Este método é utilizado quando se quer utilizar uma barra de pesquisa no código para buscar alguma informação de nome, categoria, editora, autor ou ID do livro desejado.
     * @param nomeLivro é o nome da varíavel utilizada para armazenar a palavra no qual será buscada no banco de dados.
     * @return Retorna o livro que contenha no Autor, Categoria, Nome, Editora ou Id a palavra pesquisa. 
     */
    
      public List<Livro>pesquisarLivros(String nomeLivro){
        
        String sql = "SELECT * FROM livro WHERE nome LIKE ? or autor LIKE ? or categoria LIKE ? or editora LIKE ? or idLivro LIKE ?; ";
        
        List<Livro> livros = new ArrayList<Livro>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            conn = Conexao.createConnectionToMysql();
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        pstm.setString(1,"%"+nomeLivro+"%");
        pstm.setString(2,"%"+nomeLivro+"%");
        pstm.setString(3,"%"+nomeLivro+"%");
        pstm.setString(4,"%"+nomeLivro+"%");
        pstm.setString(5,"%"+nomeLivro+"%");
        rset = pstm.executeQuery();
        
        while (rset.next()){
            
            Livro livro = new Livro();
            
            livro.setId(rset.getInt("idLivro"));
            livro.setNome(rset.getString("nome"));
            livro.setCategoria(rset.getString("categoria"));
            livro.setAutor(rset.getString("autor"));
            livro.setEditora(rset.getString("editora"));
            livro.setSinopse(rset.getString("sinopse"));
            livro.setDataPublicacao(rset.getString("dataPublicacao"));
            
          livros.add(livro);
        
        }
            System.out.println("Livros listados com sucesos!");
        } catch (Exception e) {
            System.out.println("Erro ao listar os livros!!");
          e.printStackTrace();
        } finally {
            try{
                if(pstm != null){ pstm.close();}
                if(conn != null){conn.close();}
                if(rset != null) {rset.close();}
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return livros;
    }
        
               /** Método ListarApenasUm()
     * Este método é utilizado quando se quer Listar APENAS UM livro. É utilizado quando se quer ver informações de apenas um livro na tela.
     * @param nomeLivro. Neste paramêtro é armazenado o id do livro desejado para ver suas informações.
     * @return Retorna APENAS UM livro listado.
     */
    
    
       public List<Livro>ListarApenasUm(String nomeLivro){
        
        String sql = "SELECT * FROM livro WHERE idLivro = ? ";
        
        List<Livro> livros = new ArrayList<Livro>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            conn = Conexao.createConnectionToMysql();
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        pstm.setString(1,nomeLivro);
        rset = pstm.executeQuery();
        
        while (rset.next()){
            
            Livro livro = new Livro();
            
            livro.setId(rset.getInt("idLivro"));
            livro.setNome(rset.getString("nome"));
            livro.setCategoria(rset.getString("categoria"));
            livro.setAutor(rset.getString("autor"));
            livro.setEditora(rset.getString("editora"));
            livro.setSinopse(rset.getString("sinopse"));
            livro.setDataPublicacao(rset.getString("dataPublicacao"));
            
          livros.add(livro);
        
        }
            System.out.println("Livro listado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao listar os livro!!");
          e.printStackTrace();
        } finally {
            try{
                if(pstm != null){ pstm.close();}
                if(conn != null){conn.close();}
                if(rset != null) {rset.close();}
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return livros;
    }

                      /** Método alterar()
     * Este método é usado quando se quer alterar algum dado (nome, categoria, editora, sinopse e etc) do livro no banco de dados.
     * @param livro é utilizado para pegar os dados que foram manipulados na classe Livro e traze-los para aqui. 
     * 
     */
       
    
    public void alterar(Livro livro){
        String sql = "UPDATE livro SET nome=?,categoria = ?, autor = ?, editora = ?, sinopse = ?, dataPublicacao = ? WHERE idLivro = ?;";
         
         Connection conn = null;
            PreparedStatement pstm = null;
            
            try {
                conn = Conexao.createConnectionToMysql();
                pstm = (PreparedStatement) conn.prepareStatement(sql);
          
        
                
                
            pstm.setString(1,livro.getNome());
            pstm.setString(2, livro.getCategoria());
            pstm.setString(3, livro.getAutor());
            pstm.setString(4,livro.getEditora());
            pstm.setString(5,livro.getSinopse());
            pstm.setString(6, livro.getDataPublicacao());
            pstm.setInt(7, livro.getId());
        
         pstm.executeUpdate();
              System.out.println("Livro alterado com sucesso!");
            } catch (Exception e) {
                
                System.out.println("Erro ao tentar alterar os dados do livro!");
                e.printStackTrace();
            } finally {
                try{
                    if(pstm!=null) {pstm.close();}
                    if(pstm!=null){pstm.close();}
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
    
                          /** Método excluir()
     * Este método é utilizado para excluir livros pelo id dos livros desejados.
     * @param id é usado para armazenar o id do livro no qual o usuário deseja excluir. 
     */
    
    public void excluir (int id){
        String sql = "DELETE FROM livro WHERE idLivro = ?";
    Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
             conn = Conexao.createConnectionToMysql();
                pstm = (PreparedStatement) conn.prepareStatement(sql);
                
                pstm.setInt(1,id);
                pstm.execute();
                
                JOptionPane.showMessageDialog(null,"Livro Excluído com sucesso!");
                
         } catch (Exception e) {
            
                System.out.println("Erro ao tentar excluir o livro");
                e.printStackTrace();
                
            } finally {
                
                try {
                    
                    if(pstm!= null) {pstm.close();}
                    if(conn != null){conn.close();}
                } catch (Exception e) {
                
                e.printStackTrace();
                
                } 
        }
    }
    
    /** Método buscarLivroPorId()
     * 
     * @param id
     * @return 
     * 
     */
       
    
        public Livro buscarLivroPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    
    
    
    

