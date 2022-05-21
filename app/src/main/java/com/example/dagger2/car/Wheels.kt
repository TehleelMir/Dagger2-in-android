package com.example.dagger2.car


/*
    Lets assume this class is a third party library and can't access its classes to inject its constructor
 */
class Wheels(
    val rims: Rims,
    val tires: Tires
    ) {

}