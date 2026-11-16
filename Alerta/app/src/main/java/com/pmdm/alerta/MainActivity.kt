package com.pmdm.alerta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.alerta.ui.theme.AlertaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlertaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AlertaConfirmacionEjemplo(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
    fun AlertaConfirmacionEjemplo(modifier:Modifier = Modifier) {
        // Estado para mostrar u ocultar la ventana de diálogo
        var mostrarAlerta by remember { mutableStateOf(false) }
        var colorBoton: Color by remember { mutableStateOf(Color.Black) }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { mostrarAlerta = true },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("Eliminar Cuenta", color = Color.White)
            }
            // Si el estado es true, se dibuja el AlertDialog superpuesto en pantalla
            if (mostrarAlerta) {
                AlertDialog(
                    onDismissRequest = {
                        // Se ejecuta si el usuario pulsa fuera de la ventana
                        colorBoton =  Color.Green
                        mostrarAlerta = false
                    },
                    title = {
                        Text("¿Estás completamente seguro?")
                    },
                    text = {
                        Text("Esta acción eliminará permanentemente todos tus datos del servidor y no se podrá deshacer.")
                    },
                    confirmButton = {
                        TextButton(
                            onClick = {
                                // Lógica de eliminación real
                                colorBoton = Color.Blue
                                mostrarAlerta = false
                            }
                        ) {
                            Text("Sí, eliminar", color = colorBoton)
                        }
                    },
                    dismissButton = {
                        TextButton(
                            onClick = {
                                // Cancelar la acción
                                colorBoton = Color.Yellow
                                mostrarAlerta = false
                            }
                        ) {
                            Text("Cancelar")
                        }
                    }
                )
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun AlertaConfirmacionEjemploPreview() {
    AlertaTheme {
        AlertaConfirmacionEjemplo()
    }
}