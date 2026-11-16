package com.pmdm.listaproyectos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.*
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pmdm.listaproyectos.ui.theme.ListaProyectosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaProyectosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListaProyectos(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ListaProyectos(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(
                text = "Lista de Proyectos PDMD",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Blue),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 1: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Yellow),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 2: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Gray),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 3: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Green),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 4: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Red),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 5: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 6: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Cyan),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 7: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.DarkGray),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 8: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Magenta),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 9: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Blue),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 10: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Yellow),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 11: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Red),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Proyecto 12: Calculadora",
                        fontSize = 16.sp
                    )
                }
            }
        }
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.Cyan),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Proyecto 13: Calculadora",
                            fontSize = 16.sp, fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Descripcion del proyecto",
                            fontSize = 12.sp
                        )
                        Text(
                            text = "Clave del proyecto",
                            fontSize = 12.sp
                        )
                    }

                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListaProyectosTheme {
        ListaProyectos()
    }
}