package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val raio = input.nextDouble()
    val result = 3.14159 * raio * raio
    println("A=${"%.4f".format(result)}")
}