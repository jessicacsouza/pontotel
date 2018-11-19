package com.jessicasouza.pontotel.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.jessicasouza.pontotel.R
import com.jessicasouza.pontotel.adapter.JMainAdapter
import com.jessicasouza.pontotel.entities.JData
import com.jessicasouza.pontotel.response.IResponse
import com.jessicasouza.pontotel.retrofit.JWebClient
import kotlinx.android.synthetic.main.activity_jmain.*

class JMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jmain)

        JWebClient().appointmentList(object : IResponse {
            override fun success(appointmentList: JData) {
                configureList(appointmentList)
            }
        })

    }

    private fun configureList(appointments: JData) {
        val recyclerView = recyclerview
        recyclerView.adapter = JMainAdapter(appointments, this)

        val layoutManager = GridLayoutManager(this, GridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

}
