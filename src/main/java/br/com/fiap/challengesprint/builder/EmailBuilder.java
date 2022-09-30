package br.com.fiap.challengesprint.builder;

import br.com.fiap.challengesprint.exception.EmailBuilderInvalidException;
import br.com.fiap.challengesprint.model.Email;

public class EmailBuilder {

    private String from;
    private String to;
    private String subject;
    private String body;

    public EmailBuilder addEmailFrom(String from) {
        this.from = from;
        return this;
    }

    public EmailBuilder addEmailTo(String to) {
        this.to = to;
        return this;
    }

    public EmailBuilder addEmailSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder addEmailBody(String body) {
        this.body = body;
        return this;
    }

    public Email build() {
        if (from == null || to == null || subject == null || body == null)
            throw new EmailBuilderInvalidException();

        return new Email(from, to, subject, body);
    }

}
