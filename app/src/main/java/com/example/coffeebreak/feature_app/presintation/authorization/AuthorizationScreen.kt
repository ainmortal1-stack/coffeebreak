package com.example.coffeebreak.feature_app.presintation.authorization

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeebreak.feature_app.presintation.ui.theme.AppColor

@Composable
fun AuthorizationScreen(viewModel: AuthorizationViewModel) {


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
        Column() {
            TextField(
                value = {viewModel.email  },
                onValueChange = { viewModel.email = it },
            )
            TextField(
                value = "",
                onValueChange = {viewModel.pass = it},

            )
        }
    }
}