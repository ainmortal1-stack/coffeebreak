package com.example.coffeebreak.feature_app.data.network

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClient {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://xyzcompany.supabase.co",
        supabaseKey = "publishable-or-anon-key"
    ) {
        install(Auth)
        install(Postgrest)
        //install other modules
    }
}