package com.example.notes.view.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.security.cert.CertPath
import javax.sql.StatementEvent

@Entity(tableName = "notes")
data class NoteEntities(
    @PrimaryKey(autoGenerate = true)
    private var id: Int?,

    @ColumnInfo(name = "title")
    private var title : String,

    @ColumnInfo(name = "data_time")
    private var datatime:String,

    @ColumnInfo(name = "subtitle")
    private var subtitle : String,

    @ColumnInfo(name = "note_text")
    private var noteText: String,

    @ColumnInfo(name = "image_path")
    private var imagePath: String,

    @ColumnInfo(name = "color")
    private var color : String,

    @ColumnInfo(name = "web_link")
    private var webLink: String


    )



