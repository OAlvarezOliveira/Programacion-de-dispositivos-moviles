package com.example.confirmacioncompra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.confirmacioncompra.ui.theme.ConfirmacionCompraTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConfirmacionCompraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    confirmacionCompra(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun confirmacionCompra(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize().verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(Icons.Default.CheckCircle, contentDescription = null, modifier = Modifier.size(96.dp))
        Text("¡Pedido Confirmado!", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("¡Felicidades en breve recibiras tu compra!",fontSize = 18.sp,textAlign = TextAlign.Center)
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).border(1.dp,Color.Gray).padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text("Resumen del Pedido", fontSize = 22.sp,fontWeight = FontWeight.Bold)

            Row(Modifier.fillMaxWidth(),
                Arrangement.SpaceBetween){
                Text("Zapatillas", fontSize = 22.sp,)
                Text("Precio:25€", fontSize = 22.sp)
            }

            Row(Modifier.fillMaxWidth(),
                Arrangement.SpaceBetween){
                Text("Camisa", fontSize = 22.sp)
                Text("Precio:32€", fontSize = 22.sp)
            }
            Row(Modifier.fillMaxWidth(),
                Arrangement.SpaceBetween){
                Text("Jersey", fontSize = 22.sp)
                Text("Precio:45€", fontSize = 22.sp)
            }
            Row(Modifier.fillMaxWidth(),
                Arrangement.SpaceBetween){
                Text("Pantalon", fontSize = 22.sp)
                Text("Precio:78€", fontSize = 22.sp)
            }

        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth().height(50.dp).padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(8.dp)
        )
        {
            Text("Ver Detalles", fontSize = 16.sp)

        }
        TextButton(
            onClick = {},
        ) {
            Text("Volver al inicio", fontSize = 16.sp, textDecoration = TextDecoration.Underline)
        }

    }


}

@Preview(showBackground = true)
@Composable
fun confirmacionCompraPreview() {
    ConfirmacionCompraTheme {
        confirmacionCompra()
    }
}