package br.com.tpessoaaraujo.produtos.view;

import javax.swing.*;

public class OpcaoView {
    public static Opcao select() {
        Opcao retorno = (Opcao) JOptionPane.showInputDialog(
          null,
          "Selecione uma opção",
          "Menu",
          JOptionPane.QUESTION_MESSAGE,
          null,
          Opcao.values(),
          Opcao.CADASTRAR_PRODUTO);

        return retorno != null ? retorno : Opcao.ENCERRAR_SISTEMA;
    }
}