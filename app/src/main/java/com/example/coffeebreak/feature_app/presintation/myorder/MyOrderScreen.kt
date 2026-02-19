package com.example.coffeebreak.feature_app.presintation.myorder

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
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
import kotlin.math.sin

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOrderScreen(navController: NavController) {

    var botomSheetState by remember { mutableStateOf(false) }
    val bttomSheetState = rememberModalBottomSheetState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(horizontal = 24.dp)
    ) {
        IconButton(
            onClick = { navController.navigate(Routes.Menu.route) }
        ) {
            Image(
                painterResource(R.drawable.arrowleft),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(Modifier.size(8.dp))
        Text(
            "Мой заказ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,

            )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 27.dp)
        ) {
            CustomCard(R.drawable.cofee3, "Американо")
            Spacer(Modifier.size(20.dp))
            CustomCard(R.drawable.cofee2, "Капучино")
            Spacer(Modifier.size(20.dp))
            CustomCard(R.drawable.cofee5, "Флэт Уайт")
        }
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp)
                .height(52.dp)
                .padding(horizontal = 12.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.Top
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Text(
                        "Итоговая сумма",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black.copy(alpha = 0.22f)
                    )
                    Text(
                        "300 ₽",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        modifier = Modifier.padding(start = 42.dp)
                    )
                }
                Spacer(Modifier.weight(1f))
                IconButton(
                    onClick = { botomSheetState = true },
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = AppColor.c324
                    ),
                    modifier = Modifier
                        .height(52.dp)
                        .width(162.dp)
                ) {
                    Row {
                        Image(
                            painterResource(R.drawable.buylight),
                            contentDescription = null
                        )
                        Spacer(Modifier.size(25.dp))
                        Text(
                            "Далее",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                }

            }

        }

        if (botomSheetState) {
            ModalBottomSheet(
                onDismissRequest = { botomSheetState = false },
                modifier = Modifier
                    .fillMaxWidth(),
                dragHandle = null,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 33.dp)
                        .padding(top = 35.dp)
                ) {
                    Text(
                        "Оплата заказа",
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.dmsans))
                    )
                    Spacer(Modifier.size(60.dp))
                    Row(
                        modifier = Modifier
                            .width(238.dp)
                            .height(90.dp)
                    ) {
                        Image(
                            painterResource(R.drawable.buyicon),
                            contentDescription = null
                        )
                        Spacer(Modifier.size(24.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Top
                        ) {
                            Text(
                                "Алексей",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                "кофейня Coffee break",
                                fontSize = 10.sp,
                                lineHeight = 10.sp
                            )
                            Text(
                                "г. Оренбург, ул. Чкалова 32",
                                fontSize = 10.sp,
                                lineHeight = 10.sp
                            )

                        }
                    }
                    Spacer(Modifier.size(46.dp))
                    CustomCardPayment(
                        true,
                        "Оплата онлайн",
                        "СБП",
                        R.drawable.paymant1,
                        lastimaga2 = null
                    )
                    Spacer(Modifier.size(19.dp))
                    CustomCardPayment(
                        false,
                        "Банковская карта",
                        "2540 xxxx xxxx 2648",
                        R.drawable.paymant3,
                        lastimaga2 = R.drawable.paymant2
                    )
                    Spacer(Modifier.size(165.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Top
                        ) {
                            Text(
                                "Итоговая сумма",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.Black.copy(alpha = 0.22f)
                            )
                            Text(
                                "300 ₽",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Medium,
                                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                modifier = Modifier.padding(start = 42.dp)
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        IconButton(
                            onClick = { navController.navigate(Routes.OrderConf.route) },
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = AppColor.c324
                            ),
                            modifier = Modifier
                                .height(52.dp)
                                .width(162.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painterResource(R.drawable.cardpaymant),
                                    contentDescription = null
                                )
                                Spacer(Modifier.size(25.dp))
                                Text(
                                    "Оплатить\nсейчас",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CustomCard(
    imaga: Int,
    name: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .background(Color(0xFFD9D9D9).copy(alpha = (0.20f)), RoundedCornerShape(15.dp))
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(imaga),
                contentDescription = null,
                Modifier.size(60.dp)
            )
            Spacer(Modifier.size(8.dp))
            Column() {
                Text(
                    name,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                )
                Text(
                    "single | iced | medium | full ice",
                    fontSize = 10.sp,
                    color = AppColor.c75
                )
                Text(
                    "x 1",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black.copy(alpha = (0.57f))
                )
            }
            Spacer(Modifier.weight(1f))
            Text(
                "100 ₽",
                fontSize = 16.sp,
//                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.mons_semi))
            )
        }
    }
}

@Composable
fun CustomCardPayment(
    radioState: Boolean,
    name: String,
    desc: String,
    lastimaga: Int,
    lastimaga2: Int?
) {

    var radioState by remember { mutableStateOf(radioState) }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .background(Color(0xFFD9D9D9).copy(alpha = (0.20f)), RoundedCornerShape(15.dp))
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = radioState,
                onClick = { },
//                modifier = Modifier.semantics { contentDescription = "Localized Description" },
            )
            Spacer(Modifier.size(18.dp))
            Column() {
                Text(
                    name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FontFamily(Font(R.font.dmsansmedium))
                )
                Text(
                    desc,
                    fontSize = 10.sp,
                    color = Color.Black.copy(0.22f),
                    fontFamily = FontFamily(Font(R.font.poppins_medium))
                )

            }
            Spacer(Modifier.weight(1f))

            if (lastimaga2 != null) {
                Row(
                    modifier = Modifier.fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(lastimaga),
                        contentDescription = null,
                        modifier = Modifier
                            .height(14.dp)
                            .width(47.dp)
                    )
                    Spacer(Modifier.size(7.dp))
                    Image(
                        painterResource(lastimaga2),
                        contentDescription = null,
                        modifier = Modifier
                            .height(26.dp)
                            .width(42.dp)
                    )
                }
            } else {
                Image(
                    painterResource(lastimaga),
                    contentDescription = null,
                    modifier = Modifier
                        .height(46.dp)
                        .width(92.dp)
                )
            }
        }
    }
}