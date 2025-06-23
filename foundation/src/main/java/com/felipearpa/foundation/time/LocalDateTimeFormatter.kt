package com.felipearpa.foundation.time

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.toJavaLocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

fun LocalDateTime.toShortDateString(locale: Locale = Locale.getDefault()): String =
    DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
        .withLocale(locale)
        .format(this.toJavaLocalDateTime())

fun LocalDateTime.toShortDateTimeString(locale: Locale = Locale.getDefault()): String =
    DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
        .withLocale(locale)
        .format(this.toJavaLocalDateTime())

fun LocalDateTime.toShortTimeString(locale: Locale = Locale.getDefault()): String =
    DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
        .withLocale(locale)
        .format(this.toJavaLocalDateTime())
