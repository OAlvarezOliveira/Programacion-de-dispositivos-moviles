# Plan Kotlin — base general en 30–45 días (puente para Programación de Dispositivos Móviles)

**Estado:** el temario/UDs oficial de PDM aún no está disponible. Las Fases 1–2 no dependen de él (arrancar ya), y se ejecutan sin esperar al programa de la asignatura.

**Objetivo:** en 30–45 días tener una **base general sólida de Kotlin** — suficiente para que cuando PDM aborde Android (Activities, layouts, ciclo de vida, persistencia, etc.), no estés atascado en la sintaxis del lenguaje. La parte específica de Android la enseña el profesor: aquí solo se hace un **vistazo de puente** (verla una vez para no ir en blanco), no profundización.

Base metodológica: repo oficial [Kotlin Koans](https://github.com/Kotlin/kotlin-koans) (JetBrains, clonado en `kotlin-koans/`).

**IDE: Android Studio** (el que se usará también en clase). Los ejercicios y katas son archivos `.kt` normales dentro de un proyecto Kotlin/JVM plano (no Android): se abren en el editor y se ejecutan con el botón ▶ sobre `fun main()`.

- **Editor** → archivos de ejercicio (`ejercicios/*.kt`) y el mini-proyecto.
- **Run window / Logcat equivalente** → salida de `println`, igual que la consola de Spyder pero sin REPL persistente (Kotlin no tiene un REPL tan cómodo como IPython; para probar snippets sueltos usar el "Kotlin scratch file" de Android Studio).
- **Kotlin Koans** → cada sección se resuelve dentro de su propio proyecto (`kotlin-koans/`, tiene su propio `gradlew`), con tests que verifican la solución.

## Cómo encaja en 30–45 días

- **Una sección de Koans por día** es el ritmo base (Koans tiene ~40 ejercicios agrupados en ~10 temas; se reparten en la Fase 1–2). Con el margen hasta 45 días quedan días libres para repasar y hacer el puente.
- **El final del plan (semana final) es un vistazo a Android/PDM**, con material propio, no con Koans.

## Reglas de ritmo (lo que da fluidez)

- **Kotlin scratch file en Android Studio como sustituto del REPL:** para probar dudas sueltas en segundos.
- **Kata diaria (5–10 min)** incluso en días sin sesión: se edita `katas/Katas.kt` y se ejecuta `main()` (cada día una kata nueva, sin borrar las anteriores).
- **Leer antes de ejecutar:** predecir la salida antes de correr el código, sobre todo con null safety y smart casts (ahí está la diferencia real con Python/Java).
- **Ejercicios obligatorios de Koans:** se resuelven escribiendo código hasta que el test en verde pasa, no solo leyendo la solución.

## Fases

### Fase 1 — Fundamentos (días 1–15, ~15 días)

| Días | Contenido | Foco |
|---|---|---|
| 1–2 | Introduction, Hello World, variables (`val`/`var`), tipos básicos | diferencia con Java/Python: inferencia de tipos, inmutabilidad por defecto |
| 3–4 | Null safety (Koans: `Nullability`) | `?`, `?:`, `!!`, smart casts — es la pieza que NO existe igual en Python |
| 5–6 | Strings, control de flujo (`when`, rangos) | `when` como sustituto de switch/match, ranges e infijos |
| 7–8 | Colecciones (`Collections`, `Filtering`, `Maps`) | `map`/`filter`/`groupBy`, comparación directa con list comprehensions de Python |
| 9–10 | Funciones, funciones de extensión (`Conventions`) | funciones top-level, extension functions — no existen en Python/Java clásico |
| 11–12 | Lambdas y funciones de orden superior (`Lambdas`) | sintaxis trailing lambda, `it` implícito |
| 13–15 | Clases, `data class`, propiedades (`Properties`, `Objects`) | equivalente a dataclasses de Python pero con `equals`/`hashCode`/`copy` generados |

Cierre de fase: repaso de los Koans resueltos hasta aquí (todos los tests en verde).

### Fase 2 — Robustez y tipos avanzados (días 16–23, ~8 días)

| Días | Contenido | Foco |
|---|---|---|
| 16–17 | Excepciones, `try`/`catch` como expresión | diferencia con Python: `try` devuelve valor |
| 18 | Sealed classes (`Sealed classes` en Koans) | modelar estados cerrados — no existe equivalente directo en Python |
| 19–20 | Generics básicos (`Generics`) | varianza `in`/`out`, comparación con Java generics |
| 21 | Corrutinas — introducción mínima | `suspend`, `launch`, por qué Android las usa para I/O — solo lo justo para no ir en blanco |
| 22 | Testing con JUnit | equivalente a lo que ya conoces de tests en otros lenguajes |
| 23 | Builders / DSLs (`Builders` en Koans, opcional) | por qué Kotlin permite DSLs tipo Gradle — vistazo, no profundizar |

Cierre de fase: repaso de excepciones + sealed classes + generics.

### Fase 3 — Puente a PDM/Android (días 24–30, ~7 días)

Esto NO es dominar Android — es **verlo una vez** para que cuando el profesor lo explique no vayas en blanco:

| Días | Contenido | Foco |
|---|---|---|
| 24 | Crear un proyecto Android vacío en Android Studio | estructura de carpetas, `AndroidManifest.xml`, Gradle de un módulo Android vs el JVM plano de este repo |
| 25 | **Activity + ciclo de vida** | `onCreate`/`onStart`/`onResume`/`onPause`/`onDestroy` — qué pasa y cuándo |
| 26 | **Layouts** (XML mínimo, vistazo a Jetpack Compose) | qué opción se usará en clase, diferencia declarativo vs imperativo |
| 27 | **Intents** (mínimo) | navegar entre pantallas, pasar datos |
| 28 | **RecyclerView + permisos en el manifest** (mínimo) | listar datos, pedir un permiso en tiempo de ejecución |
| 29 | Mini-proyecto ligero | app de una pantalla con lista + navegación simple |
| 30 | Buffer / repaso / quiz final | cerrar repasando null safety, data classes y ciclo de vida (lo que más se olvida) |

El mini-proyecto es opcional: si el tiempo aprieta, días 25–28 como lectura + ejecución de ejemplos es suficiente.

## Qué NO tocar (decisión consciente)

- Jetpack Compose a fondo, Room, Retrofit, arquitectura MVVM completa → especialización fuera de "base general", se aprende en clase con la base del lenguaje ya puesta.
- Corrutinas avanzadas (`Flow`, `channels`) → si el profesor las usa, se aprenden con el contexto de PDM.

## Alinear con el temario real (pendiente de recalibración)

- **El temario/UDs oficial de PDM aún no ha llegado.** La Fase 3 queda por defecto con el orden habitual (proyecto → ciclo de vida → UI → navegación → datos), que es el natural de Android.
- **Punto de recalibración:** cuando el profesor entregue el temario, se reordenan los días 24–29 de la Fase 3 para que el vistazo caiga justo antes de la semana en que se aborde cada tema en clase.
- Mientras tanto, aviso de recarga: **día 20 de ejecución** (media de Fase 2), pedir/recoger el temario si ya existe, para recalibrar la Fase 3 con margen.

## Cómo usar esto

1. Una sección de Kotlin Koans por día (o dos si son cortas).
2. Kata diaria en `katas/Katas.kt`, incluso en días sin sesión.
3. Cierre de fase: repasar los Koans/ejercicios de esa fase hasta que estén todos en verde, sin mirar la solución.
4. Dudas → aquí, contrastando con la sintaxis equivalente ya conocida (Python/Java, según convenga).
5. Cierre semanal: `notebooklm generate quiz|flashcards` en "Kotlin Learning AI Brain" (fuente: este plan).
