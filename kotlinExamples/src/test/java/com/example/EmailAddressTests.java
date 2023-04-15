package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailAddressTests {

  @Test
  public void parsing() {
    assertEquals(
        new EmailAddress("fred", "example.com"),
        EmailAddress.parse("fred@example.com")
    );
  }

  @Test
  public void parsingFailures() {
    assertThrows(
        IllegalArgumentException.class,
        () -> EmailAddress.parse("@")
    );

  }
}
