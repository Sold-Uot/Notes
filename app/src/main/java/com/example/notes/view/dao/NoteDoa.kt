package com.example.notes.view.dao

import androidx.room.*
import com.example.notes.view.entities.NoteEntities

@Dao
interface NoteDoa {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    var getAllNotes : List<NoteEntities>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note:NoteEntities)

    @Delete
    fun deleteNote(note : NoteEntities)
}