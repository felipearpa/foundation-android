package com.felipearpa.foundation.time

import io.kotest.matchers.longs.shouldBeExactly
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import org.junit.jupiter.api.Test

class DateTransformerTest {
    @Test
    fun `given a date when transforming it to epoch millis then it returns the correct value`() {
        val date = LocalDate(2023, 4, 15)
        val result = date.toEpochMillis(TimeZone.of("UTC"))
        result shouldBeExactly 1681516800000L
    }
}
