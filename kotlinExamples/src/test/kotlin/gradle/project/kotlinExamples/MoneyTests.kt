package gradle.project.kotlinExamples

import java.math.BigDecimal
import java.util.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MoneyTests {

    @Test
    fun money_add() {
        val money1: Money = Money.of(BigDecimal(20), Currency.getInstance(Locale.FRANCE))
        val money2: Money = Money.of(BigDecimal(30), Currency.getInstance(Locale.FRANCE))
        val expected: Money = Money.of(BigDecimal(50), Currency.getInstance(Locale.FRANCE))
        assertEquals(
            money1.add(money2),
            expected
        )
    }

    @Test
    fun money_add_failure() {
        val money1: Money = Money.of(BigDecimal(20), Currency.getInstance(Locale.US))
        val money2: Money = Money.of(BigDecimal(30), Currency.getInstance(Locale.FRANCE))
        assertFailsWith<IllegalArgumentException> {
            money1.add(money2)
        }
    }

}