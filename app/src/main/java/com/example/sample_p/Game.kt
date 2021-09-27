package com.example.sample_p

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {
    private  lateinit var imageView0: ImageView
    private  lateinit var imageView1: ImageView
    private  lateinit var imageView2: ImageView
    private  lateinit var imageView3: ImageView
    private  lateinit var imageView4: ImageView
    private  lateinit var imageView5: ImageView
    private  lateinit var imageView6: ImageView
    private  lateinit var imageView7: ImageView
    private  lateinit var imageView8: ImageView

    private val anyaFlag = arrayOf(0,1,2,3,4,5,6,7,8)

    private val anya = arrayOf(R.drawable.k_1,R.drawable.k_2,R.drawable.k_3,
        R.drawable.k_4,R.drawable.k_5,R.drawable.k_6,
        R.drawable.k_7,R.drawable.k_8,R.drawable.k_9)

    private val checkFlag = arrayOf(0,1,2,3,4,5,6,7,8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

        imageView0 = findViewById(R.id.Pazl_piece01)
        imageView1 = findViewById(R.id.Pazl_piece02)
        imageView2 = findViewById(R.id.Pazl_piece03)
        imageView3 = findViewById(R.id.Pazl_piece04)
        imageView4 = findViewById(R.id.Pazl_piece05)
        imageView5 = findViewById(R.id.Pazl_piece06)
        imageView6 = findViewById(R.id.Pazl_piece07)
        imageView7 = findViewById(R.id.Pazl_piece08)
        imageView8 = findViewById(R.id.Pazl_piece09)

        val range = (0..8)  // 0 <= n <= 8
        var num = range.random()
        var checkflag = 0
        var inflg = 0

        for (i in 0..8) {
            while (true) {
                for (t in 0..i) {
                    if (num == anyaFlag[t]) {
                        checkflag = 1
                    }
                }

                if (checkflag == 1) {
                    num = range.random()
                    checkflag = 0
                }
                else {
                    if (num == 8) inflg = i
                    anyaFlag[i] = num
                    break
                }
            }

        }

        imageView0.setImageResource(anya[anyaFlag[0]])
        imageView1.setImageResource(anya[anyaFlag[1]])
        imageView2.setImageResource(anya[anyaFlag[2]])
        imageView3.setImageResource(anya[anyaFlag[3]])
        imageView4.setImageResource(anya[anyaFlag[4]])
        imageView5.setImageResource(anya[anyaFlag[5]])
        imageView6.setImageResource(anya[anyaFlag[6]])
        imageView7.setImageResource(anya[anyaFlag[7]])
        imageView8.setImageResource(anya[anyaFlag[8]])

        when (inflg) {
            0 -> imageView0.visibility = View.INVISIBLE
            1 -> imageView1.visibility = View.INVISIBLE
            2 -> imageView2.visibility = View.INVISIBLE
            3 -> imageView3.visibility = View.INVISIBLE
            4 -> imageView4.visibility = View.INVISIBLE
            5 -> imageView5.visibility = View.INVISIBLE
            6 -> imageView6.visibility = View.INVISIBLE
            7 -> imageView7.visibility = View.INVISIBLE
            8 -> imageView8.visibility = View.INVISIBLE
        }
    }






    fun buttonOnclick01(view: View) {
        when {
            anyaFlag[1]==8 -> {
                imageView0.setImageResource(anya[anyaFlag[1]])
                imageView1.setImageResource(anya[anyaFlag[0]])
                try {
                    imageView0.visibility = View.INVISIBLE
                    imageView1.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }
                flgChange(0,1)
            }
            anyaFlag[3]==8 -> {
                imageView0.setImageResource(anya[anyaFlag[3]])
                imageView3.setImageResource(anya[anyaFlag[0]])

                try {
                    imageView0.visibility = View.INVISIBLE
                    imageView3.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }
                flgChange(0,3)
            }
        }
        crearcheck()
    }

    fun buttonOnclick02(view: View) {
        when {
            anyaFlag[0]==8 -> {
                imageView1.setImageResource(anya[anyaFlag[0]])
                imageView0.setImageResource(anya[anyaFlag[1]])

                try {
                    imageView1.visibility = View.INVISIBLE
                    imageView0.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(1,0)
            }
            anyaFlag[2]==8 -> {
                imageView1.setImageResource(anya[anyaFlag[2]])
                imageView2.setImageResource(anya[anyaFlag[1]])

                try {
                    imageView1.visibility = View.INVISIBLE
                    imageView2.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(1,2)
            }
            anyaFlag[4]==8 -> {
                imageView1.setImageResource(anya[anyaFlag[4]])
                imageView4.setImageResource(anya[anyaFlag[1]])

                try{
                    imageView1.visibility = View.INVISIBLE
                    imageView4.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(1,4)
            }
        }
        crearcheck()
    }

    fun buttonOnclick03(view: View) {
        when {
            anyaFlag[1]==8 -> {
                imageView2.setImageResource(anya[anyaFlag[1]])
                imageView1.setImageResource(anya[anyaFlag[2]])

                try{
                    imageView2.visibility = View.INVISIBLE
                    imageView1.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(2,1)
            }
            anyaFlag[5]==8 -> {
                imageView2.setImageResource(anya[anyaFlag[5]])
                imageView5.setImageResource(anya[anyaFlag[2]])

                try{
                    imageView2.visibility = View.INVISIBLE
                    imageView5.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(2,5)
            }
        }
        crearcheck()
    }

    fun buttonOnclick04(view: View) {
        when {
            anyaFlag[0]==8 -> {
                imageView3.setImageResource(anya[anyaFlag[0]])
                imageView0.setImageResource(anya[anyaFlag[3]])

                try{
                    imageView3.visibility = View.INVISIBLE
                    imageView0.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(3,0)
            }
            anyaFlag[4]==8 -> {
                imageView3.setImageResource(anya[anyaFlag[4]])
                imageView4.setImageResource(anya[anyaFlag[3]])

                try{
                    imageView3.visibility = View.INVISIBLE
                    imageView4.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(3,4)
            }
            anyaFlag[6]==8 -> {
                imageView3.setImageResource(anya[anyaFlag[6]])
                imageView6.setImageResource(anya[anyaFlag[3]])

                try{
                    imageView3.visibility = View.INVISIBLE
                    imageView6.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(3,6)
            }
        }
        crearcheck()
    }

    fun buttonOnclick05(view: View) {
        when {
            anyaFlag[1]==8 -> {
                imageView4.setImageResource(anya[anyaFlag[1]])
                imageView1.setImageResource(anya[anyaFlag[4]])

                try{
                    imageView4.visibility = View.INVISIBLE
                    imageView1.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(4,1)
            }
            anyaFlag[3]==8 -> {
                imageView4.setImageResource(anya[anyaFlag[3]])
                imageView3.setImageResource(anya[anyaFlag[4]])

                try{
                    imageView4.visibility = View.INVISIBLE
                    imageView3.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(4,3)
            }
            anyaFlag[5]==8 -> {
                imageView4.setImageResource(anya[anyaFlag[5]])
                imageView5.setImageResource(anya[anyaFlag[4]])

                try{
                    imageView4.visibility = View.INVISIBLE
                    imageView5.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(4,5)
            }
            anyaFlag[7]==8 -> {
                imageView4.setImageResource(anya[anyaFlag[7]])
                imageView7.setImageResource(anya[anyaFlag[4]])

                try{
                    imageView4.visibility = View.INVISIBLE
                    imageView7.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(4,7)
            }
        }
        crearcheck()
    }

    fun buttonOnclick06(view: View) {
        when {
            anyaFlag[2]==8 -> {
                imageView5.setImageResource(anya[anyaFlag[2]])
                imageView2.setImageResource(anya[anyaFlag[5]])

                try{
                    imageView5.visibility = View.INVISIBLE
                    imageView2.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(5,2)
            }
            anyaFlag[4]==8 -> {
                imageView5.setImageResource(anya[anyaFlag[4]])
                imageView4.setImageResource(anya[anyaFlag[5]])

                try{
                    imageView5.visibility = View.INVISIBLE
                    imageView4.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(5,4)
            }
            anyaFlag[8]==8 -> {
                imageView5.setImageResource(anya[anyaFlag[8]])
                imageView8.setImageResource(anya[anyaFlag[5]])

                try{
                    imageView5.visibility = View.INVISIBLE
                    imageView8.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(5,8)
            }
        }
        crearcheck()
    }

    fun buttonOnclick07(view: View) {
        when {
            anyaFlag[3]==8 -> {
                imageView6.setImageResource(anya[anyaFlag[3]])
                imageView3.setImageResource(anya[anyaFlag[6]])

                try{
                    imageView6.visibility = View.INVISIBLE
                    imageView3.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(6,3)
            }
            anyaFlag[7]==8 -> {
                imageView6.setImageResource(anya[anyaFlag[7]])
                imageView7.setImageResource(anya[anyaFlag[6]])

                try{
                    imageView6.visibility = View.INVISIBLE
                    imageView7.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(6,7)
            }
        }
        crearcheck()
    }

    fun buttonOnclick08(view: View) {
        when {
            anyaFlag[4]==8 -> {
                imageView7.setImageResource(anya[anyaFlag[4]])
                imageView4.setImageResource(anya[anyaFlag[7]])

                try{
                    imageView7.visibility = View.INVISIBLE
                    imageView4.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(7,4)
            }
            anyaFlag[6]==8 -> {
                imageView7.setImageResource(anya[anyaFlag[6]])
                imageView6.setImageResource(anya[anyaFlag[7]])

                try{
                    imageView7.visibility = View.INVISIBLE
                    imageView6.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(7,6)
            }
            anyaFlag[8]==8 -> {
                imageView7.setImageResource(anya[anyaFlag[8]])
                imageView8.setImageResource(anya[anyaFlag[7]])

                try{
                    imageView7.visibility = View.INVISIBLE
                    imageView8.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(7,8)
            }
        }
        crearcheck()
    }

    fun buttonOnclick09(view: View) {
        when {
            anyaFlag[5]==8 -> {
                imageView8.setImageResource(anya[anyaFlag[5]])
                imageView5.setImageResource(anya[anyaFlag[8]])

                try{
                    imageView8.visibility = View.INVISIBLE
                    imageView5.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(8,5)
            }
            anyaFlag[7]==8 -> {
                imageView8.setImageResource(anya[anyaFlag[7]])
                imageView7.setImageResource(anya[anyaFlag[8]])

                try{
                    imageView8.visibility = View.INVISIBLE
                    imageView7.visibility = View.VISIBLE
                }catch (e: Exception){
                    println(e)
                }

                flgChange(8,7)
            }
        }
        crearcheck()
    }

    private fun flgChange(origin: Int, other: Int) {
        val num = anyaFlag[origin]
        anyaFlag[origin] = anyaFlag[other]
        anyaFlag[other] = num
    }

    private fun crearcheck() {
        for (i in 0..8) {
            if(anyaFlag[i] != checkFlag[i]) return
        }

        val intent= Intent(this,Result::class.java)
        startActivity(intent)
    }

    fun onButtonTapped(view: View?){
        finish()
    }
}