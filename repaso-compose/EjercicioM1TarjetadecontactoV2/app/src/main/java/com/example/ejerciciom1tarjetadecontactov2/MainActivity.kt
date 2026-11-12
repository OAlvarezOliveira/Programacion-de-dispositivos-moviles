package com.example.ejerciciom1tarjetadecontactov2

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejerciciom1tarjetadecontactov2.ui.theme.EjercicioM1TarjetaDeContactoV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioM1TarjetaDeContactoV2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tarjeta(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Tarjeta(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, color = Color.Gray, shape = RoundedCornerShape(12.dp))
                .padding(25.dp)

        ) {

                Row(   modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(shape= CircleShape)
                            .background(Color.Green)
                    )

                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Oscar Alvarez", fontSize = 20.sp, fontWeight = FontWeight.Bold  )
                        Text("Full-Stack Software Developer",fontSize = 14.sp, color = Color.Gray)

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)

                        ) {

                            Box(
                                modifier = Modifier
                                    .size(25.dp)
                                    .background(Color.Green)
                            )
                            Box(
                                modifier = Modifier
                                    .size(25.dp)
                                    .background(Color.Blue)
                            )
                        }

                    }
                }

        }

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth().height(40.dp)
        ) {
            Text("Contactar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    EjercicioM1TarjetaDeContactoV2Theme {
        Tarjeta()
    }
}