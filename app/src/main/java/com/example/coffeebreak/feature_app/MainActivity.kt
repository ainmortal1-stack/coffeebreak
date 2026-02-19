package com.example.coffeebreak.feature_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.coffeebreak.feature_app.data.repo.AuthRepositoryImpl
import com.example.coffeebreak.feature_app.presintation.authorization.AuthorizationScreen
import com.example.coffeebreak.feature_app.presintation.authorization.AuthorizationViewModel
import com.example.coffeebreak.feature_app.presintation.common.EmptyScreen
import com.example.coffeebreak.feature_app.presintation.designer.DesignerScreen
import com.example.coffeebreak.feature_app.presintation.forgotpass.ForgotPasswordScreen
import com.example.coffeebreak.feature_app.presintation.forgotpass.ForgotPasswordViewModel
import com.example.coffeebreak.feature_app.presintation.menu.MenuScreen
import com.example.coffeebreak.feature_app.presintation.myorder.MyOrderHidtory
import com.example.coffeebreak.feature_app.presintation.myorder.MyOrderScreen
import com.example.coffeebreak.feature_app.presintation.myorder.OrderConfirm
import com.example.coffeebreak.feature_app.presintation.orderoptions.OrderOptionsScreen
import com.example.coffeebreak.feature_app.presintation.profile.ProfileQRCodeScreen
import com.example.coffeebreak.feature_app.presintation.profile.ProfileScreen
import com.example.coffeebreak.feature_app.presintation.reward.RewardScreen
import com.example.coffeebreak.feature_app.presintation.startup.StartUpScreen
import com.example.coffeebreak.feature_app.presintation.ui.theme.CoffeebreakTheme
import com.example.coffeebreak.feature_app.presintation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeebreakTheme {
                val navController = rememberNavController()

                NavHost(
                    navController, startDestination = Routes.Welcome.route
                ) {
                    composable(Routes.Welcome.route) {
                        WelcomeScreen(navController)
                    }
                    composable(Routes.Authorization.route) {
                        AuthorizationScreen(
                            navController,
                            AuthorizationViewModel(AuthRepositoryImpl())
                        )
                    }
                    composable(Routes.ForgotPassword.route) {
                        ForgotPasswordScreen(
                            navController, ForgotPasswordViewModel(
                                AuthRepositoryImpl()
                            )
                        )
                    }
                    composable(Routes.StartUp.route) {
                        StartUpScreen(navController)
                    }
                    composable(Routes.Empty.route) {
                        EmptyScreen(navController)
                    }
                    composable(Routes.Menu.route) {
                        MenuScreen(navController)
                    }
                    composable(Routes.MyOrder.route) {
                        MyOrderScreen(navController)
                    }
                    composable(Routes.Profile.route) {
                        ProfileScreen(navController)
                    }
                    composable(Routes.ProfileQRCode.route) {
                        ProfileQRCodeScreen(navController)
                    }
                    composable(Routes.Reward.route) {
                        RewardScreen(navController)
                    }
                    composable(Routes.OrderHistory.route) {
                        MyOrderHidtory(navController)
                    }
                    composable(Routes.OrderOptions.route) {
                        OrderOptionsScreen(navController)
                    }
                    composable(Routes.DesignerScreen.route) {
                        DesignerScreen(navController)
                    }
                    composable(Routes.OrderConf.route) {
                        OrderConfirm(navController)
                    }
                }
            }
        }
    }
}
