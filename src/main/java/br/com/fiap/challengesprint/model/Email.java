package br.com.fiap.challengesprint.model;

import br.com.fiap.challengesprint.model.enums.StatusEmail;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_email")
public class Email {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email_from", nullable = false)
    private String from;

    @Column(name = "email_to", nullable = false)
    private String to;

    @Column(nullable = false)
    private String subject;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String body;

    private final LocalDateTime sendDate = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusEmail statusEmail;

    @Deprecated
    public Email() {}

    public Email(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.statusEmail = StatusEmail.PROCESSING;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void updateStatusEmail(StatusEmail status) {
        if (status != StatusEmail.PROCESSING && status != null)
            this.statusEmail = status;
    }
}
