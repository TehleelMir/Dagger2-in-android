package com.example.dagger2.dagger

import com.example.dagger2.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @Singleton
    fun provideDriver() = Driver()
}