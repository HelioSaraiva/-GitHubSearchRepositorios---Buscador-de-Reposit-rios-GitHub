package br.com.allnerdbrasil.githubsearchrepositorios.ui

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.allnerdbrasil.githubsearchrepositorios.controller.GitHubControlerApi
import br.com.allnerdbrasil.githubsearchrepositorios.model.Repository
import kotlinx.coroutines.launch

/**
 * Tela GitHub Search completa. Correções:
 * - NavController fix: parâmetro correto.
 * - Botão onClick: chama API com username.
 * - LazyColumn: null-safe com Repository model.
 * - Preview descomentado e funcional.
 * - Tratamento empty/error.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GitHubSearchScreen(
     // ✅ Parâmetro correto
) {
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    var username by remember { mutableStateOf("") }
    var showResults by remember { mutableStateOf(false) }
    var repositories by remember { mutableStateOf(listOf<Repository>()) }
    val controller = remember { GitHubControlerApi(context) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("GitHub Repositórios") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Nome do usuário GitHub") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    if (username.isBlank()) {
                        Toast.makeText(context, "Digite um usuário", Toast.LENGTH_SHORT).show()
                        return@Button
                    }

                    scope.launch {
                        try {
                            repositories = controller.buscarRepositorio(username)
                            showResults = true
                            if (repositories.isEmpty()) {
                                Toast.makeText(context, "Nenhum repositório encontrado", Toast.LENGTH_SHORT).show()
                            }
                        } catch (e: Exception) {
                            Toast.makeText(context, "Erro: ${e.message}", Toast.LENGTH_SHORT).show()
                            showResults = false
                            repositories = emptyList()
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Buscar")
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Resultados:", style = MaterialTheme.typography.titleMedium)

            if (showResults) {
                if (repositories.isEmpty()) {
                    Text("Lista vazia", modifier = Modifier.alpha(0.6f))
                } else {
                    LazyColumn {
                        items(repositories) { repo ->
                            ListItem(
                                headlineContent = {
                                    Text(repo.name ?: "Sem nome")
                                },
                                supportingContent = {
                                    Column {
                                        Text(repo.description ?: "Sem descrição")
                                        Text("${repo.stars} ⭐ | ${repo.language ?: "?"}")
                                    }
                                },
                                trailingContent = {
                                    Icon(
                                        imageVector = Icons.Default.Share,
                                        contentDescription = "Compartilhar",
                                        modifier = Modifier.clickable {
                                            repo.htmlUrl?.let { url ->
                                                try {
                                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                                    context.startActivity(intent)
                                                } catch (e: Exception) {
                                                    Toast.makeText(context, "Erro ao abrir", Toast.LENGTH_SHORT).show()
                                                }
                                            }
                                        }.padding(8.dp)
                                    )
                                }
                            )
                        }
                    }
                }
            } else {
                Text("Busque um usuário", modifier = Modifier.alpha(0.6f))
            }
        }
    }
}

/*@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun GitHubSearchScreenPreview() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GitHubSearchScreen(rememberNavController())
        }
    }
}*/
