package com.example.melon_part4_chapter02.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("")
    fun listMusics(): Call<MusicDto>
}