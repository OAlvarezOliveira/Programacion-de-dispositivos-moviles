package com.example.examen_preparacion_2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavegacionApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            BarraSuperior(onNavigateTo = { ruta -> navController.navigate(ruta) })
        },
        modifier = Modifier.fillMaxSize()
    )

    { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Rutas.PantallaLogin.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(Rutas.PantallaLogin.route) {
                PantallaLogin(onNavigateTo = { ruta -> navController.navigate(ruta) })
            }
            composable(Rutas.PantallaZapatilla.route) {
                PantallaZapatilla(onNavigateTo = { ruta -> navController.navigate(ruta) })
            }
            composable(Rutas.PantallaFormulario.route) {
                PantallaFormulario(onNavigateTo = { ruta -> navController.navigate(ruta) })
            }
            composable(Rutas.PantallaLista.route) {
                PantallaLista(onNavigateTo = { ruta -> navController.navigate(ruta) })
            }
        }   // cierra NavHost
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(onNavigateTo: (String) -> Unit) {
    var menu by rememberSaveable { mutableStateOf(false) }
    TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },
        navigationIcon = {
            Box {
                IconButton(onClick = { menu = true }) {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = stringResource(R.string.menu_titulo)
                    )
                }                                   // cierra IconButton
                DropdownMenu(
                    expanded = menu,
                    onDismissRequest = { menu = false }
                ) {
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_Usuario)) },
                        onClick = {
                            menu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_Preferencias)) },
                        onClick = {
                            menu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_Salir)) },
                        onClick = {
                            menu = false
                        }
                    )
                }
            }
        }
    )
}
