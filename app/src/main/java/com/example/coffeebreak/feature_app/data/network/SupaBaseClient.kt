package com.example.coffeebreak.feature_app.data.network

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupaBaseClient {
    val client = createSupabaseClient(
        supabaseUrl = "https://lktunsugbmkxjuhrkrwa.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImxrdHVuc3VnYm1reGp1aHJrcndhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzEzMDY0NzMsImV4cCI6MjA4Njg4MjQ3M30.VqpLI3pscPVzZQ1fax9z6QjJv5kauLnO0UuLfk_jkK4"
    ) {
        install(Postgrest)
        install(Auth)
    }
}