package com.api.controller;

import com.api.arquivo.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tb_emerson/")
public class ArquivoController {

    @Autowired
    private ArquivoRepository repository;



    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosArquivo dados){
        repository.save(new Arquivo(dados));
    }

    @GetMapping
    public List<DadosListagemArquivo> listar(){
        return repository.findAll().stream().map(DadosListagemArquivo::new).toList();
    }



    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoArquivo dados){
        var arquivo = repository.getReferenceById(dados.id());
        arquivo.atualizar(dados);
    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    public void search(Long id){
        var arquivos = repository.getReferenceById(id);

    }
}
