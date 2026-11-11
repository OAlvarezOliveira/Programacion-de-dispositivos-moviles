package com.example.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme

class PerfilActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val correo =intent.getStringExtra("CORREO")?: ""
        setContent {
            LoginTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    pintaPerfil(
                        name = correo,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun pintaPerfil( name: String = "",modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Row(
        modifier = modifier.fillMaxWidth().border(1.dp, Color.Black).padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Box(
            modifier = Modifier.size(100.dp).clip(CircleShape).background(Color.Gray)
        )

        Column {
            Text(name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text("Junior Software Developer",fontSize = 14.sp, color =Color.DarkGray)
            Text("Macrotest",fontSize = 10.sp,color = Color.Gray)
            Row(
                Modifier,
                Arrangement.spacedBy(8.dp)
                ){
                    Box(modifier = Modifier.size(24.dp).background(Color.Blue).clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"))
                        context.startActivity(intent)
                    })
                    Box(modifier = Modifier.size(24.dp).background(Color.Black).clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cifpcarballeira.com/moodle/my/index.php"))
                        context.startActivity(intent)
                    })
            }
        }



    }




}

@Preview(showBackground = true)
@Composable
fun pintaPerfilPreview() {
    LoginTheme {
        pintaPerfil()
    }
}