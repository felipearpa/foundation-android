package com.felipearpa.foundation

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class EmptyStringTest {
    @Test
    fun `given an empty string when calling emptyString then it returns an empty string`() {
        val result = emptyString()
        result shouldBe ""
    }
}
