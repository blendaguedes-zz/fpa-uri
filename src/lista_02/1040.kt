package lista_02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val n1 = input.nextFloat()
    val n2 = input.nextFloat()
    val n3 = input.nextFloat()
    val n4 = input.nextFloat()

    val media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10
    println("Media: ${"%.1f".format(media)}")

    if (media >= 7.0){
        println("Aluno aprovado.")

    } else if (media < 5.0){
        println("Aluno reprovado.")

    } else if ((media >= 5.0) && (media < 7.0)){
        println("Aluno em exame.")

        val n5 = input.nextDouble()
        println("Nota do exame: ${"%.1f".format(n5)}")

        val mediaFinal = (media + n5) / 2

        if (mediaFinal >= 5.0){
            println("Aluno aprovado.")

        } else{
            println("Aluno reprovado.")
        }

        println("Media final: ${"%.1f".format(mediaFinal)}")
    }
}