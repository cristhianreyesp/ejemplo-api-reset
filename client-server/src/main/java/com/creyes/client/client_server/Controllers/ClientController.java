package com.creyes.client.client_server.Controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, world!");
    }

    @GetMapping("/authorized")
    public Map<String, String> authorize(@RequestParam String code) {
        return Collections.singletonMap("authorizationCode", code);
    }

}
