package com.pmdm.banderaktheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.banderaktheme.ui.theme.BanderaKThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderaKThemeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Bandera(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Bandera(modifier: Modifier = Modifier) {
    Column( modifier=modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red))
        Spacer(modifier = Modifier.fillMaxWidth().weight(2f).background(Color.Yellow))
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaPreview() {
    BanderaKThemeTheme {
        Bandera()
    }
}