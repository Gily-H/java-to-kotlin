package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailAddressTests {

  @Test
  public void parsing_java() {
    assertEquals(
        new EmailAddress("fred", "example.com"),
        EmailAddress.parse("fred@example.com")
    );
  }

  @Test
  public void parsing_failure_java() {
    assertThrows(
        IllegalArgumentException.class,
        () -> EmailAddress.parse("@")
    );

  }
}
