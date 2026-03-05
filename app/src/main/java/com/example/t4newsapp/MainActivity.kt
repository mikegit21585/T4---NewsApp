package com.example.t4newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.t4newsapp.ui.theme.T4NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            T4NewsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaNoticias()
                }
            }
        }
    }
}

@Composable
fun PantallaNoticias() {

    val noticiasCarrusel: List<String> = listOf(
        "El presidente de EE.UU. no muestra signos de arrepentimiento...",
        "Bañarse en la piscina del desierto de Cleopatra",
        "Gigantes tecnológicos"
    )

    val noticiasGrid = listOf(
        "El presidente de EE.UU. no muestra signos de arrepentimiento",
        "Bañarse en la piscina del desierto de Cleopatra",
        "Gigantes tecnológicos",
        "El rover de Marte envía"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // Buscador
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Buscar") },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Buscar")
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Tabs
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text("Noticias", fontWeight = FontWeight.Bold)
            Text("Eventos", color = Color.Gray)
            Text("Clima", color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Título
        Text(
            text = "Últimas noticias",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Carrusel
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(noticiasCarrusel) { noticia ->

                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .height(140.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(
                            Brush.linearGradient(
                                listOf(
                                    Color(0xFF6A5AE0),
                                    Color(0xFF5F3DC4)
                                )
                            )
                        )
                        .padding(16.dp)
                ) {

                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = noticia,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "febrero 08 - 2024",
                            color = Color.White
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Segundo título
        Text(
            text = "Alrededor del mundo",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Grid de noticias
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxHeight()
        ) {

            items(noticiasGrid) { noticia ->

                Box(
                    modifier = Modifier
                        .height(180.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color.LightGray)
                ) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .background(
                                Color.White.copy(alpha = 0.8f),
                                RoundedCornerShape(
                                    topStart = 20.dp,
                                    topEnd = 20.dp
                                )
                            )
                            .padding(10.dp)
                    ) {
                        Text(
                            text = noticia,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    T4NewsAppTheme {
        PantallaNoticias()
    }
}