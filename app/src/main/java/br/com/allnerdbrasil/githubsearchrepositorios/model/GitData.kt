package br.com.allnerdbrasil.githubsearchrepositorios.model

import com.google.gson.annotations.SerializedName

/**
 * Array direto da API: List<Repository>
 * JSON: [{"name":"repo1", "html_url":"...", ...}]
 */
data class Repository(
    @SerializedName("name") val name: String?,
    @SerializedName("full_name") val fullName: String?,
    @SerializedName("html_url") val htmlUrl: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("language") val language: String?,
    @SerializedName("stargazers_count") val stars: Int,
    @SerializedName("forks_count") val forks: Int,
    @SerializedName("created_at") val createdAt: String?,
    @SerializedName("updated_at") val updatedAt: String?,
    @SerializedName("owner") val owner: Owner?,
    @SerializedName("license") val license: License?,
    val `private`: Boolean = false,  // Backticks para nome reservado
    // Campos extras se precisar
    @SerializedName("clone_url") val cloneUrl: String? = null
)

/**
 * Owner do repo (usuário/org)
 */
data class Owner(
    val login: String?,
    @SerializedName("avatar_url") val avatarUrl: String?,
    @SerializedName("html_url") val htmlUrl: String?
)

/**
 * Licença do repo (ex: mit, bsd-3-clause)
 */
data class License(
    val key: String?,
    val name: String?,
    @SerializedName("spdx_id") val spdxId: String?,
    val url: String?
)
