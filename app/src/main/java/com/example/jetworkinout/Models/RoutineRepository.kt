package com.example.jetworkinout.Models

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class RoutineRepository(private val routineDao: RoutineDao ) {

    val allRoutines: Flow<Routine> = routineDao.allRoutines()

    @WorkerThread
    suspend fun insertRoutine(routine: Routine) {
        routineDao.insertRoutine(routine)
    }

    @WorkerThread
    suspend fun updateRoutine(routine: Routine) {
        routineDao.updateRoutine(routine)
    }
}