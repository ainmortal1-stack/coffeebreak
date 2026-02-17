package com.example.coffeebreak.feature_app.presintation.authorization

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coffeebreak.feature_app.data.repo.AuthRepositoryImpl
import kotlinx.coroutines.launch

class AuthorizationViewModel(private val repo: AuthRepositoryImpl) : ViewModel() {
    var mail by mutableStateOf("")
    var pass by mutableStateOf("")
    var isError by mutableStateOf(false)

    fun signIn() {
        viewModelScope.launch {
            try {
                repo.signIn(
                    mail = mail,
                    pass = pass
                )
            }
            catch (e: Exception) {
                isError = true
            }
        }
    }

}