    package com.example.alineacionestarjeta

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.activity.enableEdgeToEdge
    import androidx.compose.foundation.background
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
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
    import com.example.alineacionestarjeta.ui.theme.AlineacionesTarjetaTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                AlineacionesTarjetaTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        PintaTarjeta(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun PintaTarjeta(modifier: Modifier = Modifier){

        Box(modifier.fillMaxSize(),contentAlignment = Alignment.Center){

            Box(Modifier.size(400.dp) .border(5.dp, Color.Gray).padding(25.dp)){

                Row(Modifier.align(Alignment.TopEnd)) {

                    Box(Modifier.size(50.dp) .padding(2.dp).background(Color.DarkGray)){}

                    Box(Modifier.size(50.dp) .padding(2.dp).background(Color.Green)){}

                }

                Row(Modifier
                    .align(Alignment.Center)
                    .padding(20.dp)
                    ,verticalAlignment = Alignment.CenterVertically) {

                    Box(Modifier.size(120.dp).clip(CircleShape).background(Color.Cyan)) {}

                    Spacer(Modifier.width(16.dp))

                    Column {
                        Text("Oscar Alvarez Oliviera")
                        Text("Java Developer")
                    }

                }

                Box(
                    Modifier.align(Alignment.BottomCenter).height(35.dp).width(120.dp).clip(RoundedCornerShape(25)).background(Color.Cyan)
                ) {
                    Text("Status chip", Modifier.align(Alignment.Center))
                }

            }

        }

    }

    @Preview(showBackground = true)
    @Composable
    fun PintaTarjetaPreview() {
        AlineacionesTarjetaTheme {
            PintaTarjeta()
        }
    }