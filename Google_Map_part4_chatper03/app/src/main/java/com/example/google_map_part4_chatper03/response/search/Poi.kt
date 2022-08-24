package com.example.google_map_part4_chatper03.response.search

data class Poi(
    val id: String? = null,
    val name: String? = null,
    val telNo: String? = null,
    val frontLat: Float = 0.0f,
    val frontLng: Float = 0.0f,
    val noorLat: Float = 0.0f,
    val noorLng: Float = 0.0f,
    val upperAddrName: String? = null,
    val middleAddrName: String? = null,
    val lowerAddrName: String? = null,
    val detailBizName: String? = null,
    val rpFlag: String? = null,
    val partkFlag: String? = null,
    val deetailInfoFlag: String? = null,
    val desc: String? = null
)
