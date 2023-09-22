package com.example.changebgcolouronbtnclick

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    lateinit var txtDetails:TextView
    lateinit var btnRed:Button
    lateinit var btnBlue:Button
    lateinit var btnGreen:Button
    lateinit var btnWhite:Button


    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDetails = findViewById(R.id.textView)
        btnRed = findViewById(R.id.btnRed)
        btnBlue = findViewById(R.id.btnBlue)
        btnGreen = findViewById(R.id.btnGreen)
        btnWhite = findViewById(R.id.btnWhite)
     var consLayout:ConstraintLayout = findViewById(R.id.consLayout_id)

       btnRed.setOnClickListener(View.OnClickListener {
            consLayout.setBackgroundColor(resources.getColor(R.color.red))
        })

       btnBlue.setOnClickListener(View.OnClickListener {
            consLayout.setBackgroundResource(R.color.blue)
        })

        btnGreen.setOnClickListener(View.OnClickListener {
            consLayout.setBackgroundResource(R.color.green)
        })

        btnWhite.setOnClickListener(View.OnClickListener {
            consLayout.setBackgroundResource(R.color.white)
        })


    }
}