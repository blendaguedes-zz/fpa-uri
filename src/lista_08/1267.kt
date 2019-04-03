package lista_08

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    while (true) {
        var n = input.nextInt()
        var d = input.nextInt()

        if (n == 0 && d == 0) break

        var jantar = Array(d) { IntArray(n) }

        for (i in 0..(d-1)){
            for (j in 0..(n-1)){
                jantar[i][j] = input.nextInt()
            }
        }
        var cont = 0
        for (i in 0..(n-1)){
            cont = 0
            for (j in 0..(d-1)){
                if (jantar[j][i] == 1) cont++
            }

            if (cont == d) {
                println("yes")
                break
            }
        }
        if (cont != d) println("no")
    }
}