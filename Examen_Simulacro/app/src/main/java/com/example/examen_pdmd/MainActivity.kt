package com.example.examen_pdmd

// PASO 5 · Solo debe llamar a NavegacionApp() dentro del tema. Nada más.


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.examen_pdmd.ui.theme.Examen_PDMDTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen_PDMDTheme {
                NavegacionApp()
            }
        }
    }
}

