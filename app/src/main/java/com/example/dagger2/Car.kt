package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Car
    @Inject
    constructor(
    val engine: Engine,
    val wheels: Wheels
) {

    fun drive() {
        Log.i("here22", "Driving...")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}