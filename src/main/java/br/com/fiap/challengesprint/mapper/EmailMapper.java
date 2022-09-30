package br.com.fiap.challengesprint.mapper;

import br.com.fiap.challengesprint.builder.EmailBuilder;
import br.com.fiap.challengesprint.model.Email;
import br.com.fiap.challengesprint.request.EmailRequest;
import br.com.fiap.challengesprint.response.EmailResponse;
import org.springframework.stereotype.Component;

@Component
public class EmailMapper {

    public Email toModel(EmailRequest request) {
        return new EmailBuilder()
                .addEmailFrom(request.getFrom())
                .addEmailTo(request.getTo())
                .addEmailSubject(request.getSubject())
                .addEmailBody(request.getBody())
                .build();
    }

    public EmailResponse toResponse(Email email) {
        return new EmailResponse(
                email.getId(),
                email.getFrom(),
                email.getTo(),
                email.getSubject(),
                email.getBody(),
                email.getSendDate(),
                email.getStatusEmail().toString()
        );
    }

}
