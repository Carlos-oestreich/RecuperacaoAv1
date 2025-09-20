/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacaoav1.DAO;

import com.mycompany.recuperacaoav1.Database.ConexaoDB;
import com.mycompany.recuperacaoav1.Model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class LivroDAO {
    
    private Connection con;


        public void salvarLivro(Livro l) throws SQLException{
           String sql = "INSERT INTO tb_livros (titulo, editora, ano, disponivel) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexaoDB.getConexao(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getEditora());
            ps.setString(3, l.getAno());
            ps.setBoolean(4, l.isDisponivel());
            ps.executeUpdate();
        } 
        
        }
        
        public static ArrayList<Livro> retornarListaDeLivros() throws SQLException {
        String sql = "SELECT * FROM tb_livros";
        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Livro l = new Livro();
                l.setId(rs.getInt("id"));
                l.setTitulo(rs.getString("titulo"));
                l.setEditora(rs.getString("editora"));
                l.setAno(rs.getString("ano"));
                l.setDisponivel(rs.getBoolean("disponivel"));
                listaDeLivros.add(l);
            }
        }
        return listaDeLivros;
        }
        
        public void editarLivro(Livro l) throws SQLException {
        String sql = "UPDATE tb_livros SET titulo = ?, editora = ?, ano = ?, disponivel = ? WHERE id = ?";
        try (Connection con = ConexaoDB.getConexao(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getEditora());
            ps.setString(3, l.getAno());
            ps.setBoolean(4, l.isDisponivel());
            ps.setInt(5, l.getId()); 
            ps.executeUpdate();
        }
    }
        public void excluirLivro(int id) throws SQLException {
               String sql = "DELETE FROM tb_livros WHERE id = ?";
               try (Connection con = ConexaoDB.getConexao(); 
                    PreparedStatement ps = con.prepareStatement(sql)) {

                   ps.setInt(1, id);
                   ps.executeUpdate();
               }
}
}
            
    
