package com.keepcoding.androidsuperpoderes.presentation.login

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test


class LoginScreenTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun testClickLoginButton() {
        var logged = false
        rule.setContent {
            LoginScreen(onLoginSuccess = {
                 logged = true
            }, onForgotClicked = {})
        }

        rule.onNodeWithText("Login").performClick()

        assertThat(logged, `is`(true))
    }
}
