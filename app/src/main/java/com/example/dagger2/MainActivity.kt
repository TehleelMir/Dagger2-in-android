package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.car.Car
import com.example.dagger2.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectThis()
        init()
    }

    private fun init() {
        car.drive()
    }

    private fun injectThis() {
        DaggerCarComponent.create()
            .injectMainActivity(this)
    }
}