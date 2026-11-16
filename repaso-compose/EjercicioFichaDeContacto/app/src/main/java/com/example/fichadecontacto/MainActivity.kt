package com.example.fichadecontacto

import android.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fitOutside
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fichadecontacto.ui.theme.FichaDeContactoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FichaDeContactoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Ficha(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Ficha(modifier: Modifier = Modifier) {

    var nombre by rememberSaveable { mutableStateOf("") }
    var correo by rememberSaveable { mutableStateOf("") }
    var recordar by remember { mutableStateOf(false) }
    var mensaje by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                nombre,
                onValueChange = { nombre = it },
                label = { Text("nombre") }
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                correo,
                onValueChange = { correo = it },
                label = { Text("correo") }
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Recordarme")
            Checkbox(
                checked = recordar,
                onCheckedChange = { recordar = it },
            )
        }
        Button(onClick = {
            if (nombre.isNotEmpty() && correo.isNotEmpty()) {
                val intent = Intent(context, SegundaActivity::class.java)
                intent.putExtra("nombre", nombre)
                context.startActivity(intent)
                mensaje = "Hola, $nombre"
            } else {

                mensaje = "Faltan Datos"
            }

        }) {
            Text("Enviar")

        }
        Text(mensaje)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(onClick = {
                val navegar = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://cifpcarballeira.com/moodle/course/index.php")
                )
                context.startActivity(navegar)
            }) {
                Text("Ir a Moodle")

            }

            Button(onClick = {
                val llamar = Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:+34900123456")
                )
                context.startActivity(llamar)
            }) {
                Text("Llamar")

            }

            Button(onClick = {
                val enviarCorreo = Intent(
                    Intent.ACTION_SENDTO,
                    Uri.parse("mailto:oalvarezoliveira@gmail.com")
                )
                context.startActivity(enviarCorreo)
            }) {
                Text("Enviar Mail")

            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun FichaPreview() {
    FichaDeContactoTheme {
        Ficha()
    }
}