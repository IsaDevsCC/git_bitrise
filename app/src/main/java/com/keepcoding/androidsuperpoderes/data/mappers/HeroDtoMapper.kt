package com.keepcoding.androidsuperpoderes.data.mappers

import com.keepcoding.androidsuperpoderes.data.local.model.HeroLocal
import com.keepcoding.androidsuperpoderes.data.remote.dto.HeroDto
import com.keepcoding.androidsuperpoderes.domain.model.HeroModel

fun HeroDto.toHeroModel() = HeroModel(
    id = id ?: "",
    photoUrl = photo ?: "",
    name = name ?: ""
)

fun HeroDto.toHeroLocal() = HeroLocal(
    id = id ?: "",
    name = name ?: "",
    photoUrl = photo ?: "",
    favorite = favorite ?: false
)

fun HeroLocal.toHeroModel() = HeroModel(
    id = id,
    photoUrl = photoUrl,
    name = name
)

fun HeroDto.toHeroModelConstructorWithoutName() = HeroModel(
    id = id ?: "",
    name = name ?: "",
    photoUrl = photo ?: ""
)
/*

Demo de acceso a datos desde una función de extensión
fun HeroDto.test() {
    this.name = "test"
}
*/