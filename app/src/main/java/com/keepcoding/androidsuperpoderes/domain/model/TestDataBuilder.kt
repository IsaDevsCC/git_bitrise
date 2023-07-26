package com.keepcoding.androidsuperpoderes.domain.model


class TestDataBuilder {
    val id = "test-id"
    var name = ""
    var photoUrl = ""
    var numElements: Int = 1

    fun withName(name: String): TestDataBuilder {
        this.name = name
        return this
    }

    fun withPhotoUrl(photoUrl: String): TestDataBuilder {
        this.photoUrl = photoUrl
        return this
    }

    fun withNumElements(numElements: Int): TestDataBuilder {
        this.numElements = numElements

        return this
    }

    fun build(): List<HeroModel> {
        val list = mutableListOf<HeroModel>()

        for(i in 0..numElements) {
            list.add(HeroModel(
                id,
                name = name,
                photoUrl = photoUrl
            ))
        }

        return list.toList()
    }
}

val testData = TestDataBuilder().build()


val testData1 = TestDataBuilder()
    .withName("Pepito")
    .withNumElements(15)
    .build()
