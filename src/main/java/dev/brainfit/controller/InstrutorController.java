package dev.brainfit.controller;

import dev.brainfit.instrutor.DadosCadastroInstrutor;
import dev.brainfit.instrutor.Instrutor;
import dev.brainfit.instrutor.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


}
