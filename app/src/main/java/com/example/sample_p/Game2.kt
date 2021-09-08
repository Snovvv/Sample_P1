package com.example.sample_p

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Game2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)
    }

    fun buttonOnclick(view: View?) {
        val imageView: ImageView = findViewById(R.id.Pazl_piece01)
        imageView.setImageResource(R.drawable.a2_1)
    }


}