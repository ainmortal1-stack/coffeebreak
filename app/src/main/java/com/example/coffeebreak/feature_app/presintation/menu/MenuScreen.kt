package com.example.coffeebreak.feature_app.presintation.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.captionBarPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.Routes
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor
import io.github.jan.supabase.realtime.Column

@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp, vertical = 27.dp)
        ) {
            Row {
                Column() {
                    Text(
                        "Добро пожаловать",
                        fontSize = 14.sp,
                        color = AppColor.a1a1a1,
//                    fontFamily = FontFamily(Font())
                    )
                    Text(
                        "Алексей",
                        fontSize = 18.sp,
                        color = AppColor.c4f7993
                    )
                }
                Spacer(Modifier.weight(1f))
                Row() {
                    IconButton(
                        onClick = {navController.navigate(Routes.MyOrder.route)}
                    ) {
                        Image(
                            painterResource(R.drawable.telega),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(
                        onClick = {navController.navigate(Routes.Profile.route)}
                    ) {
                        Image(
                            painterResource(R.drawable.profileicon),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                }
            }
        }

        // 2
        Column(
            Modifier
                .fillMaxSize()
                .background(AppColor.backgrnd, RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .padding(horizontal = 25.dp)
                .padding(top = 16.dp)
        ) {
            Text(
                "Выберите Ваш кофе",
                fontSize = 16.sp,
                color = AppColor.cFFFFFF
            )
            Spacer(Modifier.size(29.dp))
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(17.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.weight(1f)
            ) {
                item { CustomCard(navController, R.drawable.cofee3, "Американо") }
                item { CustomCard(navController, R.drawable.cofee5, "Капучино") }
                item { CustomCard(navController, R.drawable.cofee2, "Латте") }
                item { CustomCard(navController, R.drawable.cofee1, "Флэт Уайт") }
                item { CustomCard(navController, R.drawable.cofee4, "Раф") }
                item { CustomCard(navController, R.drawable.cofee6, "Эспрессо") }
            }

            // bottombar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 22.dp)
                    .background(AppColor.cFFFFFF, RoundedCornerShape(20.dp))
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically)
                {
                    CustomIconButton(navController, Routes.Menu.route, R.drawable.bottomicon1)
                    Spacer(Modifier.size(70.dp))
                    CustomIconButton(navController, Routes.Reward.route, R.drawable.bottomicon2)
                    Spacer(Modifier.size(70.dp))
                    CustomIconButton(navController, Routes.OrderHistory.route, R.drawable.bottomicon3)
                }
            }
        }
    }
}

@Composable
fun CustomCard(
    navController: NavController,
    imaga: Int,
    name: String,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(AppColor.cFFFFFF, RoundedCornerShape(15.dp))
            .height(164.dp)
            .clickable(onClick = { navController.navigate(Routes.Empty.route) })
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painterResource(imaga),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Spacer(Modifier.weight(1f))
            Text(
                name,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily(Font(R.font.dmsans)),
                color = AppColor.bgb,
//                textAlign = TextAlign.Center
            )
            Text(
                "100₽",
                fontSize = 14.sp,
                color = AppColor.bgb,
                modifier = Modifier
                    .align(AbsoluteAlignment.Right)
                    .padding(horizontal = 7.dp)
            )

        }
    }
}

@Composable
fun CustomIconButton(
    navController: NavController,
    navigata: String,
    imaga: Int
) {
    IconButton(onClick = { navController.navigate(navigata) }) {
        Image(
            painterResource(imaga),
            contentDescription = null,
            Modifier.height(64.dp)
        )
    }
}