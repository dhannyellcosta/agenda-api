package br.com.agenda.api.model.repository;

import br.com.agenda.api.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
