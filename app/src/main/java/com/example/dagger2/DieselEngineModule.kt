package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine = dieselEngine
}