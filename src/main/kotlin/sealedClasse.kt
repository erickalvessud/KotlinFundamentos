sealed class PessoaEvent{}
class Acorda: PessoaEvent(){}
class Dorme: PessoaEvent(){}
class Come(val comida: String): PessoaEvent(){
    fun comer(){
        println("Comendo $comida")
    }
}

fun handlePessoaEvent(event: PessoaEvent){
    when(event){
        is Acorda -> println("Acordando")
        is Dorme -> println("Dormindo")
        is Come -> event.comer()
    }
}

fun main() {
    handlePessoaEvent(Come("Macarrao"))
    handlePessoaEvent(Acorda())
}