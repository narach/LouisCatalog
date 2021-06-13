package com.example.louiscatalog.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class LouisCatalogApplication : Application() {
    companion object {
        lateinit var instance: LouisCatalogApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }
}