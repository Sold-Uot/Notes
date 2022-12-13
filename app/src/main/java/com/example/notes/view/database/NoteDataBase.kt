package com.example.notes.view.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notes.view.dao.NoteDoa
import com.example.notes.view.entities.NoteEntities

@Database(entities = [NoteEntities::class], version = 1, exportSchema = false)
abstract class NoteDataBase: RoomDatabase() {

    companion object {
        private lateinit var noteDataBase : NoteDataBase

        @Synchronized
        fun getDataBase(contex: Context) : NoteDataBase{
            if (noteDataBase == null){
                val db = Room.databaseBuilder(
                    contex,
                    NoteDataBase::class.java,
                    "notes_db"
                ).build()
            }

            return noteDataBase
        }

    }
    abstract fun noteDoa(): NoteDoa
}