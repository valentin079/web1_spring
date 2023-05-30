package com.api.arquivo;

public record DadosListagemArquivo(Long id, String nome, String telefone, String email, String data_nascimento) {

    public DadosListagemArquivo(Arquivo arquivo) {
        this(arquivo.getId(), arquivo.getNome(), arquivo.getTelefone(), arquivo.getEmail(), arquivo.getData_nascimento());
    }
}


