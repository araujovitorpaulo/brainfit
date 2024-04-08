package dev.brainfit.aluno;

import dev.brainfit.endereco.Endereco;

public record DadosAtualizaAluno(Long id, String email, String telefone, Endereco endereco) {

}
