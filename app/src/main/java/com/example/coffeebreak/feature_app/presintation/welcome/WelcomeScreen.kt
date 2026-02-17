package com.example.coffeebreak.feature_app.presintation.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Preview(showBackground = true)
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // verh
        Spacer(Modifier.size(62.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppColor.c14AC46)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.iconpng),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 63.dp)
                        .size(98.dp)
                )
                Text(
                    "Coffee break",
                    style = TextStyle(
                        fontSize = 64.sp,
                        color = AppColor.cFFFFFF,
                        fontFamily = FontFamily(Font(R.font.redressed))
                    ),
                    modifier = Modifier.padding(top = 54.dp, bottom = 46.dp)
                )
            }

        }
        Spacer(Modifier.size(25.dp))
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "Почувствуй себя бариста!",
                style = TextStyle(
                    fontSize = 25.sp,
                    color = AppColor.black

                )
            )
            Text(
                "Любой кофе под ваш заказ",
                style = TextStyle(
                    fontSize = 17.sp,
                    color = AppColor.lightgray
                ),
                modifier = Modifier.padding(top = 5.dp)
            )
        }
    }
}