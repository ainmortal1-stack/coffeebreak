package com.example.coffeebreak.feature_app.presintation.barista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.Routes
import com.example.coffeebreak.feature_app.presintation.menu.CustomIconButton
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun BaristaScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp),
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
                "Конструктор заказа",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.align(Alignment.Center)
            )
            IconButton(
                onClick = { navController.navigate(Routes.MyOrder.route) },
                Modifier.align(Alignment.CenterEnd)
            ) {
                Image(
                    painterResource(R.drawable.buy),
                    contentDescription = null,
                    modifier = Modifier.size(26.dp)
                )
            }
        }

        // main
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp)
        ) {

            Column(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Text(
                    "Выберите бариста",
                    fontSize = 14.sp,
                    color = AppColor.c0018
                )
                CustomBaristaItem()

            }

            // bottombar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 22.dp)
                    .background(AppColor.cFFFFFF, RoundedCornerShape(20.dp))
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    CustomIconButton(navController, Routes.Menu.route, R.drawable.bottomicon1)
                    Spacer(Modifier.size(70.dp))
                    CustomIconButton(navController, Routes.Reward.route, R.drawable.bottomicon2)
                    Spacer(Modifier.size(70.dp))
                    CustomIconButton(
                        navController,
                        Routes.OrderHistory.route,
                        R.drawable.bottomicon3
                    )
                }
            }
        }
    }
}

@Composable
fun CustomBaristaItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(81.dp)
            .background(Color.White, RoundedCornerShape(22.dp))
            .shadow(5.dp, )
    ) {

    }
}