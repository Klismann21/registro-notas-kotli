# Registro de Notas en Kotlin

Programa de terminal escrito en Kotlin que registra alumnos con su nota y calcula resultados del salon. Nació como un ejercicio para practicar la lógica y la sintaxis básica del lenguaje, y la idea es que crezca poco a poco hasta convertirse en un sistema de registro de alumnos.

## Qué hace hoy

- Pregunta cuántos alumnos se van a registrar y pide el nombre y la nota de cada uno.
- Valida que la nota sea un número entre 0 y 20. Si no lo es, vuelve a preguntar.
- Muestra la lista de alumnos con su estado, aprobado desde 11.
- Calcula el promedio del salón, la nota más alta con el nombre del alumno, la nota más baja y cuántos aprobaron.
- Ordena las notas de menor a mayor.
- Clasifica a los alumnos en tres rangos, desaprobados (menos de 11), regulares (11 a 15.9) y destacados (16 o más).

## Cómo correrlo

Necesitas tener Kotlin instalado, o abrir el archivo en IntelliJ IDEA y darle al botón de Run.

Desde la terminal.

```
kotlinc RegistroNotas.kt -include-runtime -d notas.jar
java -jar notas.jar
```

## Ejemplo de salida

Con tres alumnos de prueba, Ana con 8, Luis con 14 y Rosa con 18.

```
----- LISTA DE ALUMNOS -----
1. Ana - 8.0 - Desaprobado
2. Luis - 14.0 - Aprobado
3. Rosa - 18.0 - Aprobado

----- RESULTADOS -----
Promedio del salon 13.33
Nota mas alta 18.0 de Rosa
Nota mas baja 8.0
Aprobados 2 de 3
Notas de menor a mayor [8.0, 14.0, 18.0]

----- POR RANGOS -----
Desaprobados (menos de 11) 1
Regulares (11 a 15.9) 1
Destacados (16 o mas) 1
```

## Qué conceptos de Kotlin practica

- Variables inmutables (`val`) y mutables (`var`).
- Listas mutables con `mutableListOf` y funciones de lista como `average()`, `max()`, `min()`, `indexOf()`, `filter` y `sorted()`.
- Funciones propias con parámetros y valor de retorno.
- Bucles `for` y `while`, y condicionales `if` y `else`.
- Manejo de valores nulos con `toIntOrNull()`, `toDoubleOrNull()` y el operador elvis `?:`.
- Texto con variables dentro usando `$` y `${}`.

## Limitaciones actuales

- Los datos se pierden al cerrar el programa, porque todavía no se guardan en ningún archivo.
- Si dos alumnos empatan con la nota más alta, solo se muestra el que se ingresó primero.
- No se valida que el nombre esté vacío.
- Solo maneja una nota por alumno.

## Hacia dónde quiere crecer

Estas son ideas para las siguientes etapas y todavía no están hechas.

1. Guardar y cargar los alumnos desde un archivo para no perder los datos.
2. Pasar de dos listas paralelas a una clase `Alumno`, para poder guardar más datos de cada uno.
3. Registrar varias notas por alumno y por curso.
4. Agregar un puntaje de comportamiento por alumno, con registro por fecha, para entender cómo se comporta cada chico a lo largo del tiempo.
5. Generar reportes por alumno y por salón.
6. Más adelante, una interfaz de app o una base de datos.

## Nota sobre los datos

Este repositorio es público, así que los ejemplos usan nombres ficticios. Si el proyecto llega a manejar alumnos reales, sobre todo con puntajes de comportamiento, esos datos no deben subirse a GitHub.
