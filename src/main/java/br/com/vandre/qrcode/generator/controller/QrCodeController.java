package br.com.vandre.qrcode.generator.controller;


import br.com.vandre.qrcode.generator.dto.QrCodeGenerateRequest;
import br.com.vandre.qrcode.generator.dto.QrCodeGenerateResponse;
import br.com.vandre.qrcode.generator.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService service;

    public QrCodeController(QrCodeGeneratorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        try {
            QrCodeGenerateResponse response =  this.service.generateAndUpload(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}
