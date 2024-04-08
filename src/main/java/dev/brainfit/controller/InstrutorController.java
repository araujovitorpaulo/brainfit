package dev.brainfit.controller;

import dev.brainfit.instrutor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("instrutores")
public class InstrutorController {

    @Autowired
    private InstrutorRepository repo;

    @PostMapping @Transactional
    public void cadastrar(@RequestBody DadosCadastroInstrutor dados){
        repo.save(new Instrutor(dados));
    }

    @GetMapping
    public Page<DadosConsultaInstrutor> consultar(@PageableDefault(sort = {"nome"}) Pageable paginacao){
        return repo.findAll(paginacao).map(DadosConsultaInstrutor::new);
    }

    @PutMapping @Transactional
    public void atualizar(DadosAtualizaInstrutor dados){
        var instrutor = repo.getReferenceById(dados.id());
        instrutor.atualizarInstrutor(dados);
    }

    @DeleteMapping("/{id}") @Transactional
    public void excluir(@PathVariable Long id){
        var instrutor = repo.getReferenceById(id);
        instrutor.excluirInstrutor();
    }

}
