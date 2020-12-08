interface Imprimivel {
    fun imprimir(texto: String)
    fun imprimirConsole(texto: String) = println("Texto $texto")
}

interface Logavel {
    fun imprimirConsole(texto: String) = println("Log $texto")
}

class Log: Imprimivel, Logavel{
    override fun imprimir(texto: String) {
        // alguma implementacao
    }
    override fun imprimirConsole(texto: String) {
        super<Logavel>.imprimirConsole(texto)
    }
}