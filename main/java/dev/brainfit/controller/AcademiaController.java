/*package dev.brainfit.controller;

import dev.brainfit.academia.Academia;
import dev.brainfit.academia.AcademiaRepository;
import dev.brainfit.academia.DadosCadastroAcademia;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("academias")
public class AcademiaController {

    private AcademiaRepository repo;

    @PostMapping @Transactional
    public void cadastrar(DadosCadastroAcademia dados){
        new repo.save(new Academia(dados));
    }
}
*/