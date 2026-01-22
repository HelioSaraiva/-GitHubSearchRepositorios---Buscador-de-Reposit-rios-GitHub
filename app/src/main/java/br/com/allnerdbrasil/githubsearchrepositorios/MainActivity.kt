package br.com.allnerdbrasil.githubsearchrepositorios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavController
import br.com.allnerdbrasil.githubsearchrepositorios.ui.GitHubSearchScreen
import br.com.allnerdbrasil.githubsearchrepositorios.ui.theme.GitHubSearchRepositoriosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubSearchRepositoriosTheme {
                GitHubSearchScreen()
            }
        }
    }
}

