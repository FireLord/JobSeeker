package com.firelord.jobseeker.presentation.ui.util

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern
import kotlinx.datetime.toLocalDateTime

@OptIn(FormatStringsInDatetimeFormats::class)
fun String.formatDDMMYY(): String {
    val instant = Instant.parse(this)
    val localDateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())
    val formatter = LocalDateTime.Format { byUnicodePattern("dd/MM/yyyy") }
    return localDateTime.format(formatter)
}