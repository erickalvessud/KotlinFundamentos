fun main() {
    val logs = listOf("Algo aconteceu", "Erro desconhecido", "Criado com sucesso")
    println(preparaParaLogComWith(logs))

    val erick = User("Erick")
    with(erick){
        this.id = 1
        email = "erick@email.com"
        cpf = "000.000.000-00"
    }

    println(erick)
}
// convencional
fun preparaParaLog(logs: List<String>): String{
    var stringBuilder = StringBuilder()

    for(l in logs){
        if (stringBuilder.length > 0){
            stringBuilder.append(", ")
        }
        stringBuilder.append(l)
    }

    return stringBuilder.toString()
}

/**
 * Usando o with
 */
fun preparaParaLogComWith(logs: List<String>): String{
    var stringBuilder = StringBuilder()

    return with(stringBuilder){
        for(l in logs){
            if (this.length > 0){
                this.append(", ")
            }
            this.append(l)
        }

        this.toString()
    }
}

/**
 * Omitindo o this para chamar o object receiver, que nesse caso é o StringBuilder
 * Também passando como expressão.
 */
fun preparaParaLogComWithSucinto(logs: List<String>): String = with(StringBuilder()){
    for(l in logs){
        if (length > 0){
            append(", ")
        }
        append(l)
    }
    toString()
}

data class User(val nome: String){
    var id: Int = 0
    var email: String = ""
    var cpf: String = ""
}


