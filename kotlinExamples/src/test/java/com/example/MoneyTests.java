package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import org.junit.jupiter.api.Test;

public class MoneyTests {

  @Test
  public void add_money() {
    Money money1 = Money.of(BigDecimal.valueOf(20.24), Currency.getInstance(Locale.US));
    Money money2 = Money.of(BigDecimal.valueOf(29.76), Currency.getInstance(Locale.US));
    Money expected = Money.of(BigDecimal.valueOf(50), Currency.getInstance(Locale.US));
    assertEquals(money1.add(money2), expected);
  }

  @Test
  public void add_money_fail() {
    Money money1 = Money.of(BigDecimal.valueOf(20.24), Currency.getInstance(Locale.CANADA));
    Money money2 = Money.of(BigDecimal.valueOf(29.76), Currency.getInstance(Locale.CHINA));
    assertThrows(
        IllegalArgumentException.class,
        () -> money1.add(money2)
    );
  }

}
