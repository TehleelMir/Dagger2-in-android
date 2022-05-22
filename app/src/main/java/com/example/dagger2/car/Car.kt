package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class Car
    @Inject
    constructor(
        private val engine: Engine,
        private val wheels: Wheels,
        private val driver: Driver
) {

    fun drive() {
        engine.start()
        Log.i("here22", "$driver Driving... $this")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}