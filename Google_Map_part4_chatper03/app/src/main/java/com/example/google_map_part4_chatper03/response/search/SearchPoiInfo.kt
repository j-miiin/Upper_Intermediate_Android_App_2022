package com.example.google_map_part4_chatper03.response.search

data class SearchPoiInfo(
    val totalCount: String,
    val count: String,
    val page: String,
    val Pois: Pois
)
