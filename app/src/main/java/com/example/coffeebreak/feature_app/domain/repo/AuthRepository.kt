package com.example.coffeebreak.feature_app.domain.repo

interface AuthRepository {
    suspend fun signIn(mail: String, pass: String)
}