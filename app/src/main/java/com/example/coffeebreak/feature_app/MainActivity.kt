package com.example.coffeebreak.feature_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.coffeebreak.feature_app.presintation.ui.theme.CoffeebreakTheme
import com.example.coffeebreak.feature_app.presintation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeebreakTheme {
                WelcomeScreen()
            }
        }
    }
}
