package com.example.jetworkinout.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity
data class Routine(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo val name: String
)
