package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class DieselEngine
    @Inject
    constructor(
        private val horsePower: Int
    ): Engine {

    override fun start() {
        Log.i("here22", "Diesel Engine Started horse power = $horsePower")
    }
}