package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Car
    @Inject
    constructor(
        private val engine: Engine,
        private val wheels: Wheels
) {

    fun drive() {
        engine.start()
        Log.i("here22", "Driving...")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}