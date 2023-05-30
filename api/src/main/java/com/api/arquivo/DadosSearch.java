package com.api.arquivo;

public record DadosSearch(String nome, String telefone, String email, String data_nascimento) {
    public DadosSearch(Arquivo arquivo){
        this(arquivo.getNome(), arquivo.getTelefone(), arquivo.getEmail(), arquivo.getData_nascimento());
    }
}
