package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import com.keepcoding.androidsuperpoderes.domain.usecase.GetHeroListUseCase
import com.keepcoding.androidsuperpoderes.testutil.DefaultDispatcherRule
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class HeroListViewModelTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    @get:Rule
    val defaultDispatcherRule = DefaultDispatcherRule()

    @MockK(relaxed = true)
    private lateinit var getHeroListUseCase: GetHeroListUseCase

    @Before
    fun setup() {
        MockKAnnotations.init(this)
    }

    @Test
    fun testCoroutinesTestWithMock() = runTest {
        coEvery { getHeroListUseCase.invoke() } returns HeroTestDataBuilder()
            .withNumElements(15)
            .buildList()

        // Creo un viewModel
        // solicitio los datos

        // escuchar al livedata
        liveData.getOrAwaitValue()

        // Assert
    }

}
