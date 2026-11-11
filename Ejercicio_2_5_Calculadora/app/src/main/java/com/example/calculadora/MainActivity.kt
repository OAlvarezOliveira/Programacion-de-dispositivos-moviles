package com.example.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculadora.ui.theme.CalculadoraTheme

// Actividad principal: es el punto de entrada de la app.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // setContent: aquí empieza la interfaz hecha con Compose (sin XML).
        setContent {
            CalculadoraTheme {
                // Scaffold da el esqueleto de la pantalla y calcula innerPadding (barras del sistema); se lo pasamos a Calculadora.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculadora(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Función composable: dibuja toda la calculadora. 'modifier' llega con el padding del Scaffold.
@Composable
fun Calculadora(modifier: Modifier = Modifier) {

    // Columna raíz: ocupa toda la pantalla con fondo gris oscuro. Dentro, la pantalla (arriba) y los botones (abajo).
    Column(
        modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {

        // ESTADO: texto que se ve en la pantalla. remember = el valor sobrevive a cada redibujado; mutableStateOf = si cambia, Compose redibuja.
        var pantalla by rememberSaveable { mutableStateOf("") }
        // ESTADO: primer número, se guarda al pulsar un operador.
        var primerOperandor by rememberSaveable { mutableStateOf("") }
        // ESTADO: operador elegido (+, -, X, /). Vacío = ninguno todavía.
        var operando by rememberSaveable { mutableStateOf("") }


        // Caja de la pantalla: weight(1f) frente a weight(3f) de abajo = 1/4 de la altura.
        Box(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.White),
            // BottomEnd: el contenido (el texto) se coloca abajo a la derecha de la caja.
            contentAlignment = Alignment.BottomEnd
        ) {
            // Muestra el valor actual de 'pantalla'. Cuando el estado cambia, este texto se actualiza solo.
            Text(pantalla, fontSize = 48.sp)

        }

        // Caja de los botones: weight(3f) = 3/4 de la altura.
        Box(
            Modifier
                .fillMaxSize()
                .weight(3f)
                .background(Color.Gray)
        ) {
            // Columna que apila las 5 filas de botones.
            Column() {
                //FILA 1
                // Cada fila pesa 1f: se reparten el alto a partes iguales. Dentro, 4 botones con weight(1f) = mismo ancho.
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // DÍGITO: al pulsar, añade su texto al final de 'pantalla' (+= concatena Strings).
                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "7" else pantalla + "7" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("7", fontSize = 48.sp)
                    }

                    // Dígitos 8 y 9: igual que el 7.
                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "8" else pantalla + "8" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("8", fontSize = 48.sp)
                    }

                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "9" else pantalla + "9" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("9", fontSize = 48.sp)
                    }

                    // OPERADOR: 1) guarda el número tecleado, 2) recuerda qué operador es, 3) vacía la pantalla para teclear el segundo número.
                    Button(
                        onClick = {
                            primerOperandor = pantalla
                            operando = "/"
                            pantalla = ""
                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("/", fontSize = 48.sp)
                    }


                }
                //FIN FILA
                //FILA 2
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // Dígitos 4, 5 y 6: igual que el 7.
                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "4" else pantalla + "4" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("4", fontSize = 48.sp)
                    }

                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "5" else pantalla + "5" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("5", fontSize = 48.sp)
                    }

                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "6" else pantalla + "6" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("6", fontSize = 48.sp)
                    }

                    // Operador X: igual que '/'.
                    Button(
                        onClick = {
                            primerOperandor = pantalla
                            operando = "X"
                            pantalla = ""
                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("X", fontSize = 48.sp)
                    }
                }
                //FIN FILA
                //FILA 3
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // Dígitos 1, 2 y 3: igual que el 7.
                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "1" else pantalla + "1" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("1", fontSize = 48.sp)
                    }

                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "2" else pantalla + "2" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("2", fontSize = 48.sp)
                    }

                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "3" else pantalla + "3" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("3", fontSize = 48.sp)
                    }

                    // Operador '-': igual que '/'.
                    Button(
                        onClick = {
                            primerOperandor = pantalla
                            operando = "-"
                            pantalla = ""
                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("-", fontSize = 48.sp)
                    }
                }
                //FIN FILA
                //FILA 4
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // Dígito 0 y punto decimal: igual que los demás dígitos.
                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "0" else pantalla + "0" },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("0", fontSize = 48.sp)
                    }

                    Button(
                        onClick = { pantalla = if (pantalla == "Error") "." else pantalla + "." },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text(".", fontSize = 48.sp)
                    }

                    // Tecla %: todavía sin función (onClick vacío).
                    Button(
                        onClick = {
                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("%", fontSize = 48.sp)
                    }

                    // Operador '+': igual que '/'.
                    Button(
                        onClick = {
                            primerOperandor = pantalla
                            operando = "+"
                            pantalla = ""
                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("+", fontSize = 48.sp)
                    }
                }
                //FIN FILA
                //FILA 4
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // C: reinicia las tres variables de estado, como al abrir la app.
                    Button(
                        onClick = {
                            pantalla = ""
                            operando = ""
                            primerOperandor = ""
                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("C", fontSize = 48.sp)
                    }

                    // IGUAL: calcula el resultado con el operador guardado.
                    Button(
                        onClick = {
                            // primero: el número guardado. '?: 0.0' = si no se puede convertir (por ejemplo texto vacío), usa 0.0 en vez de romper la app.
                            val primero = (primerOperandor.toDoubleOrNull() ?: 0.0)
                            // divisor: el segundo número (lo que hay ahora en 'pantalla'), convertido igual.
                            val divisor = (pantalla.toDoubleOrNull() ?: 0.0)
                            // when = el 'switch' de Kotlin: elige la operación según 'operando'. El resultado es Double?, es decir, puede ser null.
                            var resultado = when (operando) {
                                // Suma: primero + segundo. El orden importa en la resta y la división.
                                "+" -> (primerOperandor.toDoubleOrNull() ?: 0.0) +
                                        (pantalla.toDoubleOrNull() ?: 0.0)

                                // Resta: primero - segundo.
                                "-" -> (primerOperandor.toDoubleOrNull() ?: 0.0) -
                                        (pantalla.toDoubleOrNull() ?: 0.0)

                                // Multiplicación.
                                "X" -> (primerOperandor.toDoubleOrNull() ?: 0.0) *
                                        (pantalla.toDoubleOrNull() ?: 0.0)

                                // División: si el divisor es 0 devuelve null (error); si no, divide.
                                "/" -> if (divisor == 0.0) null else primero / divisor
                                // Cualquier otro caso (por ejemplo, sin operador): 0.0.
                                else -> 0.0
                            }

                            // null significa que hubo un error de cálculo: se muestra 'Error'.
                            if (resultado == null) {
                                pantalla = "Error"
                            } else if (resultado % 1.0 == 0.0) {
                                // Resultado entero: .toLong() quita el '.0' (14.0 se muestra como 14).
                                pantalla = resultado.toLong().toString()
                            } else {
                                // Resultado con decimales: se muestra tal cual (3.5).
                                pantalla = resultado.toString()
                            }

                        },
                        modifier = Modifier.weight(1f),

                        ) {
                        Text("=", fontSize = 48.sp)
                    }
                }
                //FIN FILA
            }

        }

    }
}

// Preview: permite ver la calculadora en Android Studio sin ejecutar la app.
@Preview(showBackground = true)
@Composable
fun CalculadoraPreview() {
    CalculadoraTheme {
        Calculadora()
    }
}