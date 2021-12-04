package com.example.lab5_4

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<View>(R.id.imageView) as ImageView
        Picasso.get()
            .load("https://upload.wikimedia.org/wikipedia/ru/thumb/0/08/Picasso01.jpg/480px-Picasso01.jpg")
            .into(imageView)
    }
}