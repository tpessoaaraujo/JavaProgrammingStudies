package br.com.tpessoaaraujo.produtos.repository;

import br.com.tpessoaaraujo.produtos.model.Categoria;
import br.com.tpessoaaraujo.produtos.model.Produto;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class ProdutosCollectionRepository {
    private static List<Produto> produtos;

    static {
        produtos = new Vector<>();

        Produto kindle = new Produto();
        kindle.setNome("Kindle 16GB")
                .setDescricao("E-Reader da Amazon")
                .setCategoria(CategoriaCollectionRepository.findById(2l))
                .setDataCadastro(LocalDateTime.now())
                .setValor(614.99);
        save(kindle);
    }

    public static List<Produto> findAll() {
        return produtos;
    }

    public static Produto save (Produto produto) {
        if (!produtos.contains(produto)) {
            produto.setId((long)produtos.size() + 1);
            produtos.add(produto);
            return produto;
        } else {
            JOptionPane.showMessageDialog(null, "Já existe um produto com esse nome.");
            return null;
        }
    }

    public static List<Produto> findByCategoria(Categoria categoria) {
        return produtos.stream()
                .filter(p -> p.getCategoria().equals(categoria))
                .toList();
    }
}