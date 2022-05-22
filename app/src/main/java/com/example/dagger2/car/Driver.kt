package com.example.dagger2.car

import javax.inject.Inject
import javax.inject.Singleton

/*
    Lets assume this class is a third party library and can't access its classes to inject its constructor
 */
class Driver
    constructor() {
}