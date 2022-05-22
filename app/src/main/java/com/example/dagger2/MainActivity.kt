package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.car.Car
import com.example.dagger2.dagger.DieselEngineModule
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
        (application as MyApplication)
            .appComponent
            .activityComponentBuilder()
            .horsePower(32322)
            .fuelCapacity(32322)
            .build()
            .injectMainActivity(this)
    }
}