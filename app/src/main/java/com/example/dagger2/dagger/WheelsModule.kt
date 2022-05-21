package com.example.dagger2.dagger

import com.example.dagger2.car.Rims
import com.example.dagger2.car.Tires
import com.example.dagger2.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun providesRims() = Rims()

    @Provides
    fun providesTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)

}