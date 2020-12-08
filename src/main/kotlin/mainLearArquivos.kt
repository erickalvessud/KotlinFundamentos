@file:JvmName("LeitorArquivo")

import java.io.File
import java.io.FileReader
import java.io.IOException
import java.nio.charset.Charset

fun main() {
    lerArquivo()
}
fun lerArquivo() {
    val arquivo =
        "/home/erick/Documents/workspace/estudo/pluralsight/kotlin_fundamentals/Exemplo/src/main/kotlin/teste"
    try {
        File(arquivo)
            .forEachLine(charset("UTF-8"), ::println)
    } catch (e: IOException) {
        println("Erro ao ler o arquivo ${e.message}")
    }
}