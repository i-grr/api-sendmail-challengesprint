package br.com.fiap.challengesprint.exception;

public class EmailNotFoundException extends BusinessException {

    public EmailNotFoundException() {
        super("Email not found!");
    }

}
