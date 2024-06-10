/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/** Esta classe serve para realizar a coneão com o banco de dados MySQL.
 * 
 * @author Marcos.Gustavo
 * @version 1.0
 * @since 27/05/2024
 */
public class Conexao {

private static final String USERNAME = "root";

private static final String PASSWORD = "";

private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/livroteca";

/**
 * 
 * @return esse método retornará a conexão com o Banco de Dados.
 * @throws Exception O método irá utilizado o link do banco de dados, nome do usuário e senha para tentar se conectar a este banco de dados.
 */
public static Connection createConnectionToMysql() throws Exception {
    
Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

 return connection;
}
/** 
 * 
 * @param args
 * @throws Exception Aqui no Main será instanciado a conexão com o banco de dados MySQL, aonde este método vai retornar uma mensagem se a conexão com o banco foi um sucesso ou não.
 */
        public static void main(String[] args) throws Exception{
            
            Connection con = createConnectionToMysql();
            
            if(con != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                con.close();
            } else {System.out.println("Falha na Conexão!");
            
        }
}

}
