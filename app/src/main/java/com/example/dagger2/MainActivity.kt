package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.car.Car
import com.example.dagger2.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectThis()
        init()
    }

    private fun init() {
        car.drive()
        car2.drive()
    }

    private fun injectThis() {
        val appComponent = (application as MyApplication).appComponent

        DaggerActivityComponent.builder()
            .horsePower(332)
            .fuelCapacity(322)
            .appComponent(appComponent)
            .build()
            .injectMainActivity(this)
    }
}