package ru.gb.dz17

import ru.gb.dz17.data.MarsPhotos
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.nasa.gov"
private const val API_KEY = "DEMO_KEY"

class RetrofitApi {
}

private val retrofit = Retrofit
    .Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()
val photo: PhotoApi = retrofit.create(PhotoApi::class.java)

interface PhotoApi {
    @GET("/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=${API_KEY}")
    suspend fun getPhotoFromApi(): MarsPhotos
}