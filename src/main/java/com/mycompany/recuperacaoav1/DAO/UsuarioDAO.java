/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacaoav1.DAO;

import com.mycompany.recuperacaoav1.Database.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author USUARIO
 */
public class UsuarioDAO {
    
    public boolean checarUsuario(String email, String senha)throws Exception{
        String sql = "SELECT * FROM tb_usuarios WHERE email = ? AND senha = ?";
        
        try(Connection conn = ConexaoDB.getConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, email);
            ps.setString(2, senha);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    
}
