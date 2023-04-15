package gradle.project.kotlinExamples

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EmailAddressTests {

    @Test
    fun parsing_kotlin() {
        val expected = EmailAddress("myname", "domain.com")
        assertEquals(
            EmailAddress.parse("myname@domain.com"),
            expected
        )
    }

    @Test
    fun parsing_failure_kotlin() {
        assertFailsWith<IllegalArgumentException> {
            EmailAddress.parse("@")
        }
    }
}