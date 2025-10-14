package br.com.tpessoaaraujo.produtos.view;

import br.com.tpessoaaraujo.produtos.model.Categoria;
import br.com.tpessoaaraujo.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {
    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria) {
        Categoria retorno = (Categoria) JOptionPane.showInputDialog(
                null,
                "Selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(),
                categoria == null ? 1 : categoria);
        return retorno;
    }

    public void sucesso() {
        JOptionPane.showMessageDialog(null, "Categoria foi salva com sucesso!");
    }

    public void sucesso(Categoria categoria) {
        JOptionPane.showMessageDialog(null, "Categoria " + categoria.getNomeCategoria() + " foi salva com sucesso!");
    }

    public static Categoria form(Categoria categoria) {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da categoria", categoria != null ? categoria.getNomeCategoria() : "");
        return new Categoria(nome);
    }
}