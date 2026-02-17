package com.example.coffeebreak.feature_app.presintation.forgotpass

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun ForgotPasswordScreen(navController: NavController, viewModel: ForgotPasswordViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()

    ) {


        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .padding(horizontal = 13.dp)
                .padding(top = 21.dp)
        ) {
            Image(
                painterResource(R.drawable.arrowleft),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 21.dp)
                .padding(horizontal = 41.dp)
        ) {
            Text(
                "Забыли пароль?",
                style = TextStyle(
                    fontSize = 22.sp,
                    color = AppColor.c14AC46

                )
            )
            Spacer(Modifier.size(24.dp))
            Text(
                "Введите адрес электронной почты",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = AppColor.darkone
                )
            )
            Spacer(Modifier.size(57.dp))
            TextField(
                value = viewModel.mail,
                onValueChange = { viewModel.mail = it },
                placeholder = {
                    Text(
                        "Адрес электронной почты ",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = AppColor.lightgray,
                            fontWeight = FontWeight.Medium
                        )
                    )
                },
                leadingIcon = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painterResource(R.drawable.messageforgot),
                            contentDescription = null,
                            Modifier.size(18.dp)
                        )
                        Spacer(Modifier.size(9.dp))
                        Box(
                            modifier = Modifier
                                .size(width = 1.dp, height = 25.dp)
                                .background(Color(0xFFC1C7D0))
                        )
                    }
                },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = AppColor.lightgray,
                    focusedLabelColor = AppColor.lightgray
                ),
                modifier = Modifier.fillMaxWidth()


            )

            Spacer(Modifier.size(153.dp))

            IconButton(
                onClick = {},
                modifier = Modifier
                    .background(AppColor.c14AC46, CircleShape)
                    .size(64.dp)
                    .fillMaxWidth()
                    .align(AbsoluteAlignment.Right),


                ) {
                Image(
                    painterResource(R.drawable.arrowright),
                    contentDescription = null
                )
            }
        }
    }
}