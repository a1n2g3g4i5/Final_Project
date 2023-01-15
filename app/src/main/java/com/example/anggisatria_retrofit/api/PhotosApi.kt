package com.example.anggisatria_retrofit.api

import com.example.anggisatria_retrofit.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("data")
    fun getPhotos(): Single<List<Photo>>
}

