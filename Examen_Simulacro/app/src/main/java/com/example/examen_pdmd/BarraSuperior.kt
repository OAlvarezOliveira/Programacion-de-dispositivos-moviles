package com.example.examen_pdmd

// PASO 8 · Barra con menú hamburguesa; crear al final, cuando las 4 pantallas ya navegan.
// QUÉ: TopAppBar + navigationIcon con IconButton(Menu) + DropdownMenu con un DropdownMenuItem por pantalla.
// Después hay que usarla en NavegacionApp.kt: topBar = { BarraSuperior(...) }. Necesita @OptIn(ExperimentalMaterial3Api::class).

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(onNavigateTo: (String) -> Unit) {
    var menu by rememberSaveable { mutableStateOf(false) }
    TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },

        navigationIcon = {
            Box {
                IconButton(onClick = { menu = true }) {
                    Icon(Icons.Default.Menu, contentDescription = stringResource(R.string.menu_descripcion))
                }
                DropdownMenu(expanded = menu, onDismissRequest = { menu = false }) {
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_login)) },
                        onClick = { menu = false; onNavigateTo(Rutas.PantallaLogin.route) }
                    )
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_zapatilla)) },
                        onClick = { menu = false; onNavigateTo(Rutas.PantallaZapatilla.route) }
                    )
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_formulario)) },
                        onClick = { menu = false; onNavigateTo(Rutas.PantallaFormulario.route) }
                    )
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.menu_lista)) },
                        onClick = { menu = false; onNavigateTo(Rutas.PantallaLista.route) }
                    )
                }
            }
        }

   )
}