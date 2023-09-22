package com.example.taskfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(),Communicator {

    lateinit var bottomNavigationView:BottomNavigationView
    lateinit var frame_layout:FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.frame_layout,Fragment_Home()).commit()

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        frame_layout = findViewById(R.id.frame_layout)

      
        bottomNavigationView.setOnItemSelectedListener {


            when(it.itemId){


                R.id.home_bottom->supportFragmentManager.beginTransaction().replace(R.id.frame_layout,Fragment_Home()).commit()
                R.id.profile_bottom->supportFragmentManager.beginTransaction().replace(R.id.frame_layout,Fragment_Profile()).commit()

            }

            return@setOnItemSelectedListener true


        }

    }

    override fun passData(name: String) {

        var fragmentProfile = Fragment_Profile()

        var bundle = Bundle()
        bundle.putString("name",name)

        fragmentProfile.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.frame_layout,fragmentProfile).commit()

       // bottomNavigationView.selectedItemId = R.id.profile_bottom




    }
}