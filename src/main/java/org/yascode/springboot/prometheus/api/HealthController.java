package org.yascode.springboot.prometheus.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController implements HealthApi {

    @Override
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("UP");
    }
}
