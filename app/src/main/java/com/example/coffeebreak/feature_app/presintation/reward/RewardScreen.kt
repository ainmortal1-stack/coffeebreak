package com.example.coffeebreak.feature_app.presintation.reward

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import com.example.coffeebreak.feature_app.Routes
import com.example.coffeebreak.feature_app.presintation.menu.CustomIconButton
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun RewardScreen(navController: NavController) {
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
                .fillMaxSize()
                .padding(top = 10.dp)
                .padding(horizontal = 25.dp)
        ) {

            // first card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(138.dp)
                    .background(AppColor.darkone, RoundedCornerShape(12.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Карта лояльности",
                            fontSize = 14.sp,
                            color = AppColor.d8,
                            fontWeight = FontWeight.Medium,
                            fontFamily = FontFamily(Font(R.font.dmsans))
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            "4/6",
                            fontSize = 14.sp,
                            color = AppColor.d8,
                            fontWeight = FontWeight.Medium,
                            fontFamily = FontFamily(Font(R.font.dmsans))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 25.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomIconCofee(R.drawable.coffee_cup_1)
                        CustomIconCofee(R.drawable.coffee_cup_1)
                        CustomIconCofee(R.drawable.coffee_cup_1)
                        CustomIconCofee(R.drawable.coffee_cup_1)

                        CustomIconCofee(R.drawable.coffee_cup_1__1)
                        CustomIconCofee(R.drawable.coffee_cup_1__1)
                        Spacer(Modifier.weight(1f))
                        Text(
                            "16%",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Medium,
                            color = AppColor.c14AC46,
                            fontFamily = FontFamily(Font(R.font.poppins_medium))

                        )
                    }
                }
            }
            Spacer(Modifier.size(24.dp))
            // second card

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(108.dp)
                    .background(AppColor.darkone, RoundedCornerShape(12.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 25.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column() {
                            Text(
                                "Мои баллы:",
                                fontSize = 14.sp,
                                color = AppColor.d8,
                                fontWeight = FontWeight.Medium,
                                fontFamily = FontFamily(Font(R.font.dmsans))
                            )
                            Text(
                                "240",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Medium,
                                color = AppColor.d8,
                                fontFamily = FontFamily(Font(R.font.poppins_medium))
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        TextButton(
                            onClick = {},
                            modifier = Modifier
                                .background(
                                    AppColor.darkonelight,
                                    RoundedCornerShape(5.dp)
                                )
                                .height(111.dp)
                                .width(28.dp)
                        ) {
                            Text(
                                "Оплатить баллами",
                                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                fontSize = 10.sp,
                                color = AppColor.d8,
                                modifier = Modifier.padding(7.dp)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.weight(1f))
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
                    CustomIconButton(navController, Routes.Menu.route, R.drawable.bottomicon1_light)
                    Spacer(Modifier.size(70.dp))
                    CustomIconButton(
                        navController,
                        Routes.Reward.route,
                        R.drawable.bottomicon2_black
                    )
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
fun CustomIconCofee(
    imaga: Int
) {
    Image(
        painterResource(imaga),
        contentDescription = null,
        Modifier.size(30.dp)
    )
}