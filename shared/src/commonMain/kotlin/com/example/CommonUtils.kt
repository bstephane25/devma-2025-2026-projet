package com.example

import kotlinx.datetime.*

fun formatFcfa(amount: Double): String =
    amount.toLong().toString().reversed().chunked(3).joinToString(" ").reversed()

fun timestampForMonth(year: Int, monthZeroBased: Int, day: Int, hour: Int): Long =
    LocalDateTime(LocalDate(year, monthZeroBased + 1, day), LocalTime(hour, 0))
        .toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()

fun newId(): String = "${Clock.System.now().toEpochMilliseconds()}-${kotlin.random.Random.nextLong()}"

fun formatShortDate(timestamp: Long): String {
    val d = Instant.fromEpochMilliseconds(timestamp).toLocalDateTime(TimeZone.currentSystemDefault()).date
    val m = listOf("janv.","févr.","mars","avr.","mai","juin","juil.","août","sept.","oct.","nov.","déc.")
    return "${d.dayOfMonth} ${m[d.monthNumber-1]}"
}
fun formatRelativeDate(timestamp: Long, todayString: String = "Aujourd'hui", yesterdayString: String = "Hier"): String {
    val diff = Clock.System.now().toEpochMilliseconds() - timestamp
    return when {
        diff in 0..43_200_000L -> todayString
        diff in 0..172_800_000L -> yesterdayString
        else -> formatShortDate(timestamp)
    }
}
