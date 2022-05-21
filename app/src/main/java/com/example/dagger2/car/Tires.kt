package com.example.dagger2.car

import android.util.Log

/*
    Lets assume this class is a third party library and can't access its classes to inject its constructor
 */
class Tires {

    fun inflate() {
        Log.i("here22", "Tires Inflated")
    }
}