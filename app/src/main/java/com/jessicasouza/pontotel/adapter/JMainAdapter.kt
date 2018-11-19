package com.jessicasouza.pontotel.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jessicasouza.pontotel.R
import com.jessicasouza.pontotel.entities.JData
import com.jessicasouza.pontotel.entities.JEntity
import kotlinx.android.synthetic.main.item.view.*

class JMainAdapter(
    private val data: JData,
    private val context: Context
) : RecyclerView.Adapter<JMainAdapter.JMainViewHolder>() {

    override fun onBindViewHolder(holder: JMainViewHolder?, position: Int) {
        val appointment = data.data[position]
        holder?.let {
            it.bindView(appointment)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): JMainViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return JMainViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.data.size
    }

    class JMainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(appointment: JEntity) {
            val id = itemView.rv_id
            val name = itemView.rv_name
            val pwd = itemView.rv_pwd

            id.text = appointment.id
            name.text = appointment.name
            pwd.text = appointment.pwd
        }

    }
}