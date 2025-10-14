package br.com.tpessoaaraujo.produtos.view;

import br.com.tpessoaaraujo.produtos.model.Categoria;
import br.com.tpessoaaraujo.produtos.model.Produto;
import br.com.tpessoaaraujo.produtos.repository.ProdutosCollectionRepository;

import javax.swing.*;
import java.time.LocalDateTime;

public class ProdutoView {
    public static Produto form(Produto produto) {
        Categoria categoria = null;
        String nome = "";
        String descricao = "";
        Double valor = 0.0;

        do {
            categoria = CategoriaView.select(produto.getCategoria());
        } while (categoria == null);

        do {
            nome = JOptionPane.showInputDialog(null, "Informe o nome do produto", produto.getNome());
        } while (nome.equals(""));

        do {
            descricao = JOptionPane.showInputDialog(null, "Informe a descrição do produto", produto.getDescricao());
        } while (descricao.equals(""));

        do {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto", produto.getValor()));
            } catch (Exception e) {
                valor = 0.0;
            }
        } while (valor <= 0.0);

        Produto retorno = produto;
        retorno.setCategoria(categoria)
                .setNome(nome)
                .setDescricao(descricao)
                .setDataCadastro(LocalDateTime.now())
                .setValor(valor);

        return retorno;
    }

    public void sucesso() {
        JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
    }

    public static void sucesso(Produto produto) {
        JOptionPane.showMessageDialog(null, "Produto " + produto.getNome() + " salvo com sucesso!");
    }

    public static Produto select(Produto produto) {
        Produto retorno = (Produto) JOptionPane.showInputDialog(
                null,
                "Selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                ProdutosCollectionRepository.findAll().toArray(),
                produto == null ? 1 : produto);
        return retorno;
    }

    public static void update(Produto produto) {
        form(produto);
        sucesso(produto);
        show(produto);
    }

    public static void show(Produto produto) {
        String textoFormatado = String.format(
                "PRODUTO: " + produto.getNome() + System.lineSeparator() +
                "DESCRIÇÃO: " + produto.getDescricao() +  System.lineSeparator() +
                "CATEGORIA: " + produto.getCategoria() +  System.lineSeparator() +
                "VALOR: %,.2f", produto.getValor()
        );

        System.out.println(produto);
        JOptionPane.showMessageDialog(null, textoFormatado);
    }
}