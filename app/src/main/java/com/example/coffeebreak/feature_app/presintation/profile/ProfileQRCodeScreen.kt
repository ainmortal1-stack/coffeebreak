package com.example.coffeebreak.feature_app.presintation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun ProfileQRCodeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp, vertical = 21.dp),
        ) {
            IconButton(
                onClick = { navController.popBackStack() },
//                modifier = Modifier
//                    .padding(horizontal = 13.dp)
//                    .padding(top = 21.dp)
            ) {
                Image(
                    painterResource(R.drawable.arrowleft),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
            Text(
                "Профиль",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.align(Alignment.Center)
            )
        }


        // main
        Column(
            modifier = Modifier
                .fillMaxWidth(),
//                .padding(top = 17.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Ваш персональный QR-код",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.dmsans)),
                color = Color.Black
            )
            Spacer(Modifier.size(30.dp))

            Image(
                painterResource(R.drawable.qr),
                contentDescription = null,

            )
            Spacer(Modifier.size(20.dp))
            Text(
                "Покажите ваш QR-code\nдля получения заказа",
                fontSize = 18.sp,
                color = AppColor.darkone,
                fontWeight = FontWeight.Medium
            )
        }
    }
}