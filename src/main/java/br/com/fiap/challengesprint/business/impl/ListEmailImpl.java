package br.com.fiap.challengesprint.business.impl;

import br.com.fiap.challengesprint.business.ListEmail;
import br.com.fiap.challengesprint.mapper.EmailMapper;
import br.com.fiap.challengesprint.repository.EmailRepository;
import br.com.fiap.challengesprint.response.EmailResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListEmailImpl implements ListEmail {

    private final EmailRepository repository;
    private final EmailMapper mapper;

    public ListEmailImpl(EmailRepository repository, EmailMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<EmailResponse> execute() {
        var emails = repository.findAll();
        return emails.stream().map(mapper::toResponse).collect(Collectors.toList());
    }
}
