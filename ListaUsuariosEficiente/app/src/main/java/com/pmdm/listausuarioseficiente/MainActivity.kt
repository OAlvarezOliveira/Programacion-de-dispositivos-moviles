package com.pmdm.listausuarioseficiente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pmdm.listausuarioseficiente.ui.theme.ListaUsuariosEficienteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaUsuariosEficienteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListaUsuariosEficiente(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ListaUsuariosEficiente(modifier: Modifier = Modifier) {
    // Una lista simulada de datos (en el futuro vendrá de una base de datos o API)
    val listaNombres = listOf(
        "Ana Gómez", "Carlos Pérez", "Elena Rodríguez", "David Blanco",
        "Laura Vidal", "Marcos Souto", "Sofía Iglesias", "Antón Rebollo",
        "Daniel Rebollo", "Bea Fernández", "Iago Martínez", "Uxía Castro"
    )
    // Contenedor LazyColumn: la lista eficiente
    LazyColumn(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp) // Espacio automáticoentre filas
    ) {

        // 1. Encabezado fijo opcional de la lista
        item {
            Text(
                text = "Directorio de Alumnos DAM",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        // 2. Bucle inteligente de elementos (equivalente al items del RecyclerView)
        items(listaNombres) { alumno ->
            // Diseño visual de cada tarjeta de elemento individual
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Círculo simulando un avatar
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF3F51B5)),
                        contentAlignment = Alignment.Center
                    ) {
                        // Mostramos la primera letra del nombre
                        Text(
                            text = alumno.take(1),
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = alumno,
                        fontSize = 16.sp
                    )
                }
            }
        }

        // 3. Pie de lista opcional
        item {
            Text(
                text = "Fin del listado (${listaNombres.size} elementos cargados)",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 16.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaUsuariosEficientePreview() {
    ListaUsuariosEficienteTheme {
        ListaUsuariosEficiente()
    }
}