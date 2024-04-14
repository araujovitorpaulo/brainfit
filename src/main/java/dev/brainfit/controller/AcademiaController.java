package dev.brainfit.controller;

import dev.brainfit.academia.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("academias")
public class AcademiaController {

    @Autowired
    private AcademiaRepository repo;

    @PostMapping @Transactional
    public void cadastrar(@RequestBody DadosCadastroAcademia dados){
        repo.save(new Academia(dados));
    }

    @GetMapping
    public Page<DadosConsultaAcademia> consultar(@PageableDefault(sort = {"nome"}) Pageable paginacao){
        return repo.findAll(paginacao).map(DadosConsultaAcademia::new);
    }

    @PutMapping @Transactional
    public void atualizar(@RequestBody DadosAtualizaAcademia dados){
        var academia = repo.getReferenceById(dados.id());
        academia.atualizarAcademia(dados);
    }

    @DeleteMapping("{id}") @Transactional
    public void excluir(Long id){
        var academia = repo.getReferenceById(id);
        academia.excluirAcademia();
    }
}
