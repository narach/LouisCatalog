package com.example.louiscatalog.entities

import android.content.res.Resources
import com.example.louiscatalog.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.util.ArrayList

class Part(val title: String, val brand: String, val url: String, val price: String) {

    companion object {
        fun initPartsList(resources: Resources) : List<Part> {
            val inputStream = resources.openRawResource(R.raw.parts)
            val jsonPartsString = inputStream.bufferedReader().use(BufferedReader::readText)
            val gson = Gson()
            val productListType = object : TypeToken<ArrayList<Part>>() {}.type
            return gson.fromJson<List<Part>>(jsonPartsString, productListType)
        }
    }
}