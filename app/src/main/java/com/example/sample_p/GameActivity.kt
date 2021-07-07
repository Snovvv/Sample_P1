package com.example.sample_p

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun button3Tapped(view: View?){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}