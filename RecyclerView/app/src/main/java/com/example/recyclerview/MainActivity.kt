package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Rv_Adapter
    lateinit var userList: ArrayList<Rv_Model>
    lateinit var myToolbar: Toolbar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        userList = ArrayList<Rv_Model>()
        myToolbar = findViewById(R.id.myToolbar)

        setActionBar(myToolbar)
        myToolbar.inflateMenu(R.menu.option_menu)


        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))
        userList.add(Rv_Model(R.drawable.profile,"Keyur Parekh","Good Morning"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        adapter = Rv_Adapter(userList,this)
        recyclerView.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
           R.id.camera -> Toast.makeText(this,"Camera",Toast.LENGTH_SHORT).show()
           R.id.search -> Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

}