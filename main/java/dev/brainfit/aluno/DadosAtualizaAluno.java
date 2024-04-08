package dev.brainfit.aluno;

import dev.brainfit.endereco.DadosEndereco;

public record DadosAtualizaAluno(Long id, String email, String telefone, DadosEndereco endereco) {

}
