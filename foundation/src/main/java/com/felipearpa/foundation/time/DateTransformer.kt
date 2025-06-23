package com.felipearpa.foundation.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.atStartOfDayIn
import kotlinx.datetime.toJavaInstant

fun LocalDate.toEpochMillis(timeZone: TimeZone = TimeZone.currentSystemDefault()): Long {
    return this
        .atStartOfDayIn(timeZone = timeZone)
        .toJavaInstant()
        .toEpochMilli()
}
