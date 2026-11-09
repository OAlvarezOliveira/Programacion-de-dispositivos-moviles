package com.pmdm.coleccionproyectos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Ejercicio_Bandera(modifier: Modifier = Modifier) {
    Column( modifier=modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red))
        Spacer(modifier = Modifier.fillMaxWidth().weight(2f).background(Color.Yellow))
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red))
    }
}

