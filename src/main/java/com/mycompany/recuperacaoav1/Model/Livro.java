/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacaoav1.Model;

/**
 *
 * @author USUARIO
 */
public class Livro {
    private int id;
    private String titulo;
    private String editora;
    private String ano;
    private boolean disponivel;

    public Livro() {
    }

    public Livro(int id, String titulo, String autor, String ano, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.editora = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo=" + titulo + ", editora=" + editora + ", ano=" + ano + ", disponivel=" + disponivel + '}';
    }
    
    
    
}
