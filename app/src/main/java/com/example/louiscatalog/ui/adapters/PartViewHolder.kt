package com.example.louiscatalog.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.louiscatalog.databinding.PartCardBinding
import com.example.louiscatalog.entities.Part
import com.example.louiscatalog.network.ImageRequester

class PartViewHolder(val cardBinding: PartCardBinding) : RecyclerView.ViewHolder(cardBinding.root) {

    fun bind(partItem: Part, context: Context) {
        cardBinding.tvBrand.text = partItem.brand
        cardBinding.tvTitle.text = partItem.title
        cardBinding.tvPrice.text = partItem.price
        ImageRequester.setImageFromUrl(cardBinding.ivImage, partItem.url)
    }

    companion object {
        fun create(parent: ViewGroup) : PartViewHolder {
            val partBinging = PartCardBinding.inflate(LayoutInflater.from(
                parent.context), parent, false)
            return PartViewHolder(partBinging)
        }
    }
}