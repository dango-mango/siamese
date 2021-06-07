package com.github.dangomango.siamese.controller;

import com.github.dangomango.siamese.model.Diagnosis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
  @RequestMapping()
  public static Diagnosis getDiagnosis() {
    return Diagnosis.ok();
  }
}
