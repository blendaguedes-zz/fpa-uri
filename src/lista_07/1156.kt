package lista_07

fun main(args: Array<String>) {
    var soma = 1f
    var b = 2
    var i = 3
    while (i < 40) {
        soma += i.toFloat() / b.toFloat()
        i++
        b *= 2
        i++
    }
    println("%.2f".format(soma))
}