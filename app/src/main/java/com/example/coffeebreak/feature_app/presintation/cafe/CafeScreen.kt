package com.example.coffeebreak.feature_app.presintation.cafe

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Preview(showBackground = true)
@Composable
fun CafeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painterResource(R.drawable.map),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
//            colorFilter = Colorfil
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .size(375.dp)
                .align(Alignment.BottomCenter)
                .background(AppColor.c14AC46, RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Выберите кофейню Coffee break",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = AppColor.cFFFFFF,
                ),
                modifier = Modifier.padding(top = 27.dp)
            )
            Spacer(Modifier.size(31.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(375.dp)
                    .background(
                        AppColor.cFFFFFF,
                        RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.size(24.dp))

                AdressSurface("ул. Туркестанская, 3 ")
                Spacer(Modifier.size(12.dp))

                AdressSurface("ул. Чкалова, 32 ")
                Spacer(Modifier.size(12.dp))

                AdressSurface("ул. Советская, 3 ")
            }
        }
    }
}

@Composable
fun AdressSurface(
    adress: String
) {
    Box(
        modifier = Modifier
            .background(AppColor.c14AC46, RoundedCornerShape(12.dp))
            .size(width = 315.dp, height = 50.dp)
    ) {
        Row {
            Image(
                painterResource(R.drawable.home),
                contentDescription = null,

                )
            Spacer(Modifier.size(12.dp))
            Text(
                adress,
                style = TextStyle(
                    color = AppColor.cFFFFFF
                )

            )
            Spacer(Modifier.size(32.dp))
            Image(
                painterResource(R.drawable.miniarrow),
                contentDescription = null,
            )
        }
    }
}