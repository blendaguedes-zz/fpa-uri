package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val pi = 3.14159

    val input = Scanner(System.`in`)

    val raio = input.nextDouble()

    val volume = (4/3.0) * pi * (raio*raio*raio)

    println("VOLUME = ${"%.3f".format(volume)}")
}