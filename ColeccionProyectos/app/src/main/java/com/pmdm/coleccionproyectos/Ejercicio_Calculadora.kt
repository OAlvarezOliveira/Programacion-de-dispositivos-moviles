package com.pmdm.coleccionproyectos

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ejercicio_Calculadora(onBack: () -> Unit, modifier: Modifier = Modifier) {

    var resultado by remember { mutableStateOf("0") }

    val añadirAlResultado: (String) -> Unit = { texto ->
        if (resultado == "0") {
            resultado = texto
        } else {
            resultado += texto
        }
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Audio") }, navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 12.dp)
                .background(Color.Yellow)
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            // Fila 1: Pantalla resultados
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(Color.White, shape = RoundedCornerShape(4.dp))
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(4.dp))
                        .padding(8.dp),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Text(text = resultado, fontSize = 44.sp, color = Color.Black)
                }
            }

            // Fila 2: Botones numéricos (7, 8, 9, %)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp) ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        añadirAlResultado("7")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "7")
                }

                Button(
                    onClick = {
                        añadirAlResultado("8")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )

                {
                    Text(fontSize = 60.sp, text = "8", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("9")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )

                {
                    Text(fontSize = 60.sp, text = "9", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("%")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "%", color = Color.Black)
                }
            }

            // Fila 3: Siguientes números (4, 5, 6, *)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp) ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        añadirAlResultado("4")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "4", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("5")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "5", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("6")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "6", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("*")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "*", color = Color.Black)
                }
            }

            // Fila 4: Siguientes números (1, 2, 3, -)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp) ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        añadirAlResultado("1")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "1", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("2")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                ) {
                    Text(fontSize = 60.sp, text = "2", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("3")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "3", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("-")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "-", color = Color.Black)
                }
            }

            // Fila 5: Botones inferiores (0, ., =, +)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp) ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        añadirAlResultado("0")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "0", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado(".")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = ".", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("=")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "=", color = Color.Black)
                }

                Button(
                    onClick = {
                        añadirAlResultado("+")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.Black
                    ),
                    shape = RectangleShape,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(width = 1.dp, color = Color.Black)
                )
                {
                    Text(fontSize = 60.sp, text = "+", color = Color.Black)
                }
            }
        }
    }

}