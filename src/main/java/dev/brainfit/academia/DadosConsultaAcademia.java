package dev.brainfit.academia;

import dev.brainfit.endereco.Endereco;

public record DadosConsultaAcademia(Long id, String nome, String telefone, Endereco endereco, Character ativa) {
    public DadosConsultaAcademia(Academia academia){
        this(academia.getId(), academia.getNome(), academia.getTelefone(), academia.getEndereco(), academia.getAtiva());
    }
}
