package com.example.youtube_part4_chapter01.service

import com.example.youtube_part4_chapter01.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("")
    fun listVideos(): Call<VideoDto>
}