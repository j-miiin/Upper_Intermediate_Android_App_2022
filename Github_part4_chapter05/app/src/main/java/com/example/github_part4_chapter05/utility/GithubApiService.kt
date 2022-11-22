package com.example.github_part4_chapter05.utility

import com.example.github_part4_chapter05.data.entity.GithubRepoEntity
import com.example.github_part4_chapter05.data.reponse.GithubRepoSearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubApiService {

    @GET("search/repositories")
    suspend fun searchRepositories(@Query("q") query: String): Response<GithubRepoSearchResponse>

    @GET("repos/{owner}/{name}")
    suspend fun getRepository(
        @Path("owner") ownerLogin: String,
        @Path("name") repoName: String
    ): GithubRepoEntity
}