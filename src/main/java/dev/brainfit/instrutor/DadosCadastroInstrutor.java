package dev.brainfit.instrutor;

import dev.brainfit.endereco.DadosEndereco;

public record DadosCadastroInstrutor(String nome, String email, String telefone, Especialidade especialidade, Integer idade, String sexo, DadosEndereco endereco) {

}
