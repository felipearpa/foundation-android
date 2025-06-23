package com.felipearpa.foundation.time

import io.kotest.matchers.shouldBe
import kotlinx.datetime.LocalDateTime
import org.junit.jupiter.api.Test

class LocalDateTimeFormatterTest {
    private val dateTime =
        LocalDateTime(year = 2024, monthNumber = 6, dayOfMonth = 15, hour = 14, minute = 30)

    private val shortDateString = "6/15/24"

    private val shortDateTimeString = "6/15/24, 2:30 PM"

    private val shortTimeString = "2:30 PM"

    @Test
    fun `given a date and time when formatting it as date then it shows the correct short date`() {
        val localDateTime = `given a date and time`()

        val result = `when formatting it as date`(localDateTime)

        `then it shows the correct short date`(currentDateTimeString = result)
    }

    @Test
    fun `given a date and time when formatting it as date time then it shows the correct short date time`() {
        val localDateTime = `given a date and time`()

        val result = `when formatting it as date time`(localDateTime)

        `then it shows the correct short date time`(currentDateTimeString = result)
    }

    @Test
    fun `given a date and time when formatting it as time then it shows the correct short time`() {
        val localDateTime = `given a date and time`()

        val result = `when formatting it as time`(localDateTime)

        `then it shows the correct short time`(currentDateTimeString = result)
    }

    private fun `given a date and time`() = dateTime

    private fun `when formatting it as date`(localDateTime: LocalDateTime) =
        localDateTime.toShortDateString()

    private fun `when formatting it as date time`(localDateTime: LocalDateTime) =
        localDateTime.toShortDateTimeString()

    private fun `when formatting it as time`(localDateTime: LocalDateTime) =
        localDateTime.toShortTimeString()

    private fun `then it shows the correct short date`(currentDateTimeString: String) {
        currentDateTimeString.normalized() shouldBe shortDateString.normalized()
    }

    private fun `then it shows the correct short date time`(currentDateTimeString: String) {
        currentDateTimeString.normalized() shouldBe shortDateTimeString.normalized()
    }

    private fun `then it shows the correct short time`(currentDateTimeString: String) {
        currentDateTimeString.normalized() shouldBe shortTimeString.normalized()
    }
}

private fun String.normalized() =
    this.replace(Regex("[\\s\u202F]+"), " ")
