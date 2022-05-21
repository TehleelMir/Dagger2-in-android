package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.car.Car
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun injectMainActivity(mainActivity: MainActivity)
}