package com.example.coffeebreak.feature_app.presintation.orderoptions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import io.github.jan.supabase.realtime.Column

@Composable
fun OrderOptionsScreen(navController: NavController) {
    var checked by remember { mutableStateOf(true) }


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
                "Заказ",
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
                .padding(horizontal = 25.dp)
        ) {

            // карточка с кофейком
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(146.dp)
                    .background(AppColor.f7, RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painterResource(R.drawable.cofee5),
                    contentDescription = null,
                    modifier = Modifier.size(height = 121.dp, width = 152.dp)

                )
            }
            Spacer(Modifier.size(13.dp))
            // parametrs
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {

                //first row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 23.dp),

                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text(
                        "Капучино",
                        fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                        fontSize = 14.sp,
                        color = AppColor.c2828,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(Modifier.weight(1f))

                    // кнопка с +-
                    Box(
                        modifier = Modifier
                            .size(height = 29.dp, width = 73.dp)
                            .background(Color.Transparent, RoundedCornerShape(50.dp))
                            .border(2.dp, AppColor.d8, RoundedCornerShape(50.dp))
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "-",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                                color = AppColor.c0018,
                            )
                            Spacer(Modifier.size(16.dp))
                            Text(
                                "1",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                                color = AppColor.c0018,
                            )
                            Spacer(Modifier.size(16.dp))
                            Text(
                                "+",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                                color = AppColor.c0018,
                            )
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(AppColor.f4)
                        .height(1.dp)
                ) {}

                // second row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 23.dp),

                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text(
                        "Ристретто",
                        fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                        fontSize = 14.sp,
                        color = AppColor.c2828,
//                        fontWeight = FontWeight.Medium

                    )
                    Spacer(Modifier.weight(1f))

                    // кнопка 1
                    Box(
                        modifier = Modifier
                            .size(height = 29.dp, width = 73.dp)
                            .background(Color.Transparent, RoundedCornerShape(50.dp))
                            .border(1.dp, AppColor.c0018, RoundedCornerShape(50.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Один",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            color = AppColor.c0018,
                        )
                    }
                    Spacer(Modifier.size(8.dp))
                    // кнопка 2
                    Box(
                        modifier = Modifier
                            .size(height = 29.dp, width = 73.dp)
                            .background(Color.Transparent, RoundedCornerShape(50.dp))
                            .border(2.dp, AppColor.d8, RoundedCornerShape(50.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Два",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            color = AppColor.c0018,
                        )
                    }
                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(AppColor.f4)
                        .height(1.dp)
                ) {}

                // third row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 23.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "На месте / навынос",
                        fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                        fontSize = 14.sp,
                        color = AppColor.c2828,
//                        fontWeight = FontWeight.Medium

                    )
                    Spacer(Modifier.weight(1f))

                    // кнопка 1
                    Image(
                        painterResource(R.drawable.kofeek_seriy),
                        contentDescription = null
                    )
                    Spacer(Modifier.size(31.dp))
                    // кнопка 2
                    Image(
                        painterResource(R.drawable.coctail),
                        contentDescription = null
                    )
                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(AppColor.f4)
                        .height(1.dp)
                ) {}

                // four row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 23.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Объем, мл",
                        fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                        fontSize = 14.sp,
                        color = AppColor.c2828,
//                        fontWeight = FontWeight.Medium

                    )
                    Spacer(Modifier.weight(1f))

                    Box() {
                        Column() {
                            Row(
//                            Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.Bottom
                            ) {
                                Spacer(Modifier.size(5.dp))
                                Image(
                                    painterResource(R.drawable.raf_mini),
                                    contentDescription = null
                                )
                                Spacer(Modifier.size(32.dp))

                                Image(
                                    painterResource(R.drawable.raf_medium),
                                    contentDescription = null
                                )
                                Spacer(Modifier.size(31.dp))
                                Image(
                                    painterResource(R.drawable.raf_high),
                                    contentDescription = null
                                )
                            }

                            Row(
//                            Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.Top
                            ) {
                                Text(
                                    "250",
                                    fontSize = 14.sp,
                                    color = AppColor.d8,
                                    fontFamily = FontFamily(Font(R.font.dmsansmedium))
                                )

                                Spacer(Modifier.size(27.dp))
                                // кнопка 2


                                Text(
                                    "350",
                                    fontSize = 14.sp,
                                    color = AppColor.c0018,
                                    fontFamily = FontFamily(Font(R.font.dmsansmedium))
                                )

                                Spacer(Modifier.size(28.dp))
                                // кнопка 3


                                Text(
                                    "450",
                                    fontSize = 14.sp,
                                    color = AppColor.d8,
                                    fontFamily = FontFamily(Font(R.font.dmsansmedium))
                                )
                            }
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(AppColor.f4)
                        .height(1.dp)
                ) {}

                // five row
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                        .padding(end = 23.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Приготовить к\nопределенному времени\nсегодня?",
                        fontFamily = FontFamily(Font(R.font.dmsansmedium)),
                        fontSize = 14.sp,
                        color = AppColor.c2828,
//                        fontWeight = FontWeight.Medium

                    )
                    Spacer(Modifier.weight(1f))

                    Box() {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.End
                        ) {

                            //переключатель
                            Switch(
                                checked,
                                onCheckedChange = { checked = it },
                                colors = SwitchDefaults.colors(
                                    checkedTrackColor = AppColor.c14AC46
                                )
                            )
                            Spacer(Modifier.size(16.dp))
                            Box(
                                modifier = Modifier
                                    .size(height = 36.dp, width = 86.dp)
                                    .background(AppColor.d8, RoundedCornerShape(6.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "18 : 10",
                                    fontSize = 22.sp,
                                    color = Color.Black,
                                    fontFamily = FontFamily(Font(R.font.dmsans))

                                )
                            }
                        }
                    }
                }
                Spacer(
                    Modifier.size(
                        16.dp
                    )
                )
            }
            // constructor
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(AppColor.c14f, RoundedCornerShape(16.dp))
                    .clickable(onClick = { navController.navigate(Routes.DesignerScreen.route) }),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 15.dp),
//                        .padding(17.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(R.drawable.filter),
                        contentDescription = null,
                    )
                    Spacer(Modifier.size(10.dp))
                    Text(
                        "Конструктор кофемана",
                        fontSize = 14.sp,
                        color = AppColor.cFFFFFF
                    )
                    Spacer(Modifier.weight(1f))
                    Image(
                        painterResource(R.drawable.miniarrow),
                        contentDescription = null
                    )
                }
            }

            Spacer(Modifier.size(28.dp))

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .height(80.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                ) {
                    Row() {
                        Text(
                            "Итоговая сумма",
                            fontSize = 14.sp,
                            color = AppColor.c2828,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            "250₽",
                            fontSize = 14.sp,
                            color = AppColor.c2828,
                            fontWeight = FontWeight.Medium

                        )
                    }
                    TextButton(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(AppColor.darkone, RoundedCornerShape(30.dp))
                    ) {
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
    }
}

