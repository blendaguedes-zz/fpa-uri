package lista_06

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    while (input.hasNextInt()) {
        val k = input.nextInt()

        if (k == 0) {
            break
        }

        val x = input.nextInt()
        val y = input.nextInt()

        if (x <= 10000 && x >= +-10000 && y <= 10000 && y >= +-10000) {
            for (i in 0..(k-1)) {
                val n = input.nextInt()
                val m = input.nextInt()
                if (n <= 10000 && n >= +-10000 && m <= 10000 && m >= +-10000)
                    if (x == n || y == m) println("divisa")
                    else if (x > n && y < m) println("NO")
                    else if (x < n && y < m) println("NE")
                    else if (x < n && y > m) println("SE")
                    else if (x > n && y > m) println("SO")
            }
        }
    }
}