package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.car.Car
import dagger.BindsInstance
import dagger.Component
import java.lang.annotation.Native
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun injectMainActivity(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(
            @Named("horsePower")
            horsePower: Int
        ): Builder

        @BindsInstance
        fun fuelCapacity(
            @Named("fuel")
            fuelCapacity: Int
        ): Builder

        fun build(): CarComponent
    }
}