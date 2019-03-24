package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextDouble()
    val b = input.nextDouble()
    val c = input.nextDouble()
    val media = ((a * 2) + (b * 3) + (c * 5)) / (10)
    println("MEDIA = ${"%.1f".format(media)}")
}
