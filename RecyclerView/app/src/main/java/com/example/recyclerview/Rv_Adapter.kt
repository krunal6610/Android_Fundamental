package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Rv_Adapter(var userList: ArrayList<Rv_Model>,var context: Context):
    RecyclerView.Adapter<Rv_Adapter.MyViewHolder>() {

    inner class MyViewHolder(item:View):RecyclerView.ViewHolder(item){
        var userImg = item.findViewById<ImageView>(R.id.userImg)
        var txtName = item.findViewById<TextView>(R.id.txtName)
        var txtMsg = item.findViewById<TextView>(R.id.txtMsg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.rv_raw,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentPostition = userList.get(position)
        holder.txtName.text = currentPostition.userName
        holder.txtMsg.text = currentPostition.userMsg
        holder.userImg.setImageResource(currentPostition.uImg)
    }

}