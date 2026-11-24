# Índice del proyecto Examen_Simulacro

Proyecto de práctica para el examen de PMDM (Kotlin + Jetpack Compose). Sirve como material de consulta: «quiero hacer X → mira en este archivo».

Todo el código está en `app/src/main/java/com/example/examen_pdmd/`. Los recursos, en `app/src/main/res/`.

## Estructura de la app

Cuatro pantallas con navegación entre ellas, una barra superior con menú hamburguesa y todos los textos y colores cargados desde recursos.

```
Login → Zapatilla → Formulario → Lista
```

| Archivo | Qué contiene |
|---|---|
| `MainActivity.kt` | Punto de entrada. Solo llama a `NavegacionApp()`. |
| `NavegacionApp.kt` | `Scaffold` con la barra superior y el `NavHost` con las 4 rutas. |
| `Rutas.kt` | `sealed class` con las rutas de las 4 pantallas. |
| `BarraSuperior.kt` | `TopAppBar` reutilizable con el menú hamburguesa (`DropdownMenu`). |
| `PantallaLogin.kt` | Pantalla 1: dos campos de texto y un botón. |
| `PantallaZapatilla.kt` | Pantalla 2: imagen con esquinas redondeadas e icono encima. |
| `PantallaFormulario.kt` | Pantalla 3: campo de texto, radio buttons, checkbox y diálogo. |
| `PantallaLista.kt` | Pantalla 4: `LazyColumn` con tarjetas y diálogo. Incluye `cargarElementos()`. |
| `Elemento.kt` | Clase de datos que llena la lista. |

## «Quiero hacer… → mira aquí»

| Quiero… | Dónde |
|---|---|
| Declarar las rutas | `Rutas.kt` |
| Montar el `NavHost` y el `Scaffold` | `NavegacionApp.kt` |
| Navegar con una función genérica (`onNavigateTo`) | Cualquier pantalla: parámetro `onNavigateTo: (String) -> Unit`; se conecta en `NavegacionApp.kt` |
| Un botón que navega | `PantallaLogin.kt` |
| Un campo de texto | `PantallaLogin.kt` |
| Un campo de contraseña (asteriscos) | `PantallaLogin.kt` |
| Una imagen que no se deforma, con esquinas redondeadas | `PantallaZapatilla.kt` |
| Un icono encima de una imagen | `PantallaZapatilla.kt` (dentro de un `Box`) |
| Radio buttons (una sola variable `String`) | `PantallaFormulario.kt` |
| Un checkbox | `PantallaFormulario.kt` |
| Un diálogo (`AlertDialog`) | `PantallaFormulario.kt` |
| Una lista con `LazyColumn` y `Card` | `PantallaLista.kt` |
| Una fila pulsable que abre un diálogo | `PantallaLista.kt` |
| Cargar los datos de la lista con una función | `PantallaLista.kt` (`cargarElementos`) y `Elemento.kt` |
| Una barra superior con menú hamburguesa | `BarraSuperior.kt` |
| Una variable de estado que sobrevive a girar el móvil | `rememberSaveable { mutableStateOf(...) }`, al inicio de cada pantalla |

## Recursos

Ningún texto ni color va escrito a mano en el código.

| Recurso | Archivo | Cómo se usa |
|---|---|---|
| Textos | `res/values/strings.xml` | `stringResource(R.string.nombre)` |
| Colores | `res/values/colors.xml` | `colorResource(R.color.nombre)` |
| Imagen | `res/drawable/zapatilla.webp` | `painterResource(R.drawable.zapatilla)` |

Prefijos de los textos de `strings.xml`: `login_`, `zapatilla_`, `formulario_`, `lista_`, `menu_`.

## Dependencias a recordar

En `app/build.gradle.kts`:

```kotlin
implementation("androidx.navigation:navigation-compose:2.8.9")
```

## Errores típicos que me han salido

- `by` en rojo → faltan los imports `getValue` y `setValue`.
- Contenido tapado por la barra → falta `.padding(innerPadding)` en el `NavHost`.
- Una función composable dentro de una `class` → crear el archivo como **File**, no como Class.
- Un `Float` en el estado → usar `75f`, no `75`.
- Comparar un `RadioButton` con un `Text(...)` → comparar con un `String` (`plan == "basico"`).
- Una dependencia sin su grupo (`"material-icons-extended"`) → el formato es `grupo:nombre`.
- El `AlertDialog` dentro del `items` de la lista → va **fuera** de la `LazyColumn`.
- Un `composable(...)` fuera de las llaves del `NavHost`.

## Orden para crear todo en el examen (qué y dónde)

Cada archivo del proyecto lleva al principio un comentario `PASO n` con lo mismo.

| Paso | Qué hago | Dónde |
|---|---|---|
| 1 | Añadir la dependencia de navegación y pulsar Sync Now | `app/build.gradle.kts` |
| 2 | Crear las rutas (un `object` por pantalla) | `Rutas.kt` (File) |
| 3 | Crear las 4 pantallas **vacías** con `Text("Pantalla X")`, con parámetro `onNavigateTo` | `PantallaLogin.kt`, `PantallaZapatilla.kt`, `PantallaFormulario.kt`, `PantallaLista.kt` |
| 4 | `rememberNavController` + `Scaffold` + `NavHost` con un `composable(...)` por pantalla | `NavegacionApp.kt` |
| 5 | Llamar a `NavegacionApp()` dentro del tema | `MainActivity.kt` |
| 6 | **Probar** que se navega entre las 4 (botón provisional en cada una) | emulador |
| 7 | Rellenar **una pantalla cada vez** y probarla: Login → Zapatilla → Formulario → Elemento + Lista | cada `Pantalla*.kt`, `Elemento.kt` |
| 8 | Barra superior con menú hamburguesa y usarla en el `topBar` | `BarraSuperior.kt` + `NavegacionApp.kt` |
| 9 | Revisar que no queda ningún texto ni color escrito a mano | `res/values/strings.xml`, `colors.xml` |

Si falta tiempo: 4 pantallas que navegan valen más que 1 perfecta y 3 vacías.
