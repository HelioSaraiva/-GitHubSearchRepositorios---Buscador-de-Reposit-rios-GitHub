package br.com.allnerdbrasil.githubsearchrepositorios.controller

import android.content.Context
import br.com.allnerdbrasil.githubsearchrepositorios.data.remote.RetrofitGitHub
import br.com.allnerdbrasil.githubsearchrepositorios.model.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GitHubControlerApi(context: Context) {

    /*uspend fun buscarRepositorio(usuario: String): List<GitData>{
        return withContext(Dispatchers.IO){
            RetrofitGitHub.api.buscarRepo(usuario)
        }

    }*/

    suspend fun buscarRepositorio(usuario: String): List<Repository> {
        return withContext(Dispatchers.IO) {
            try {
                RetrofitGitHub.api.buscarRepo(usuario)
            } catch (e: Exception) {
                emptyList()
            }
        }
    }


}