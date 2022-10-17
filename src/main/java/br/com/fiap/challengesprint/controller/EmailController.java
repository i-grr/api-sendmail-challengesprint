package br.com.fiap.challengesprint.controller;

import br.com.fiap.challengesprint.business.FindEmail;
import br.com.fiap.challengesprint.business.ListEmail;
import br.com.fiap.challengesprint.business.SaveEmail;
import br.com.fiap.challengesprint.request.EmailRequest;
import br.com.fiap.challengesprint.response.EmailResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class EmailController {

    private final SaveEmail saveEmail;

    private final ListEmail listEmail;

    private final FindEmail findEmail;

    public EmailController(SaveEmail saveEmail, ListEmail listEmail, FindEmail findEmail) {
        this.saveEmail = saveEmail;
        this.listEmail = listEmail;
        this.findEmail = findEmail;
    }

    @GetMapping("/emails")
    public ResponseEntity<List<EmailResponse>> listEmails() {
        var emailsResponse = listEmail.execute();
        return ResponseEntity.ok(emailsResponse);
    }

    @GetMapping("/email/{id}")
    public ResponseEntity<EmailResponse> findEmailById(@PathVariable Long id) {
        var emailResponse = findEmail.execute(id);
        return ResponseEntity.ok(emailResponse);
    }

    @PostMapping("/sending-email")
    public ResponseEntity<EmailResponse> sendingEmail(@RequestBody @Valid EmailRequest request) {
        var emailResponse = saveEmail.execute(request);
        return ResponseEntity.ok(emailResponse);
    }

}
