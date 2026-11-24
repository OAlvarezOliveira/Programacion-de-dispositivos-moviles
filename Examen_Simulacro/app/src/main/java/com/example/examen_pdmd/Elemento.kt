package com.example.examen_pdmd

// PASO 7 · Clase de datos que llena la LazyColumn (crear como Class/File Kotlin).
// Guarda el ID del string (Int) con @StringRes; el texto se resuelve en la pantalla con stringResource().

import androidx.annotation.StringRes

data class Elemento(@StringRes val titulo: Int){}