package com.tpessoaaraujo.api_voll_med.paciente;

import com.tpessoaaraujo.api_voll_med.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String email,
        DadosEndereco endereco) {
}
