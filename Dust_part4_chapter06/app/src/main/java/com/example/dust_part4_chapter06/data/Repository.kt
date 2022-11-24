package com.example.dust_part4_chapter06.data

import com.example.dust_part4_chapter06.BuildConfig
import com.example.dust_part4_chapter06.data.services.KakaoLocalApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Repository {

    suspend fun getNearbyMonitoringStation(latitude: Double, longitude: Double) {
        val tmCoordinates = kakaoLocalApiService
            .getTmCoordinates(longitude, latitude)
            .body()
            ?.documents
            ?.firstOrNull()

        val tmX = tmCoordinates?.x
        val tmY = tmCoordinates?.y
    }

    private val kakaoLocalApiService: KakaoLocalApiService by lazy {
        Retrofit.Builder()
            .baseUrl(Url.KAKAO_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(buildHttpClient())
            .build()
            .create()
    }

    private fun buildHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    // level에 따라 보이는 정보가 결정
                    level = if (BuildConfig.DEBUG) {
                        // debug(개발)할 때만 body까지 오픈
                        HttpLoggingInterceptor.Level.BODY
                    } else {
                        // 아무것도 보여주지 않음
                        HttpLoggingInterceptor.Level.NONE
                    }
                }
            )
            .build()
}