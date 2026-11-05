package com.pmdm.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.sp
import com.pmdm.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculadora(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Calculadora(modifier: Modifier = Modifier) {

    var resultado by remember { mutableStateOf("0") }

    val añadirAlResultado: (String) -> Unit = { texto ->
        if (resultado == "0") {
            resultado = texto
        } else {
            resultado += texto
        }
    }
    Column(
        modifier = modifier
            .size(425.dp)
            .background(Color.Yellow)
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        // Fila 1: Pantalla resultados
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(Color.White, shape = RoundedCornerShape(4.dp))
                    .border(1.dp, Color.Gray, shape = RoundedCornerShape(4.dp))
                    .padding(8.dp),
                contentAlignment = Alignment.CenterEnd
            ) {
                Text(text = resultado, fontSize = 24.sp, color = Color.Black)
            }
        }

        // Fila 2: Botones numéricos (7, 8, 9, %)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    añadirAlResultado("7")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "7", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("8")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "8", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("9")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "9", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("%")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "%", color = Color.Black)
            }
        }

        // Fila 3: Siguientes números (4, 5, 6, *)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    añadirAlResultado("4")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "4", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("5")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "5", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("6")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "6", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("*")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "*", color = Color.Black)
            }
        }

        // Fila 4: Siguientes números (1, 2, 3, -)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    añadirAlResultado("1")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "1", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("2")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "2", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("3")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "3", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("-")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "-", color = Color.Black)
            }
        }

        // Fila 5: Botones inferiores (0, ., =, +)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    añadirAlResultado("0")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "0", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado(".")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = ".", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("=")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "=", color = Color.Black)
            }

            Button(
                onClick = {
                    añadirAlResultado("+")
                },
                modifier = Modifier
                    .size(60.dp)
                    .border(width = 1.dp, color = Color.Black)
            ) {
                Text(fontSize = 20.sp, text = "+", color = Color.Black)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculadoraPreview() {
    CalculadoraTheme {
        Calculadora()
    }
}
