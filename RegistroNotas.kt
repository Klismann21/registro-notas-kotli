// Registro de notas en Kotlin para la terminal
// Solo usa variables, listas y dos funciones

// Pide una nota y repite hasta que sea un numero valido entre 0 y 20
fun leerNota(): Double {
    while (true) {
        print("Nota del alumno (0 a 20) ")
        val nota = readln().toDoubleOrNull()
        if (nota != null && nota in 0.0..20.0) return nota
        println("Nota invalida, intenta de nuevo")
    }
}

// Devuelve el estado segun la nota
fun estadoDe(nota: Double) = if (nota >= 11) "Aprobado" else "Desaprobado"

fun main() {
    // Dos listas paralelas, la posicion 0 de nombres va con la posicion 0 de notas
    val nombres = mutableListOf<String>()
    val notas = mutableListOf<Double>()

    print("Cuantos alumnos vas a registrar ")
    val cantidad = readln().toIntOrNull() ?: 0

    for (i in 1..cantidad) {
        print("Nombre del alumno $i ")
        nombres.add(readln())
        notas.add(leerNota())
    }

    if (notas.isEmpty()) {
        println("No se registraron alumnos")
        return
    }

    // Calculos con funciones de listas
    val promedio = notas.average()
    val notaMaxima = notas.max()
    val notaMinima = notas.min()
    val posicionMejor = notas.indexOf(notaMaxima)
    val aprobados = notas.filter { it >= 11 }
    val notasOrdenadas = notas.sorted()

    // Contadores con variables mutables
    var desaprobados = 0
    var regulares = 0
    var destacados = 0
    for (nota in notas) {
        if (nota < 11) desaprobados++
        else if (nota < 16) regulares++
        else destacados++
    }

    println("\n----- LISTA DE ALUMNOS -----")
    for (i in nombres.indices) {
        println("${i + 1}. ${nombres[i]} - ${notas[i]} - ${estadoDe(notas[i])}")
    }

    println("\n----- RESULTADOS -----")
    println("Promedio del salon ${"%.2f".format(promedio)}")
    println("Nota mas alta $notaMaxima de ${nombres[posicionMejor]}")
    println("Nota mas baja $notaMinima")
    println("Aprobados ${aprobados.size} de ${notas.size}")
    println("Notas de menor a mayor $notasOrdenadas")

    println("\n----- POR RANGOS -----")
    println("Desaprobados (menos de 11) $desaprobados")
    println("Regulares (11 a 15.9) $regulares")
    println("Destacados (16 o mas) $destacados")
}
