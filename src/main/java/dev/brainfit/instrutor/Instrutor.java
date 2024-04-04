package dev.brainfit.instrutor;

import dev.brainfit.endereco.Endereco;
import dev.brainfit.especialidade.Especialidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "instrutores")
@Entity(name = "Instrutor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Instrutor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @Enumerated(EnumType.STRING) private Especialidade especialidade;
    private Integer idade;
    private String sexo;
    @Embedded private Endereco endereco;
    private Number ativo;

    public Instrutor(DadosCadastroInstrutor dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.especialidade = dados.especialidade();
        this.idade = dados.idade();
        this.sexo = dados.sexo();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInstrutor(DadosAtualizaInstrutor dados) {
//Long id, String email, String telefone, Especialidade especialidade, DadosEndereco endereco
        if (dados.email() != null){
            this.email = dados.email();
        }
        if (dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if (dados.especialidade() != null){
            this.especialidade = dados.especialidade();
        }
        if (dados.endereco() != null){
            this.endereco.atualizaEndereco(dados.endereco());
        }
    }

    public void excluirInstrutor(){
        this.ativo = 0;
    }
}
