package dev.brainfit.controller;

import dev.brainfit.aluno.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repo;

    @PostMapping @Transactional
    public void cadastrar(@RequestBody DadosCadastroAluno dados){
        repo.save(new Aluno(dados));
    }

    @GetMapping
    public Page<DadosConsultaAluno> consultar(@PageableDefault (sort = {"name"}) Pageable paginacao){
        return repo.findAll(paginacao).map(DadosConsultaAluno::new);
    }

    @PutMapping @Transactional
    public void atualizar(DadosAtualizaAluno dados){
        var aluno = repo.getReferenceById(dados.id());
        aluno.atualizarAluno(dados);
    }

    @DeleteMapping @Transactional
    public void excluir(@PathVariable Long id){
        var aluno = repo.getReferenceById(id);
        aluno.excluirAluno();
    }

}