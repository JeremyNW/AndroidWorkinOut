package com.example.jetworkinout.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity
data class Exercise(
    @PrimaryKey val id: UUID,
    @ColumnInfo val name: String,
    @ColumnInfo val reps: Int,
    @ColumnInfo val sets: Int,
    @ColumnInfo val weight: Double
)
