package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesEngine(petrolEngine: PetrolEngine): Engine = PetrolEngine()
}