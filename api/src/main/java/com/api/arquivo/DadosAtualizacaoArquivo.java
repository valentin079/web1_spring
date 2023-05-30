package com.api.arquivo;


public record DadosAtualizacaoArquivo(
        Long id,
        String nome,
        String telefone,
        String email,
        String data_nascimento) {

}
