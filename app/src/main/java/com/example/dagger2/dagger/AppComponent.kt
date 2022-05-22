package com.example.dagger2.dagger

import com.example.dagger2.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun activityComponent(
        dieselEngineModule: DieselEngineModule
    ): ActivityComponent
}