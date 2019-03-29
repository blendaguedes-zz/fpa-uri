package lista_06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    while (input.hasNextInt()) {
        var check = false

        val b = input.nextInt()
        val n = input.nextInt()

        if (b == 0 && n == 0) {
            break
        }
        val reserves = Array(b) { it }

        for (i in 0..(b - 1)) {
            reserves[i] = input.nextInt()
        }

        for (i in 0..(n - 1)) {
            val d = input.nextInt()
            val c = input.nextInt()
            val v = input.nextInt()

            reserves[d-1] -= v
            reserves[c-1] += v
        }

        for (i in 0..(b - 1)) {
            if (reserves[i] < 0) {
                check = true
                break
            }
        }

        if (check) {
            println("N")
        } else {
            println("S")
        }

    }
}