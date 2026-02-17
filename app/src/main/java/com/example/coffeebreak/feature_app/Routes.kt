package com.example.coffeebreak.feature_app

sealed class Routes(val route: String) {
    object Welcome : Routes("Welcome")
    object Authorization : Routes("Authorization")
}