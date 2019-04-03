package lista_08

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    while (true){
        var a = input.nextLong()
        var b = input.nextLong()
        if (a == 0L && b == 0L) break
        println(a - (b - a))
    }
}