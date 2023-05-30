package com.api.arquivo;


import jakarta.validation.constraints.NotBlank;

public record DadosArquivo(
        //DTO
        @NotBlank
        String nome,
        @NotBlank
        String telefone,
        @NotBlank
        String email,
        @NotBlank
        String data_nascimento) {
}
