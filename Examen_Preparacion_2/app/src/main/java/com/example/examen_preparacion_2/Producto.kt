package com.example.examen_preparacion_2

import androidx.annotation.StringRes

data class Producto(@StringRes val nombre: Int, val precio: Double)

val productos = listOf(
    Producto(R.string.producto_1, 89.99),
    Producto(R.string.producto_2, 109.95),
    Producto(R.string.producto_3, 120.0)
)
