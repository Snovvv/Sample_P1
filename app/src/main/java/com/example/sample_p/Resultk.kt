package com.example.sample_p

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Resultk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultk)
    }

    fun titile(view: View?){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}