package com.example.notes.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.example.notes.R


class CreatNorteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creat_norte)
        var imageBackPres  = findViewById<ImageView>(R.id.imageBack)
        imageBackPres.setOnClickListener {onBackPressed()}
        var inputNoteTitle : EditText
    }
}