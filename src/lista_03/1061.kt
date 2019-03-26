package lista_03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val diaInicial = input.nextLine().split(" ")[1].toInt()
    val secondLine = input.nextLine().split(" : ")
    val horaInicial = secondLine[0].toInt()
    val minInicial = secondLine[1].toInt()
    val segInicial = secondLine[2].toInt()
    val diaFinal = input.nextLine().split(" ")[1].toInt()
    val fourthLine = input.nextLine().split(" : ")
    val horaFinal = fourthLine[0].toInt()
    val minFinal = fourthLine[1].toInt()
    val segFinal = fourthLine[2].toInt()

    var duracaoDia = when {
        (diaFinal > diaInicial) -> diaFinal - diaInicial
        (diaInicial == diaFinal) -> 0
        else -> {
            (30 - diaInicial) + diaFinal
        }
    }

    var duracaoHora = when {
        (horaFinal > horaInicial) -> horaFinal - horaInicial
        (horaFinal == horaInicial) -> 0
        else -> {
            duracaoDia -= 1
            (24 - horaInicial) + horaFinal
        }
    }

    var duracaoMin = when {
        minFinal > minInicial -> minFinal - minInicial
        minFinal == minInicial -> 0
        else -> {
            duracaoHora -= 1
            var minT = minFinal - minInicial
            minT + 60
        }
    }

    var duracaoSeg = when {
        segFinal > segInicial -> segFinal - segInicial
        segFinal == segInicial -> 0
        else -> {
            duracaoMin -= 1
            if(duracaoMin < 0){
                duracaoHora -= 1
                duracaoMin += 60
            }
            var segT = segFinal - segInicial
            segT + 60
        }
    }

    println("$duracaoDia dia(s)")
    println("$duracaoHora hora(s)")
    println("$duracaoMin minuto(s)")
    println("$duracaoSeg segundo(s)")
}