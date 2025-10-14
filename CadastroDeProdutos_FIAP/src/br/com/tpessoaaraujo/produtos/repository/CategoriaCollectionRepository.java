package br.com.tpessoaaraujo.produtos.repository;

import br.com.tpessoaaraujo.produtos.model.Categoria;
import br.com.tpessoaaraujo.produtos.model.Produto;

import javax.swing.*;
import java.util.List;
import java.util.Vector;

public class CategoriaCollectionRepository {
    private static List<Categoria> categorias;

    static {
        categorias = new Vector<>();

        Categoria livros = new Categoria(1l, "Livros");
        Categoria eletronicos = new Categoria(2l, "Eletrônicos");
        Categoria utilitarios = new Categoria(3l, "Utilitários");

        categorias.add(livros);
        categorias.add(eletronicos);
        categorias.add(utilitarios);
    }

    public static List<Categoria> findAll() {
        return categorias;
    }

    public static Categoria findById(Long id) {
        return categorias.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static List<Categoria> findByNome(String nome) {
        return categorias.stream()
                .filter(c -> c.getNomeCategoria().equalsIgnoreCase(nome))
                .toList();
    }

    public static Categoria save(Categoria categoria) {
        if (!categorias.contains(categoria)) {
            categoria.setId((long)categorias.size() + 1);
            categorias.add(categoria);
            return categoria;
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma categoria com esse nome.");
            return null;
        }
    }
}