package com.example.dagger2.dagger

import com.example.dagger2.car.Engine
import com.example.dagger2.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine): Engine
}