package com.keepcoding.androidsuperpoderes.presentation

import com.keepcoding.androidsuperpoderes.domain.model.HeroModel

class HeroTestDataBuilder {
    val id = "test-id"
    var name = ""
    var photoUrl = ""
    var numElements: Int = 1

    fun withName(name: String): HeroTestDataBuilder {
        this.name = name
        return this
    }

    fun withPhotoUrl(photoUrl: String): HeroTestDataBuilder {
        this.photoUrl = photoUrl
        return this
    }

    fun withNumElements(numElements: Int): HeroTestDataBuilder {
        this.numElements = numElements

        return this
    }

    fun buildList(): List<HeroModel> {
        val list = mutableListOf<HeroModel>()

        for(i in 0..numElements) {
            list.add(
                HeroModel(
                id,
                name = name,
                photoUrl = photoUrl
            )
            )
        }

        return list.toList()
    }

    fun buildSingle() : HeroModel =
        HeroModel(
            id,
            name = name,
            photoUrl = photoUrl
        )
}
