package com.greenfoxacademy.exampractice.Controller;

import com.greenfoxacademy.exampractice.Model.SecretCodeObject;
import com.greenfoxacademy.exampractice.Model.Url;
import com.greenfoxacademy.exampractice.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UrlRestController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/api/links")
    public List<Url> showAllUrls() {
        return urlService.listAllUrls();
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity delete(@PathVariable String id, @RequestBody SecretCodeObject secret) {
        Url urlToFind = urlService.findByInputAlias(id);
        if (urlToFind == null) {
            return ResponseEntity.notFound().build();
        } else if (urlToFind.getSecretCode().equals(secret.getSecretcode())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        } else {
            urlService.deleteByInputAlias(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
