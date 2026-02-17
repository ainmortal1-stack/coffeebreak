package com.example.coffeebreak.feature_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.coffeebreak.feature_app.presintation.authorization.AuthorizationScreen
import com.example.coffeebreak.feature_app.presintation.authorization.AuthorizationViewModel
import com.example.coffeebreak.feature_app.presintation.ui.theme.CoffeebreakTheme
import com.example.coffeebreak.feature_app.presintation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeebreakTheme {
                val navController = rememberNavController()

                NavHost(
                    navController, startDestination = Routes.Welcome.route
                ) {
                    composable(Routes.Welcome.route) {
                        WelcomeScreen(navController)
                    }
                    composable(Routes.Authorization.route) {
                        AuthorizationScreen(navController,AuthorizationViewModel())
                    }
                }
            }
        }
    }
}
