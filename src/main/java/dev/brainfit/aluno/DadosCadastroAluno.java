package dev.brainfit.aluno;

import dev.brainfit.endereco.DadosEndereco;

public record DadosCadastroAluno(Long id, String nome, Integer idade, String email, String telefone, String sexo, DadosEndereco endereco) {

}
