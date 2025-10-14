package br.com.tpessoaaraujo.produtos;

import br.com.tpessoaaraujo.produtos.model.Categoria;
import br.com.tpessoaaraujo.produtos.model.Produto;
import br.com.tpessoaaraujo.produtos.repository.CategoriaCollectionRepository;
import br.com.tpessoaaraujo.produtos.repository.ProdutosCollectionRepository;
import br.com.tpessoaaraujo.produtos.view.CategoriaView;
import br.com.tpessoaaraujo.produtos.view.Opcao;
import br.com.tpessoaaraujo.produtos.view.OpcaoView;
import br.com.tpessoaaraujo.produtos.view.ProdutoView;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Opcao opcao = null;

        do {
            opcao = OpcaoView.select();
            switch (opcao) {
                case CADASTRAR_CATEGORIA -> cadastrarCategoria();
                case CADASTRAR_PRODUTO -> cadastrarProduto();
                case ALTERAR_PRODUTO -> alterarProduto();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                case ENCERRAR_SISTEMA -> encerrarSistema();
            }
        } while (opcao != Opcao.ENCERRAR_SISTEMA);
    }

    private static void encerrarSistema() {
        System.exit(0);
    }

    private static void consultarProdutoPorCategoria() {
        Categoria categoria = CategoriaView.select(null);
        List<Produto> produtos = ProdutosCollectionRepository.findByCategoria(categoria);
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com essa categoria");
        } else {
            produtos.forEach(ProdutoView::show);
            produtos.forEach(System.out::println);
        }
    }

    private static void alterarProduto() {
        Produto produto = ProdutoView.select(null);
        ProdutoView.update(produto);
    }

    private static void cadastrarProduto() {
        Produto produto = ProdutoView.form(new Produto());
        ProdutosCollectionRepository.save(produto);
        ProdutoView.sucesso(produto);
    }

    private static void cadastrarCategoria() {
        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form(new Categoria());
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);
    }
}