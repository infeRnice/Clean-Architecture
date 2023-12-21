package com.example.myapplication.app

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

    appComponent = DaggerAppComponent.builder()
        .context(this)
        .build()
    }
}