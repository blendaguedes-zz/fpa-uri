package lista_08

import java.util.Scanner

fun main(args: Array<String>) {
    val matrix = Array(12) { DoubleArray(12) }

    val input = Scanner(System.`in`)

    val linha = input.nextInt()
    val operacao = input.next()

    for (i in 0..11) {
        for (j in 0..11) {
            matrix[i][j] = input.nextDouble()
        }
    }

    when (operacao) {
        "S" -> println("%.1f".format(matrix[linha].sum()))
        "M" -> println("%.1f".format(matrix[linha].average()))
    }
}