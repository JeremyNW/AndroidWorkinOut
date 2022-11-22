package com.example.jetworkinout.Models

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface RoutineDao {

    @Query("SELECT * FROM routine_table ORDER BY id ASC")
    fun allRoutines(): Flow<Routine>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoutine(routine: Routine)

    suspend fun updateRoutine(routine: Routine)

    suspend fun deleteRoutine(routine: Routine)

}