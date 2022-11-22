package com.example.jetworkinout.Models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Routine::class], version = 1, exportSchema = false)
abstract class RoutineDatabase: RoomDatabase()
{
    abstract fun routineDao(): RoutineDao

    companion object
    {

        @Volatile
        private var INSTANCE: RoutineDatabase? = null

        fun getDatabase(context: Context): RoomDatabase
        {
            return INSTANCE ?: synchronized(this)
            {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDatabase::class.java,
                    "routine_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }

    }
}