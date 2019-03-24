package lista_02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val idadeDias = input.nextInt()

    println("${idadeDias/365} ano(s)")
    var temp = idadeDias%365

    println("${temp/30} mes(es)")
    temp %= 30

    println("${temp} dia(s)")
}