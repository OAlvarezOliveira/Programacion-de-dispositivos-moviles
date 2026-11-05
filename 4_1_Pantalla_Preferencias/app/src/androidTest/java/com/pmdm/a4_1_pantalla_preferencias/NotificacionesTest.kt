package com.pmdm.a4_1_pantalla_preferencias

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.pmdm.a4_1_pantalla_preferencias.ui.theme._4_1_Pantalla_PreferenciasTheme
import org.junit.Rule
import org.junit.Test

class NotificacionesTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun notificaciones_displaysAllPreferenceOptions() {
        composeTestRule.setContent {
            _4_1_Pantalla_PreferenciasTheme {
                notificaciones()
            }
        }

        composeTestRule.onNodeWithText("Preferencias de Notificación").assertIsDisplayed()
        composeTestRule.onNodeWithText("Notificaciones Push").assertIsDisplayed()
        composeTestRule.onNodeWithText("Avisos por correo electrónico").assertIsDisplayed()
        composeTestRule.onNodeWithText("Modo silencioso durante las 24 horas").assertIsDisplayed()
        composeTestRule.onNodeWithText("Guardar cambios").assertIsDisplayed()
    }

    @Test
    fun notificaciones_clickGuardarCambios_buttonIsClickable() {
        composeTestRule.setContent {
            _4_1_Pantalla_PreferenciasTheme {
                notificaciones()
            }
        }

        composeTestRule.onNodeWithText("Guardar cambios")
            .assertIsDisplayed()
            .performClick()
    }
}
