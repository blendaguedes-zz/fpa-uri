package lista_05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    while ( true ) {
        val patinhos = input.nextBigInteger()
        if(patinhos == (-1).toBigInteger()){
            break
        }else if(patinhos == (0).toBigInteger()) {
            println(0)
        }else{
            println(patinhos.minus((1).toBigInteger()))
        }
    }
}