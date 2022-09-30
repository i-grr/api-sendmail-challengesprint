package br.com.fiap.challengesprint.business.impl;

import br.com.fiap.challengesprint.business.SaveEmail;
import br.com.fiap.challengesprint.mapper.EmailMapper;
import br.com.fiap.challengesprint.repository.EmailRepository;
import br.com.fiap.challengesprint.request.EmailRequest;
import br.com.fiap.challengesprint.response.EmailResponse;
import org.springframework.stereotype.Service;

@Service
public class SaveEmailImpl implements SaveEmail {

    private final EmailRepository repository;
    private final EmailMapper mapper;

    public SaveEmailImpl(EmailRepository repository, EmailMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public EmailResponse execute(EmailRequest request) {
        var email = mapper.toModel(request);
        var emailSaved = repository.save(email);
        return mapper.toResponse(emailSaved);
    }
}
