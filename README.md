# Programación de Dispositivos Móviles (2º DAM)

Repo de la asignatura de clase (Android Studio). Cada carpeta es un proyecto Android Studio completo e independiente: se abre por separado desde Android Studio.

**NotebookLM (Brain):** "DAM - 2º - Programación multimedia e dispositivos móbiles" — id `6146771d-c7df-48df-b91e-e98903545bc4`.

## Índice

- [Intents y Activities (Java)](#intents-y-activities-java)
- [Primeros pasos con Compose](#primeros-pasos-con-compose)
- [Maquetación: Box, Row y Column](#maquetación-box-row-y-column)
- [Controles de entrada](#controles-de-entrada)
- [Serie 2.x: login, perfil, compra y calculadora](#serie-2x-login-perfil-compra-y-calculadora)
- [Navegación y colección de proyectos](#navegación-y-colección-de-proyectos)
- [Otros](#otros)

## Intents y Activities (Java)

- **Ejercicio1/** — navegación entre activities con Intent + strings de recursos. Incluye `base-personal/` (plan de estudio propio en Kotlin plano, migrado desde `kotlin-learning`, no es la app oficial).
- **Ejercicio2/** — ejercicio de clase del 28/09 (tres activities).
- **Ejercicio3/** — ejercicio de clase del 28/09 (tres activities).

## Primeros pasos con Compose

- **primeroK/** — primeros pasos con Kotlin y Compose (`TarjetaPerfil`).
- **BanderaKTheme/** — bandera de España con Jetpack Compose.
- **Mondrain/** — cuadro de Mondrian con Compose.
- **HTML5/** — ejercicio de etiquetas semánticas HTML5.

## Maquetación: Box, Row y Column

- **AlineacionesTarjeta/** — ejercicio 1.4.1 (Alineaciones): tarjeta maquetada con `Box`, `Row` y `Column`.
- **Ejercicio_1_4_1_Tarjeta/** — otra versión del 1.4.1: tarjeta con imagen, nombre y cargo.
- **Alineaciones_1.4.2/** — ejercicio 1.4.2: pantalla con imagen, párrafos de texto y botones "Entrar" y "Salir".
- **1_4_2_Pantalla/** — otra versión del 1.4.2 (`PintaPantalla`): imagen y párrafos de texto.

## Controles de entrada

- **4_1_Pantalla_Preferencias/** — ejercicio 4.1: pantalla de preferencias con dos `Switch` (notificaciones push y avisos por correo) y un `Checkbox`.
- **AudioCalidad/** — panel de calidad de audio con `RadioButton` y un `Slider`.
- **Encuesta/** — encuesta con `Switch` (recibir ofertas), `Slider` y `RadioButton` para elegir turno.

## Serie 2.x: login, perfil, compra y calculadora

- **Ejercicio_2_2_Login/** — ejercicio 2.2: formulario de login con Compose.
- **Ejercicio_2_3_Perfil/** — ejercicio 2.3: cabecera de perfil (foto circular, textos con distinto tamaño y color, fila de iconos). Incluye el flujo Login → Perfil con Intent explícito (extra `CORREO`); los iconos abren una web con Intent implícito (`ACTION_VIEW`).
- **Ejercicio_2_4_Confirmacion/** — ejercicio 2.4: pantalla de confirmación de compra con scroll vertical, resumen con borde, `Button` relleno y `TextButton`.
- **Ejercicio_2_5_Calculadora/** — ejercicio 2.5: calculadora con `+`, `-`, `X`, `/`, `C` y `=`; el estado sobrevive al giro con `rememberSaveable`. La tecla `%` está sin implementar.
- **Calculadora/** — calculadora (ejercicio 3.8, del 05/11), proyecto distinto de `Ejercicio_2_5_Calculadora/`.

## Navegación y colección de proyectos

- **Navegacion/** — ejercicio de navegación con Navigation Compose: `PantallaInicio` ("Ejercicio de navegación") con botones "Ir al Ejercicio A", "B" y "C", y pantallas `PantallaEjercicioA` y `PantallaEjercicioB`. El botón C tiene ruta (`ejercicio_c`) pero aún no tiene pantalla.
- **ColeccionProyectos/** — app que reúne varios ejercicios en un solo proyecto. Una pantalla de inicio con un botón por ejercicio navega con `NavHost` a: Alineaciones, Audio, Bandera, Calculadora, Encuesta, HTML5, Login, Mondrian, Preferencias y Tarjeta. Las rutas están en `ListaProyectos.kt`.

## Otros

- **kotlin-learning/** — enlace a un repo externo (gitlink); en este clon la carpeta aparece vacía y no hay `.gitmodules`, así que no se descarga al clonar. El plan de estudio propio de Kotlin está en `Ejercicio1/base-personal/`.

## Notas

- Las carpetas generadas (`build/`, `.gradle/`, `.idea/`) y `local.properties` no se versionan (están en `.gitignore`). Al abrir un proyecto, Android Studio las regenera y crea `local.properties` con la ruta del SDK de cada máquina.
