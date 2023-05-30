package com.api.arquivo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_emerson")
@Entity(name = "Arquivo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Arquivo {
    //JPA
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String data_nascimento;

    public Arquivo(DadosArquivo dados) {
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.data_nascimento = dados.data_nascimento();

    }

    public void atualizar(DadosAtualizacaoArquivo dados) {
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.data_nascimento = dados.data_nascimento();
    }
}
