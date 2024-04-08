package dev.brainfit.instrutor;

import dev.brainfit.especialidade.Especialidade;

public record DadosConsultaInstrutor(String nome, String sexo, Integer idade, Especialidade especialidade, String telefone) {
    public DadosConsultaInstrutor(Instrutor instrutor) {
        this(instrutor.getNome(), instrutor.getSexo(), instrutor.getIdade(), instrutor.getEspecialidade(), instrutor.getTelefone());
    }
}
