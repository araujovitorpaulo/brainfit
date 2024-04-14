package dev.brainfit.aluno;

public record DadosConsultaAluno(Long id, String nome, Integer idade, String email, String telefone, Character ativo) {
    public DadosConsultaAluno(Aluno aluno){
        this(aluno.getId(), aluno.getNome(), aluno.getIdade(), aluno.getEmail(), aluno.getTelefone(), aluno.getAtivo());
    }
}
