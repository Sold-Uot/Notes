package com.example.notes.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.notes.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageAddNoteMain : ImageView = findViewById(R.id.imageAddNoteMain)


        imageAddNoteMain.setOnClickListener {
            startActivity( Intent(this, CreatNorteActivity::class.java)) }


    }

}