package com.dmitry.moviebase_app.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.internal.synchronized

abstract class SearchDatabase: RoomDatabase() {

    abstract fun getSearchDao(): SearchDao

    companion object {
        @Volatile
        private var instance: SearchDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: kotlin.synchronized(LOCK) {
            instance ?: createDatabase(context).also{ instance = it}
        }

        private fun createDatabase(context: Context): SearchDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                SearchDatabase::class.java,
                "search_database"
            ).build()
        }
    }
}
