package lista_08

import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
    val fib = generateSequence(BigInteger.ZERO to BigInteger.ONE) {
        it.second to it.first + it.second
    }.map { it.first }
    val fibonacci = fib.take(61).toList()

    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (j in 1..num) {
        val n = input.nextInt()
        val item = fibonacci[n]
        println("Fib($n) = $item")
    }
}