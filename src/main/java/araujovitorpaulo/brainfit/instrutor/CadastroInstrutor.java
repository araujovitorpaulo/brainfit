package araujovitorpaulo.brainfit.instrutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public record CadastroInstrutor() {

    /*@Autowired
    private InstrutorRepository repository;*/

    private void cadastrar(@RequestBody CadastroInstrutor dados){

    }

}
