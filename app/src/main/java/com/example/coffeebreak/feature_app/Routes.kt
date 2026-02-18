package com.example.coffeebreak.feature_app

sealed class Routes(val route: String) {
    object Welcome : Routes("Welcome")
    object Authorization : Routes("Authorization")
    object ForgotPassword : Routes("ForgotPassword")
    object StartUp : Routes("StartUp")
    object Empty: Routes("Empty")
    object Menu : Routes("Menu")
    object MyOrder : Routes("MyOrder")
    object Profile : Routes("Profile")
    object ProfileQRCode : Routes("QR")
    object Reward : Routes("Reward")
    object OrderHistory : Routes("OrderHistory")
    object OrderOptions : Routes("OrderOptions")
    object DesignerScreen : Routes("Designer")
}