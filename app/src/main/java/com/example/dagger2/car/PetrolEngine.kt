package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine
    @Inject
    constructor(
        @Named("horsePower")
        private val horsePower: Int,
        @Named("fuel")
        private val fuelCapacity: Int
    ): Engine {

    override fun start() {
        Log.i("here22", "Petrol Engine started and horse power = $horsePower and the fuel = $fuelCapacity")
    }
}