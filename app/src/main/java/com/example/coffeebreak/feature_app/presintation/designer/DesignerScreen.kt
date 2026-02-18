package com.example.coffeebreak.feature_app.presintation.designer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun DesignerScreen(navController: NavController) {
    var sliderPosition by remember { mutableFloatStateOf(0.5f) }

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
                "Конструктор кофемана",
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
                .fillMaxSize()
                .padding(horizontal = 28.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Выберите бариста",
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                    color = AppColor.c0018
                )
                Spacer(Modifier.weight(1f))
                IconButton(onClick = {}) {
                    Image(
                        painterResource(R.drawable.icon_more__1_),
                        contentDescription = null
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(AppColor.f4)
                    .height(1.dp)
            ) {}

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Вид кофе ",
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                    color = AppColor.c0018
                )
                Spacer(Modifier.size(12.dp))
                Slider(
                    value = sliderPosition,
                    onValueChange = {sliderPosition = it},
                    colors = SliderDefaults.colors(
                        inactiveTrackColor = Color(0xff007AFF),
                        activeTrackColor = Color(0xff007AFF),
                        thumbColor = AppColor.lightgray
                    )

                )

            }

        }
    }
}