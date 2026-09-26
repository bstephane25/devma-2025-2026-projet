package com.example.model

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.Instant

data class YearMonth(val year: Int, val month: Int) {
    val displayLabel: String
        get() = listOf("Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre")[month] + " " + year
    fun previous() = if (month == 0) YearMonth(year - 1, 11) else YearMonth(year, month - 1)
    fun next() = if (month == 11) YearMonth(year + 1, 0) else YearMonth(year, month + 1)
    fun plusMonths(offset: Int): YearMonth {
        val absolute = year * 12 + month + offset
        val newYear = Math.floorDiv(absolute, 12)
        val newMonth = Math.floorMod(absolute, 12)
        return YearMonth(newYear, newMonth)
    }
    fun containsTimestamp(timestamp: Long): Boolean {
        val d = Instant.fromEpochMilliseconds(timestamp).toLocalDateTime(TimeZone.currentSystemDefault()).date
        return d.year == year && d.monthNumber - 1 == month
    }
    companion object {
        fun current(): YearMonth {
            val d = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).date
            return YearMonth(d.year, d.monthNumber - 1)
        }
        fun fromTimestamp(timestamp: Long): YearMonth {
            val d = Instant.fromEpochMilliseconds(timestamp).toLocalDateTime(TimeZone.currentSystemDefault()).date
            return YearMonth(d.year, d.monthNumber - 1)
        }
    }
}
