package com.tpessoaaraujo.api_voll_med.medico;

import com.tpessoaaraujo.api_voll_med.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
