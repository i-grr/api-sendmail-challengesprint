package br.com.fiap.challengesprint.repository;

import br.com.fiap.challengesprint.model.Email;
import br.com.fiap.challengesprint.model.enums.StatusEmail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRepository extends JpaRepository<Email, Long> {

    List<Email> findAllByStatusEmailEquals(StatusEmail statusEmail);

}
