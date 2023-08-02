package com.keepcoding.androidsuperpoderes.presentation.login

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test


class LoginScreenTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun testLoginSuccess() {
        var logged = false
        rule.setContent {
            LoginScreen(onLoginSuccess = {
                 logged = true
            }, onForgotClicked = {})
        }

        // Localizar las vistas de los Inputs y setear credenciales
        rule.onNodeWithTag(LOGIN_TEXT_FIELD_USER)
            .performTextInput("alextfos@keepcoding.io")

        rule.onNodeWithText("Login").performClick()

        assertThat(logged, `is`(true))
    }

    @Test
    fun testLoginFail() {

    }
}
