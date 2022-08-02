package com.dmitry.moviebase_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "search")
data class Search(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val Poster: String,
    val Title: String,
    val Type: String,
    val Year: String,
    val imdbID: String
)