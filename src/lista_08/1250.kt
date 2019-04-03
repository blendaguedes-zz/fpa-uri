package lista_08

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    var n = input.nextInt()

    for (i in 0..(n-1)) {
        var cont = 0
        input.nextInt()
        input.nextLine()
        var tiro = input.nextLine().split(" ")
        var pulo = input.nextLine().split("")
        for (j in 1..(pulo.size - 2)) {
            if (pulo[j] == "S") {
                if (tiro[j-1].toInt() < 3) cont++
            } else {
                if (tiro[j-1].toInt() > 2) cont++
            }
        }
        println(cont)
    }
}