package com.example.taskfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class Fragment_Home : Fragment() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(



        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment__home, container, false)

        var name = view.findViewById<EditText>(R.id.edt_name)
        var btn = view.findViewById<Button>(R.id.submit_button)

        var communicator:Communicator = activity as Communicator

        btn.setOnClickListener(View.OnClickListener {


          communicator.passData(name.text.toString())

        })


        return view
    }

    companion object {

    }
}