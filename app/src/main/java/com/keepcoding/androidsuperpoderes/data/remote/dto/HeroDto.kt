package com.keepcoding.androidsuperpoderes.data.remote.dto

import com.squareup.moshi.Json

data class HeroDto(
    @Json(name = "id") val id: String?,
    @Json(name = "name") val name: String?,
    @Json(name = "description") val description: String?,
    @Json(name = "photo") val photo: String?,
    @Json(name = "favorite") val favorite: Boolean?
)

/*

// Sin el optional produciría una excepción de mapeo del modelo
{
        "description": "La  Legendary SuperSaiyan ",
        "photo": "http://i.annihil.us/u/prod/marvel/i/mg/b/c0/553a9abceb412/portrait_incredible.jpg",
        "name": "Broly",
        "favorite": false
    }

*/