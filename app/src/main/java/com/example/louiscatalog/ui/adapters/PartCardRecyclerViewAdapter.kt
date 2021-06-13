package com.example.louiscatalog.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.louiscatalog.entities.Part

class PartCardRecyclerViewAdapter
        internal constructor(private val partsList: List<Part>) :
        RecyclerView.Adapter<PartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartViewHolder {
        return PartViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: PartViewHolder, position: Int) {
        val context = holder.itemView.context
        val partItem = partsList[position]
        holder.bind(partItem, context)
    }

    override fun getItemCount(): Int {
        return partsList.size
    }
}