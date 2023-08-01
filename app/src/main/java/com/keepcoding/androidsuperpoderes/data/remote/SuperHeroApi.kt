package com.keepcoding.androidsuperpoderes.data.remote

import com.keepcoding.androidsuperpoderes.data.remote.dto.HeroDto
import com.keepcoding.androidsuperpoderes.data.remote.dto.IdDto
import com.keepcoding.androidsuperpoderes.data.remote.dto.LocationDto
import com.keepcoding.androidsuperpoderes.data.remote.dto.SearchDto
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import com.keepcoding.androidsuperpoderes.BuildConfig

const val TOKEN: String = BuildConfig.TOKEN
/*
const val TOKEN =
    "eyJhbGciOiJIUzI1NiIsImtpZCI6InByaXZhdGUiLCJ0eXAiOiJKV1QifQ.eyJpZGVudGlme" +
            "SI6IjdDNzQ1NjRCLTQ5NUEtNDhCRC04QzIyLTM5OEUwOUREODY0MyIsImV4cGlyYX" +
            "Rpb24iOjY0MDkyMjExMjAwLCJlbWFpbCI6Imp1YW5qZS5jaWxsYTFAZ21haWwuY29t" +
            "In0.epMHxtAkVu_fT5FvQwKrm_fRqzT9UOG2gpiTTipQajw"
*/
interface SuperHeroApi {

    @POST("api/heros/all")
    @Headers("Authorization: Bearer $TOKEN")
    suspend fun getHeroList(@Body searchDto: SearchDto): List<HeroDto>

    // getHeroDetail(id) : HeroExtended

    @POST("/api/heros/locations")
    @Headers("Authorization: Bearer $TOKEN")
    suspend fun getHeroLocationList(@Body idDto: IdDto) : List<LocationDto>

    // @GET
    // @PUT
    // @DELETE
}
