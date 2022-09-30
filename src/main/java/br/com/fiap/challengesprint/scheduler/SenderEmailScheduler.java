package br.com.fiap.challengesprint.scheduler;

import br.com.fiap.challengesprint.model.Email;
import br.com.fiap.challengesprint.model.enums.StatusEmail;
import br.com.fiap.challengesprint.repository.EmailRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenderEmailScheduler {

    private final EmailRepository repository;
    private final JavaMailSender emailSender;

    public SenderEmailScheduler(EmailRepository repository, JavaMailSender emailSender) {
        this.repository = repository;
        this.emailSender = emailSender;
    }

    @Scheduled(fixedRate = 15000)
    public void sendAllEmails() {
        System.out.println("::: Verificando novos emails...");
        List<Email> emails = repository.findAllByStatusEmailEquals(StatusEmail.PROCESSING);
        emails.forEach(e -> sendEmail(e.getId()));
    }

    private void sendEmail(Long id) {
        var optEmail = repository.findById(id);
        if (optEmail.isPresent()) {
            System.out.println("::: Preparando para enviar e-mail...");
            var email = optEmail.get();
            try {
                SimpleMailMessage message = new SimpleMailMessage();
                message.setFrom(email.getFrom());
                message.setTo(email.getTo());
                message.setSubject(email.getSubject());
                message.setText(email.getBody());
                emailSender.send(message);
                email.updateStatusEmail(StatusEmail.SENT);
                System.out.println("::: E-mail enviado com sucesso!");
            } catch (Exception e) {
                email.updateStatusEmail(StatusEmail.ERROR);
                System.out.println("::: Erro ao tentar enviar e-mail.");
            } finally {
                repository.save(email);
            }
        }
    }

}
