package com.example.coffeebreak.feature_app.presintation.myorder

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.Routes
import io.github.jan.supabase.realtime.Column

@Composable
fun OrderConfirm(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(horizontal = 24.dp)
    ) {
        IconButton(
            onClick = { navController.popBackStack() }
        ) {
            Image(
                painterResource(R.drawable.arrowleft),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(Modifier.size(130.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painterResource(R.drawable.take_away_1),
                contentDescription = null
            )
            Spacer(Modifier.size(32.dp))
            Text(
                "Заказано",
                fontSize = 22.sp,

            )

        }
    }
}