package dev.brainfit.aluno;

public record DadosConsultaAluno(String nome, Integer idade, String email, String telefone) {
    public DadosConsultaAluno(Aluno aluno){
        this(aluno.getNome(), aluno.getIdade(), aluno.getEmail(), aluno.getTelefone());
    }
}
