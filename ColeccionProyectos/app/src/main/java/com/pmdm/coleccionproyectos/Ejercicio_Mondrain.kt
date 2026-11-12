package com.pmdm.coleccionproyectos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ejercicio_Mondrain(onBack: () -> Unit,modifier: Modifier = Modifier) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pantalla de Login") }, navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { innerPadding ->Column( modifier=modifier.fillMaxSize().background(Color.Black).padding(innerPadding)) {

        Row(modifier = Modifier.fillMaxWidth().weight(3f)   ) {
            Spacer(modifier = Modifier.fillMaxHeight().weight(3f).padding(4.dp).background(Color.Red))
            Spacer(modifier = Modifier.fillMaxHeight().weight(1f).padding(4.dp).background(Color.White))

        }

        Row(modifier = Modifier.fillMaxWidth().weight(2f)  ) {

            Column(modifier = Modifier.fillMaxWidth(0.5f).weight(3f) ){
                Spacer(modifier = Modifier.fillMaxSize().padding(8.dp).background(Color.White))
            }
            Column(modifier = Modifier.fillMaxWidth(0.5f).weight(1f) ){
                Spacer(modifier = Modifier.fillMaxWidth().weight(1f).padding(4.dp).background(Color.Yellow))
                Spacer(modifier = Modifier.fillMaxWidth().weight(1f).padding(4.dp).background(Color.Blue))

            }

        }

    }
    }
}

