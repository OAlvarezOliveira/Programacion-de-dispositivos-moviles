package com.pmdm.mondrain

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.pmdm.mondrain.ui.theme.MondrainTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MondrainTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        pintaMondrain(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }


@Composable
fun pintaMondrain(modifier: Modifier = Modifier) {


        Column( modifier=modifier.fillMaxSize().background(Color.Black)) {

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

@Preview(showBackground = true)
@Composable
fun PintaMondrainPreview() {
    MondrainTheme {
        pintaMondrain()
    }
}