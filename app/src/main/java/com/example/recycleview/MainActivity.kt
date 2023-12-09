package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var recyclerViewMotorAdapter : RecyclerViewMotorAdapter? = null
    private var motorList = mutableListOf<Motor>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        motorList = ArrayList()

        recyclerView = findViewById<View>(R.id.rv_MotorList) as RecyclerView
        recyclerViewMotorAdapter = RecyclerViewMotorAdapter(this@MainActivity, motorList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewMotorAdapter

        prepareMotorListData()

    }

    private fun prepareMotorListData() {
        var motor = Motor("bmw", R.drawable.bmw)
        motorList.add(motor)
        motor = Motor("dodge", R.drawable.dodge)
        motorList.add(motor)
        motorList.add(motor)
        motor = Motor("ducati", R.drawable.ducati)
        motorList.add(motor)
        motorList.add(motor)
        motor = Motor("h2r", R.drawable.h2r)
        motorList.add(motor)
        motorList.add(motor)
        motor = Motor("hayabusa", R.drawable.hayabusa)
        motorList.add(motor)
        motorList.add(motor)
        motor = Motor("gsx", R.drawable.gsx)
        motorList.add(motor)
        motorList.add(motor)
        motor = Motor("r1m", R.drawable.r1m)
        motorList.add(motor)
        motorList.add(motor)
        motor = Motor("zx10r", R.drawable.zx10)
        motorList.add(motor)

        recyclerViewMotorAdapter!!.notifyDataSetChanged()

    }
}