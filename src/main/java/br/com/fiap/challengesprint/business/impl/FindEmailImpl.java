package br.com.fiap.challengesprint.business.impl;

import br.com.fiap.challengesprint.business.FindEmail;
import br.com.fiap.challengesprint.exception.EmailNotFoundException;
import br.com.fiap.challengesprint.mapper.EmailMapper;
import br.com.fiap.challengesprint.repository.EmailRepository;
import br.com.fiap.challengesprint.response.EmailResponse;
import org.springframework.stereotype.Service;

@Service
public class FindEmailImpl implements FindEmail {

    private final EmailRepository repository;
    private final EmailMapper mapper;

    public FindEmailImpl(EmailRepository repository, EmailMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public EmailResponse execute(Long id) {
        var optEmail = repository.findById(id);
        if (optEmail.isEmpty())
            throw new EmailNotFoundException();
        var email = optEmail.get();
        return mapper.toResponse(email);
    }
}
