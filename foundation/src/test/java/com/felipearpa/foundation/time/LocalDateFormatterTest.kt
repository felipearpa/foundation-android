package com.felipearpa.foundation.time

import io.kotest.matchers.shouldBe
import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.Test

class LocalDateFormatterTest {
    @Test
    fun `given a date when formatting it as short date then it shows the correct short date`() {
        val date = LocalDate(2023, 4, 15)
        val result = date.toShortDateString()
        result shouldBe "4/15/23"
    }
}
