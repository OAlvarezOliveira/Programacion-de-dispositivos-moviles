package com.pmdm.coleccionproyectos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment



@Composable
fun Ejercicio_HTML5(modifier: Modifier = Modifier) {
    Box ( modifier=modifier.fillMaxSize()) {
        Column( modifier=modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.LightGray) , contentAlignment = Alignment.Center) {Text(text = "HEADER")}
            Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.LightGray) , contentAlignment = Alignment.Center) {Text(text = "NAV")}

            Row(modifier = Modifier.fillMaxWidth().weight(5f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.Transparent) ,  ) {

                Column(modifier = Modifier.fillMaxWidth(0.5f).weight(4f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.LightGray) ){
                    Box(modifier = Modifier.fillMaxWidth().weight(0.25f).padding(8.dp) , contentAlignment = Alignment.TopCenter) {Text(text = "SECTION")}
                    Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.White) , contentAlignment = Alignment.Center){Text(text = "ARTICLE")}
                    Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.White) , contentAlignment = Alignment.Center){Text(text = "ARTICLE")}
                    Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.White) , contentAlignment = Alignment.Center){Text(text = "ARTICLE")}
                }
                Column(modifier = Modifier.fillMaxWidth(0.5f).weight(4f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.LightGray) ){
                    Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp) , contentAlignment = Alignment.TopCenter) {Text(text = "ASIDE")}
                }

            }

            Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(8.dp).clip(RoundedCornerShape(12.dp)).background(Color.LightGray) , contentAlignment = Alignment.Center  ) {Text(text = "FOOTER")}
        }

    }

}
