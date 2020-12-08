fun main() {
    val logs = listOf("Algo aconteceu", "Erro desconhecido", "Criado com sucesso")
    println(preparaParaLogComApply(logs))

    println("------------------")

    println(preparaParaLogComApplyRetornandoReceiver(logs)
        .toString())

    val joaoToString = User("João").apply {
        id = 1
        email = "erick@email.com"
        cpf = "000.000.000-00"
    }.toString()

    println(joaoToString)
}

/**
 * Usando o Apply
 */
fun preparaParaLogComApply(logs: List<String>): String{
    return StringBuilder().apply(){
        for(l in logs) {
            if (length > 0) {
                append(", ")
            }
            append(l)
        }
    }.toString()
}


fun preparaParaLogComApplyRetornandoReceiver(logs: List<String>): StringBuilder =
    StringBuilder().apply{
        for(l in logs){
            if (length > 0){
                append(", ")
            }
            append(l)
        }
    }