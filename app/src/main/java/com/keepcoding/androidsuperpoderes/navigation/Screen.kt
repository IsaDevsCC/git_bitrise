package com.keepcoding.androidsuperpoderes.navigation

import androidx.navigation.NamedNavArgument

sealed class Screen(
    val route: String,
    val arguments: List<NamedNavArgument>
) {
    object LoginScreen : Screen(
        route = "login",
        arguments = emptyList()
    )

    object ForgotPasswordScreen : Screen(
        route = "forgotPassword",
        arguments = emptyList()
    )

    object HeroListScreen : Screen(
        route = "heroList",
        arguments = emptyList()
    )
    /*
    class OtherClass : Screen(
        "", emptyList()
    )
    */
}

//val test = Screen.OtherClass()