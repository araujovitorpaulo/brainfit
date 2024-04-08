package dev.brainfit.instrutor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    //Page<DadosConsultaInstrutor> findAllByStatus(Pageable paginacao);
}
