package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val pi = 3.14159
    val input = Scanner(System.`in`)

    val a = input.nextDouble()
    val b = input.nextDouble()
    val c = input.nextDouble()

    val triangulo = (a * c) /2
    val circulo = pi * (c * c)
    val trapezio = ((a + b) * c) / 2
    val quadrado = b * b
    val retangulo = a * b

    println("TRIANGULO: ${"%.3f".format(triangulo)}")
    println("CIRCULO: ${"%.3f".format(circulo)}")
    println("TRAPEZIO: ${"%.3f".format(trapezio)}")
    println("QUADRADO: ${"%.3f".format(quadrado)}")
    println("RETANGULO: ${"%.3f".format(retangulo)}")
}