package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Remote
    @Inject
    constructor() {

        fun setListener(car: Car) {
            Log.i("here22", "Remote Connected")
        }
}