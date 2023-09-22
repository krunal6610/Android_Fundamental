package com.example.loginandregistrationscreen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin:Button
    lateinit var btnRegister:Button
    lateinit var frameLayout: FrameLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegistration)
        frameLayout = findViewById(R.id.frameLayout)

        var loginPageFragment = LoginPageFragment()
        var registerPageFragment = RegisterPageFragment()

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,loginPageFragment).commit()


        btnLogin.setOnClickListener(View.OnClickListener {

            supportFragmentManager.beginTransaction().replace(R.id.frameLayout,loginPageFragment).commit()
        })

        btnRegister.setOnClickListener(View.OnClickListener {

            supportFragmentManager.beginTransaction().replace(R.id.frameLayout,registerPageFragment).commit()

        })

    }
}