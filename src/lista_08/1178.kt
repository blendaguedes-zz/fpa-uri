package lista_08

import java.util.Scanner

fun main(args: Array<String>) {
    val list = DoubleArray(100)

    val input = Scanner(System.`in`)
    val num = input.nextDouble()

    list[0] = num

    for (i in 1..99) {
        list[i] = list[i-1] / 2.0
    }

    for (j in 0..99){
        println("N[$j] = ${"%.4f".format(list[j])}")
    }
}