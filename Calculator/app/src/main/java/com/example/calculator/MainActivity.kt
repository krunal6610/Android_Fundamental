package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception
import kotlin.math.sign

class MainActivity : AppCompatActivity() {

    lateinit var gridLayout: GridLayout
    lateinit var txtPrv : TextView
    lateinit var txtResult : TextView
    lateinit var btnClear : Button
    lateinit var btnBack : Button
    lateinit var btnPer : Button
    lateinit var btnDiv : ImageButton
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btnMul : ImageButton
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btnSub : Button
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btnAdd : Button
    lateinit var btn00 : Button
    lateinit var btn0 : Button
    lateinit var btnDot : Button
    lateinit var btnEqual : Button

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridLayout = findViewById(R.id.gridLayout)
        txtPrv = findViewById(R.id.txtPrv)
        txtResult = findViewById(R.id.txtResult)

        btnClear = findViewById(R.id.btnClear)
        btnBack = findViewById(R.id.btnBack)
        btnPer = findViewById(R.id.btnPer)
        btnDiv = findViewById(R.id.btnDiv)

        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnMul = findViewById(R.id.btnMul)

        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btnSub = findViewById(R.id.btnSub)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btnAdd = findViewById(R.id.btnAdd)

        btn00 = findViewById(R.id.btn00)
        btn0 = findViewById(R.id.btn0)
        btnDot = findViewById(R.id.btnDot)
        btnEqual = findViewById(R.id.btnEqual)


        btn1.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "1"
        })

        btn2.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "2"
        })

        btn3.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "3"
        })

        btn4.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "4"
        })

        btn5.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "5"
        })

        btn6.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "6"
        })

        btn7.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "7"
        })

        btn8.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "8"
        })

        btn9.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "9"
        })

        btn0.setOnClickListener(View.OnClickListener {
            if(txtResult.text.isNotEmpty()){
                txtResult.text = txtResult.text.toString() + "0"
            }

        })

        btn00.setOnClickListener(View.OnClickListener {
            if(txtResult.text.isNotEmpty()){
                txtResult.text = txtResult.text.toString() + "00"
            }
        })

        btnAdd.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "+"
        })

        btnSub.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "-"
        })

        btnMul.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "*"
        })

        btnDiv.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "/"
        })

        btnPer.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "%"
        })

        btnDot.setOnClickListener(View.OnClickListener {
            txtResult.text = txtResult.text.toString() + "."
        })

        btnBack.setOnClickListener(View.OnClickListener {

            txtResult.text = txtResult.text.toString().dropLast(1)
        })

        btnClear.setOnClickListener(View.OnClickListener {

            txtPrv.text = ""
            txtResult.text = ""
            txtResult.hint = "0"

        })

        btnEqual.setOnClickListener(View.OnClickListener {

            try {
                val text = txtResult.text.toString()
                txtPrv.text = text
                val expression = ExpressionBuilder(text).build()

                val result = expression.evaluate()
                txtResult.text = result.toString()

                val longResult = result.toLong()
                if (result == longResult.toDouble()) {
                    txtResult.text = longResult.toString()
                } else {
                    txtResult.text = result.toString()
                }

            }catch (e:Exception){
                //Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }


        })

    }
}