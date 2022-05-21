package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine): Engine
}