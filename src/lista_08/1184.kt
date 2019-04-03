package lista_08

import java.util.Scanner

fun main(args: Array<String>) {
    val matrix = Array(12) { DoubleArray(12) }
    val input = Scanner(System.`in`)

    val operacao = input.next()
    if ((operacao == "S") or (operacao == "M")) {
        var soma = 0.0

        for (i in 0..(12-1)) {
            for (j in 0..(12-1)) {
                matrix[i][j] = input.nextDouble()
                if (i > j) {
                    soma += matrix[i][j]
                }
            }
        }

        when (operacao) {
            "S" -> println("%.1f".format(soma))
            "M" -> println("%.1f".format(soma / 66.0))
        }
    }
}