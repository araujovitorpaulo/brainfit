package dev.brainfit.instrutor;

import dev.brainfit.endereco.DadosEndereco;
import dev.brainfit.especialidade.Especialidade;

public record DadosAtualizaInstrutor(Long id, String email, String telefone, Especialidade especialidade, DadosEndereco endereco) {

}
