package com.pmdm.menu_hamburgesa


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdm.menu_hamburgesa.ui.theme.Menu_HamburgesaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Menu_HamburgesaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MenuDesplegableEjemplo(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MenuDesplegableEjemplo(modifier: Modifier = Modifier) {
    // 1. Estado para controlar si el menú está abierto (true) o cerrado (false)
    var menuExpandido by remember { mutableStateOf(false) }
    // Usamos un Box para anclar el menú flotante en la esquina superior derecha
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.TopEnd
    ) {
        // 2. Un Box pequeñito dedicado EXCLUSIVAMENTE al botón y al menú
        Box(
            modifier = Modifier.align(Alignment.TopEnd) // Aquí alineas el conjunto a la derecha
        ) {
            // 2. Botón que activa la apertura del menú
            IconButton(
                onClick = { menuExpandido = true }
            ) {

                Icon(
                    imageVector = Icons.Default.MoreVert, // Icono de tres puntos verticales
                            contentDescription = "Menú de opciones"
                )
            }
            // 3. El componente del menú flotante
            DropdownMenu(
                expanded = menuExpandido,
                onDismissRequest = { menuExpandido = false } // Se cierra si el usuariopulsa fuera
            ) {
                DropdownMenuItem(
                    text = { Text("Mi Perfil") },
                    onClick = {
                        menuExpandido = false
                        // Acción al pulsar Perfil
                    },
                    leadingIcon = { Icon(Icons.Default.Person, contentDescription = null)
                    }
                )
                DropdownMenuItem(
                    text = { Text("Configuración") },
                    onClick = {
                        menuExpandido = false
                        // Acción al pulsar Configuración
                    },
                    leadingIcon = { Icon(Icons.Default.Settings, contentDescription =
                        null) }
                )
                Divider() // Línea separadora visual
                DropdownMenuItem(
                    text = { Text("Cerrar Sesión", color = Color.Red) },
                    onClick = {
                        menuExpandido = false
                        // Acción de salida
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuDesplegableEjemploPreview() {
    Menu_HamburgesaTheme {
        MenuDesplegableEjemplo()
    }
}