package br.com.allnerdbrasil.githubsearchrepositorios.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitGitHub {

    private const val BASE_URL = "https://api.github.com/"

    val api: GitHubService by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GitHubService::class.java)

    }



}