package dev.brainfit.aluno;

import dev.brainfit.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "Aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String email;
    private String telefone;
    private String sexo;
    @Embedded private Endereco endereco;
    private Number ativo;
    
    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.sexo = dados.sexo();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarAluno(DadosAtualizaAluno dados) {
        if(dados.email() != null){
            this.email = dados.email();
        }
        if(dados.telefone() != null){
            this.email = dados.telefone();
        }
        if(dados.endereco() != null){
            this.endereco.atualizaEndereco(dados.endereco());
        }
    }

    public void excluirAluno() {
        this.ativo = 0;
    }
}
