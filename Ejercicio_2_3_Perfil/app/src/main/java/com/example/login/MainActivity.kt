package com.example.login

import android.content.Intent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Login(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Login(modifier: Modifier = Modifier) {
    var mailValue by remember { mutableStateOf("") }
    var passValue by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Icon(
            imageVector = Icons.Default.AccountCircle ,
            contentDescription = "Icono de login",
            modifier = Modifier.size(240.dp)
        )
        Spacer(Modifier.height(16.dp))
        Text("Bienvenido",fontSize = 28.sp , fontWeight = FontWeight.Bold )
        Spacer(Modifier.height(8.dp))
        Text("Inicia sesión para continuar",fontSize = 16.sp )
        Spacer(Modifier.height(8.dp))
        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email Value") },
            value = mailValue,
            onValueChange = { mailValue = it },
            label = { Text("Correo") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )
        Spacer(Modifier.height(16.dp))
        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password Value") },
            value = passValue,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { passValue = it },
            label = { Text("Contraseña") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )
        Spacer(Modifier.height(16.dp))
        Button(    onClick = {

            val intent = Intent(context, PerfilActivity::class.java)
            intent.putExtra("CORREO", mailValue)
            context.startActivity(intent)
        },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp)){Text("Iniciar sesión")}

    }

}


@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginTheme {
        Login()
    }
}