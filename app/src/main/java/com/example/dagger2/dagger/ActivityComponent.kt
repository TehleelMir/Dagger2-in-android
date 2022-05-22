package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {

    fun getCar(): Car

    fun injectMainActivity(mainActivity: MainActivity)

 /*   @Component.Builder
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

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }*/
}