package com.pmdm.coleccionproyectos

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PintaPerfil(onBack: () -> Unit, name: String = "Oscar Alvarez", modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Perfil") }, navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { innerPadding ->
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .border(1.dp, Color.Black)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
            )

            Column {
                Text(name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text("Junior Software Developer", fontSize = 14.sp, color = Color.DarkGray)
                Text("Macrotest", fontSize = 10.sp, color = Color.Gray)
                Row(
                    Modifier,
                    Arrangement.spacedBy(8.dp)
                ) {
                    Box(modifier = Modifier
                        .size(24.dp)
                        .background(Color.Blue)
                        .clickable {
                            val intent =
                                Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("https://developer.android.com")
                                )
                            context.startActivity(intent)
                        })
                    Box(modifier = Modifier
                        .size(24.dp)
                        .background(Color.Black)
                        .clickable {
                            val intent = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://cifpcarballeira.com/moodle/my/index.php")
                            )
                            context.startActivity(intent)
                        })
                }
            }

        }
    }
}
