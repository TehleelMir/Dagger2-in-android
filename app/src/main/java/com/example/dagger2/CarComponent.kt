package com.example.dagger2

import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun injectMainActivity(mainActivity: MainActivity)
}