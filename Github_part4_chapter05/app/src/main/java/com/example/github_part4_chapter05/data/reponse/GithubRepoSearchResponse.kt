package com.example.github_part4_chapter05.data.reponse

import com.example.github_part4_chapter05.data.entity.GithubRepoEntity

data class GithubRepoSearchResponse (
    val totalCount: Int,
    val items: List<GithubRepoEntity>
        )