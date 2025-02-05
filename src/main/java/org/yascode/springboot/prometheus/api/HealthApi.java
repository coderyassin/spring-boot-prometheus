package org.yascode.springboot.prometheus.api;

import org.springframework.http.ResponseEntity;

public interface HealthApi {
    ResponseEntity<String> healthCheck();
}
