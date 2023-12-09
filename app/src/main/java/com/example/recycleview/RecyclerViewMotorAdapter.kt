package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMotorAdapter constructor(private val getActivity: MainActivity, private val motorlist : List<Motor>):
    RecyclerView.Adapter<RecyclerViewMotorAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_motor_list_item, parent, false)
        return MyViewHolder(view)

    }
    override fun getItemCount(): Int {
        return motorlist.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvMotorTitle.text=motorlist[position].title
        holder.tvMotorImg.setImageResource(motorlist[position].image)
        holder.cardView.setOnClickListener{
            Toast.makeText(getActivity, motorlist[position].title, Toast.LENGTH_LONG).show()
        }
    }
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMotorTitle : TextView = itemView.findViewById(R.id.tvMotorTitle)
        val tvMotorImg : ImageView = itemView.findViewById(R.id.ivmotorimg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}