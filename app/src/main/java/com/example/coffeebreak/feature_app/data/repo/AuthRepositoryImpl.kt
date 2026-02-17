package com.example.coffeebreak.feature_app.data.repo

import com.example.coffeebreak.feature_app.data.network.SupaBaseClient.client
import com.example.coffeebreak.feature_app.domain.repo.AuthRepository
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.builtin.Email

class AuthRepositoryImpl: AuthRepository {
    override suspend fun signIn(mail: String, pass: String) {
        client.auth.signInWith(Email) {
            email = mail
            password = pass
        }
    }
}