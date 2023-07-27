package com.keepcoding.androidsuperpoderes.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.keepcoding.androidsuperpoderes.presentation.forgot.ForgotPasswordScreen
import com.keepcoding.androidsuperpoderes.presentation.login.LoginScreen

fun NavGraphBuilder.addLoginScreen(navController: NavController) {
    composable(Screen.LoginScreen.route) {
        LoginScreen {
            navController.navigate(Screen.ForgotPasswordScreen.route)
        }
    }
}

fun NavGraphBuilder.addForgotPasswordScreen() {
    composable(Screen.ForgotPasswordScreen.route) {
        ForgotPasswordScreen()
    }
}
