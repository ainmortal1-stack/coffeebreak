package com.example.coffeebreak.feature_app.presintation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.Routes
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor
import io.github.jan.supabase.realtime.Column

@Composable
fun ProfileScreen(navController: NavController) {
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
                .padding(horizontal = 33.dp),
            verticalArrangement = Arrangement.spacedBy(26.dp)
        ) {
            CustomRowProfile(
                navController,
                Routes.Empty.route,
                R.drawable.profileicon5,
                "Имя",
                "Алексей",
                R.drawable.edit
            )
            CustomRowProfile(
                navController,
                Routes.Empty.route,
                R.drawable.profileicon4,
                "Номер телефона",
                "+7 812 324 6345",
                R.drawable.edit
            )
            CustomRowProfile(
                navController,
                Routes.Empty.route,
                R.drawable.profileicon3,
                "Почта",
                "apolsdiapoui@gmail.com",
                R.drawable.edit
            )
            CustomRowProfile(
                navController,
                Routes.Empty.route,
                R.drawable.profileicon2,
                "Адрес кофейни Magic Coffee",
                "г. Оренбург, ул. Чкалова 32",
                R.drawable.edit
            )
            CustomRowProfile(
                navController,
                Routes.ProfileQRCode.route,
                R.drawable.profileicon1,
                "QR-код",
                "Для получения заказа",
                R.drawable.icon_more
            )

        }
    }
}

@Composable
fun CustomRowProfile(
    navController: NavController,
    puti: String,
    imaga: Int,
    name: String,
    description: String,
    lastIcon: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(imaga),
            contentDescription = null,
            modifier = Modifier.size(42.dp)
        )
        Spacer(Modifier.size(16.dp))
        Column(verticalArrangement = Arrangement.spacedBy((-8).dp)) {
            Text(
                name,
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
                color = AppColor.lightgray
            )
            Text(
                description,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppColor.darkone
            )
        }
        Spacer(Modifier.weight(1f))
        IconButton(onClick = {
            navController.navigate(
                puti
            )
        }) {
            Image(
                painterResource(lastIcon),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}