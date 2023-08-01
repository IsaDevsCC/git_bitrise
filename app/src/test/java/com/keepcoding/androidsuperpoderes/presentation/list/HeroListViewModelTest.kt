package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.keepcoding.androidsuperpoderes.testutil.DefaultDispatcherRule
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test


class HeroListViewModelTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    @get:Rule
    val defaultDispatcherRule = DefaultDispatcherRule()

    @Test
    fun testCoroutinesTest() = runTest {
        val test = true

        assertTrue(test)
    }

}
