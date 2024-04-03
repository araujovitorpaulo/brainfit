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
    private InstrutorRepository repository;

    @PostMapping @Transactional
    public void cadastrar(@RequestBody DadosCadastroInstrutor dados){
        repository.save(new Instrutor(dados));
    }

    @GetMapping
    public Page<DadosConsultaInstrutor> consultar(@PageableDefault Pageable paginacao){
        return repository.findAllByStatus(paginacao).map(DadosConsultaInstrutor::new);
    }

    @PutMapping @Transactional
    public void atualizar(DadosAtualizaInstrutor dados){

    }

    @DeleteMapping("/{id}") @Transactional
    public void deletar(@PathVariable Long id){

    }

}
