package br.com.fiap.challengesprint.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public class EmailResponse {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String from;

    @JsonProperty
    private String to;

    @JsonProperty
    private String subject;

    @JsonProperty
    private String body;

    @JsonProperty
    private LocalDateTime sendDate;

    @JsonProperty
    private String status;

    public EmailResponse(Long id, String from, String to, String subject, String body, LocalDateTime sendDate, String status) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.sendDate = sendDate;
        this.status = status;
    }

}
