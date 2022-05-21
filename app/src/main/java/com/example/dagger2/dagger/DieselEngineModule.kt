package com.example.dagger2.dagger

import com.example.dagger2.car.DieselEngine
import com.example.dagger2.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine = dieselEngine
}