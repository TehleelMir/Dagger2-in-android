package com.example.dagger2.dagger

import com.example.dagger2.car.DieselEngine
import com.example.dagger2.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule
    constructor(
        private val horsePower: Int
    ) {

    @Provides
    fun providesDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }
}