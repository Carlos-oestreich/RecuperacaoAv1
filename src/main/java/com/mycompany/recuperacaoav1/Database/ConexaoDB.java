/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacaoav1.Database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class ConexaoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/db_biblioteca";
    
    private static final String USUARIO = "root";
    
    private static final String SENHA = "root";
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    private static Connection con = null;
    
    public static Connection getConexao() throws SQLException{
        
        try {
            
            Class.forName(DRIVER);
            
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            System.out.println("Conexao com o banco bem sucedido!");
            return con;
        }catch (ClassNotFoundException e){
            System.out.println("ERRO driver -> " + e);
        
        }catch(SQLException e){
            System.out.println("ERRO SQL -> " + e);
        }
        
        return con;
    }
    
}
