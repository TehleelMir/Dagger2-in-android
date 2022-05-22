package com.example.dagger2

import android.app.Application
import com.example.dagger2.dagger.ActivityComponent
import com.example.dagger2.dagger.AppComponent
import com.example.dagger2.dagger.DaggerAppComponent

class MyApplication: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}