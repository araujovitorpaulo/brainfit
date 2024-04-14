package dev.brainfit.academia;

import dev.brainfit.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "academias")
@Entity(name = "Academia")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Academia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    @Embedded private Endereco endereco;
    private Character ativa;

    public Academia(DadosCadastroAcademia dados) {
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarAcademia(DadosAtualizaAcademia dados){

    }

    public void excluirAcademia(){
        this.ativa = 'N';
    }
}
