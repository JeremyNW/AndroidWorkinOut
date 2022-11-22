package com.example.jetworkinout.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date
import java.util.UUID

@Entity
data class BodyWeight(
    @PrimaryKey val id: UUID,
    @ColumnInfo (name = "dateString") val date: String?,
    @ColumnInfo val pounds: Int
)
{
    fun completedDate(): LocalDate? = if (date == null) null
    else LocalDate.parse(date)
}
