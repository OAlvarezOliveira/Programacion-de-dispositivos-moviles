    package com.pmdm.mondrain

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.activity.enableEdgeToEdge
    import androidx.compose.foundation.background
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.size
    import androidx.compose.foundation.layout.width
    import androidx.compose.foundation.shape.CircleShape
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material3.Scaffold
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.draw.clip
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import com.pmdm.ejercicio_1_4_1_tarjeta.ui.theme.Ejercicio_1_4_1_TarjetaTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                Ejercicio_1_4_1_TarjetaTheme() {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        pintaTarjeta(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }


    @Composable
    fun pintaTarjeta(modifier: Modifier = Modifier) {

        Box(modifier = Modifier
               .fillMaxSize(),
                contentAlignment = Alignment.Center
        ){

            Box(
                modifier = Modifier
                    .size(400.dp)
                    .border(5.dp,Color.Gray)
                    .padding(10.dp))
            {

                Row(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(25))
                            .background(Color.LightGray)
                    )
                    Box(
                       modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(25))
                            .background(Color.Green)

                    )
                } //Fin primera Row

                //Inicio segunda Row
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterStart),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .background(Color.Cyan)
                    ){}
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text("Oscar Alvarez Oliveira")
                        Text("Java Developer")
                    }
                } //Fin segunda Row
                //Inicio tercera Fila Row
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(35))
                        .background(Color.Cyan))
                {Text("Status chip",Modifier.align(Alignment.Center)
                    .padding(4.dp))}

            } //Fin caja Principal

    //Fin funcion
    }
    }
        @Preview(showBackground = true)
        @Composable
        fun pintaTarjetaPreview() {
            Ejercicio_1_4_1_TarjetaTheme {
                pintaTarjeta()
            }
        }
