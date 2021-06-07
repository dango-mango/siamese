package com.github.dangomango.siamese.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.dangomango.siamese.model.Diagnosis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HealthCheckControllerTest {
  @Test
  @DisplayName("Health check should return OK")
  public void testHealth() {
    assertEquals(HealthCheckController.getDiagnosis(), Diagnosis.ok());
  }
}
