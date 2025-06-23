package com.felipearpa.foundation.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.toJavaLocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

fun LocalDate.toShortDateString(locale: Locale = Locale.getDefault()): String =
    DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
        .withLocale(locale)
        .format(this.toJavaLocalDate())
