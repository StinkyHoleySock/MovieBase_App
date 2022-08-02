package com.dmitry.moviebase_app.database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dmitry.moviebase_app.model.Search

interface SearchDao {

    @Query("SELECT * FROM search")
    suspend fun getAllSearch(): LiveData<List<Search>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(search: Search)

    @Delete
    suspend fun delete(search: Search)
}