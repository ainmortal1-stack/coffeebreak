package com.example.coffeebreak.feature_app.presintation.forgotpass

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.coffeebreak.feature_app.data.repo.AuthRepositoryImpl

class ForgotPasswordViewModel(private val repo: AuthRepositoryImpl): ViewModel() {
    var mail by mutableStateOf("")


}