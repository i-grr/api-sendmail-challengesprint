package br.com.fiap.challengesprint.business;

import br.com.fiap.challengesprint.response.EmailResponse;

public interface FindEmail {

    EmailResponse execute(Long id);

}
