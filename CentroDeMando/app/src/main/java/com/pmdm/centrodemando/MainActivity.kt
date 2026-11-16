package com.pmdm.centrodemando

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pmdm.centrodemando.ui.theme.CentroDeMandoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CentroDeMandoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CentroDeMando(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CentroDeMando(modifier: Modifier = Modifier) {

    var menuExpandido by remember { mutableStateOf(false) }
    var mostrarAlerta by remember { mutableStateOf(false) }
    var mostrarAlerta2 by remember { mutableStateOf(false) }
    var mostrarAlerta3 by remember { mutableStateOf(false) }
    var mostrarAlerta4 by remember { mutableStateOf(false) }


    if (mostrarAlerta) {
        AlertDialog(
            onDismissRequest = {
                mostrarAlerta = false
            },
            title = {
                Text("Primera Alerta")
            },
            text = {
                Text("Elige una opcion")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta = false
                    }
                ) {
                    Text("Sí")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta = false
                    }
                ) {
                    Text("No")
                }
            }
        )
    }

    if (mostrarAlerta2) {
        AlertDialog(
            onDismissRequest = {
                mostrarAlerta2 = false
            },
            title = {
                Text("Segunda Alerta")
            },
            text = {
                Text("Elige una opcion")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta2 = false
                    }
                ) {
                    Text("Sí")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta2 = false
                    }
                ) {
                    Text("No")
                }
            }
        )
    }


    if (mostrarAlerta3) {
        AlertDialog(
            onDismissRequest = {
                mostrarAlerta = false
            },
            title = {
                Text("Tercera  Alerta")
            },
            text = {
                Text("Elige una opcion")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta3 = false
                    }
                ) {
                    Text("Sí")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta3 = false
                    }
                ) {
                    Text("No")
                }
            }
        )
    }

    if (mostrarAlerta4) {
        AlertDialog(
            onDismissRequest = {
                mostrarAlerta = false
            },
            title = {
                Text("Cuarta  Alerta")
            },
            text = {
                Text("Elige una opcion")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta3 = false
                    }
                ) {
                    Text("Sí")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        mostrarAlerta3 = false
                    }
                ) {
                    Text("No")
                }
            }
        )
    }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Box(
            modifier = Modifier.fillMaxWidth().border(4.dp, Color.Gray, RoundedCornerShape(10.dp)).background(Color.Gray).padding(horizontal = 10.dp),


        ) {
            Text("Centro de Mando", fontSize = 35.sp, modifier = Modifier.align(Alignment.TopStart))

            IconButton(
                onClick = { menuExpandido = true },
                Modifier.align(Alignment.TopEnd)
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert, // Icono de tres puntos verticales
                    contentDescription = "Menú de opciones"
                )
            }
            DropdownMenu(
                expanded = menuExpandido,
                onDismissRequest = { menuExpandido = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Acerca de") },
                    onClick = {
                        menuExpandido = false
                        mostrarAlerta = true
                    }
                )
                DropdownMenuItem(
                    text = { Text("Configuración") },
                    onClick = {
                        menuExpandido = false
                        mostrarAlerta2 = true
                    }
                )
                DropdownMenuItem(
                    text = { Text("Ayuda") },
                    onClick = {
                        menuExpandido = false
                        mostrarAlerta3 = true
                    }
                )
            }
        }

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
            ) {
        Button(
            onClick = { mostrarAlerta4 = true },
            modifier = Modifier ,
        ) {

            Icon(
                imageVector = Icons.Default.Warning,
                contentDescription = "alerta"
            )

            Text("Mostrar la 4º alerta")
        }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun CentroDeMandoPreview() {
    CentroDeMandoTheme {
        CentroDeMando()
    }
}