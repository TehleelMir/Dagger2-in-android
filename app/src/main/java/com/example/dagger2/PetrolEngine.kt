package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class PetrolEngine
    @Inject
    constructor(): Engine {

    override fun start() {
        Log.i("here22", "Petrol Engine started")
    }
}