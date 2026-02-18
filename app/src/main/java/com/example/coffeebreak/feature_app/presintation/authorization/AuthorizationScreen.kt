package com.example.coffeebreak.feature_app.presintation.authorization

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeebreak.R
import com.example.coffeebreak.feature_app.Routes
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun AuthorizationScreen(navController: NavController, viewModel: AuthorizationViewModel) {

    var mail by rememberSaveable { mutableStateOf(viewModel.mail) }
    var pass by rememberSaveable { mutableStateOf(viewModel.pass) }
    var isPassVisible by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 41.dp)
    ) {
        Spacer(Modifier.size(91.dp))
        Column() {
            Text(
                "Войти",
                style = TextStyle(
                    color = AppColor.c14AC46,
                    fontSize = 22.sp,

                    )
            )
            Spacer(Modifier.size(24.dp))
            Text(
                "Добро пожаловать",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = AppColor.darkone
                )
            )
        }
        Spacer(Modifier.size(57.dp))

        // поля
        Column(
            Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
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
                            painterResource(R.drawable.message),
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

            TextField(
                value = viewModel.pass,
                onValueChange = { viewModel.pass = it },
                placeholder = {
                    Text(
                        "Пароль ",
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
                            painterResource(R.drawable.lock),
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
                trailingIcon = {
                    Image(
                        painterResource(R.drawable.eye),
                        contentDescription = null,
                        Modifier
                            .size(18.dp)
                            .clickable(onClick = { isPassVisible = !isPassVisible })
                    )
                },

                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = AppColor.lightgray,
                    focusedLabelColor = AppColor.lightgray
                ),
                visualTransformation = if (isPassVisible) {
                    PasswordVisualTransformation()
                } else {
                    VisualTransformation.None
                },
                modifier = Modifier.fillMaxWidth()

            )
//            Spacer(Modifier.size(27.dp))
            Text(
                "Забыли пароль?",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = AppColor.c14AC46
                ),
                modifier = Modifier
                    .clickable(
                        onClick = {
                            navController.navigate(Routes.ForgotPassword.route)
                        }
                    )
            )

        }

        Spacer(Modifier.size(136.dp))

        IconButton(
            onClick = {
                navController.navigate(Routes.StartUp.route)
            },
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