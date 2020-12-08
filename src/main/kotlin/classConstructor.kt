fun main() {
    val erick = Estudante("Erick", "Santos", 1)
    val createGraduado = Estudante.createGraduado()
    println(createGraduado)
}

abstract class Pessoa(var primeiroNome: String, var ultimoNome: String){
    open fun getNome(): String = "$primeiroNome $ultimoNome"
    abstract fun getEndereco(): String
}
open class Estudante(primeiroNome: String, ultimoNome: String, id: Int, var tutor: String = ""): Pessoa(primeiroNome, ultimoNome){
    val id: Int

    init{
        this.id = id;
    }

    override fun getEndereco(): String {
        return ""
    }

    companion object{
        fun createGraduado() = Graduado("Erick")
        fun createPosGraduado() = Graduado("Angelica")
    }
}

class Graduado(primeiroNome: String): Estudante(primeiroNome, "", 1) {

}
class PosGraduado(primeiroNome: String): Estudante(primeiroNome, "", 1) {

}

