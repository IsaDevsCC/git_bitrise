package com.keepcoding.androidsuperpoderes.domain.model

import com.keepcoding.androidsuperpoderes.HeroTestDataBuilder
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.*
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Test

class HeroModelTest {

    //
    var heroModel = HeroModel(
        "56",
        "Alex",
        "foto",
        "descripcion"
    )

    @Test
    fun `WHEN create model EXPECT not null value`() {
        assertThat(heroModel, instanceOf(HeroModel::class.java))
        assertThat(heroModel, notNullValue())
    }

    @Test
    fun `WHEN heroModel id is 56 EXPECT id = 56`() {
        val hero = HeroTestDataBuilder()
            .buildSingle()
        assertThat(hero.id, `is`("test-id"))
    }

    @Test
    fun `WHEN heroModel name is Alex EXPECT name = Alex`() {
        val hero = HeroTestDataBuilder()
            .withName("Alex")
            .buildSingle()
        assertThat(hero.name, `is`("Alex"))
    }

}