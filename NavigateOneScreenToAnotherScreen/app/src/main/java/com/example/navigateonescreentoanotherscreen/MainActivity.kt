package com.example.navigateonescreentoanotherscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nextBtn:Button
    lateinit var firstTxt:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextBtn =findViewById(R.id.nextBtn)
        firstTxt = findViewById(R.id.firstScreenTxt_id)

        nextBtn.setOnClickListener(View.OnClickListener {
            var i = Intent(this,SecondActivity::class.java)
            startActivity(i)
        })

    }
}