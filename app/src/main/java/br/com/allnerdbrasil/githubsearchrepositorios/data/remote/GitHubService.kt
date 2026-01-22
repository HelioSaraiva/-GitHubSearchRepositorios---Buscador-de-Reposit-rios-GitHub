package br.com.allnerdbrasil.githubsearchrepositorios.data.remote

import br.com.allnerdbrasil.githubsearchrepositorios.model.Repository
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    /*@GET("users/{usuario}/repos")
   suspend fun buscarRepo(@Path("usuario") usuario: String): List<GitData>*/
    @GET("users/{usuario}/repos")
    suspend fun buscarRepo(@Path("usuario") usuario: String): List<Repository>  // Array direto!

}