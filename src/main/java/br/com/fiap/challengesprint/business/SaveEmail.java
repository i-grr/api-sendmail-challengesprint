package br.com.fiap.challengesprint.business;

import br.com.fiap.challengesprint.request.EmailRequest;
import br.com.fiap.challengesprint.response.EmailResponse;

public interface SaveEmail {

    EmailResponse execute(EmailRequest request);

}
