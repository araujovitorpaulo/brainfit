package dev.brainfit.instrutor;

public record DadosConsultaInstrutor(Long id, String nome, String sexo, Integer idade, Especialidade especialidade, String telefone, Character ativo) {
    public DadosConsultaInstrutor(Instrutor instrutor) {
        this(instrutor.getId(), instrutor.getNome(), instrutor.getSexo(), instrutor.getIdade(), instrutor.getEspecialidade(), instrutor.getTelefone(), instrutor.getAtivo());
    }
}
