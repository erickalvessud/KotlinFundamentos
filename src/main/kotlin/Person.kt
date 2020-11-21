class Person (var nome: String) {

    fun display(){
        println("Display ${nome}")
    }

    // recebe uma funcao com parametro string e que retorna void
    fun displayWithLambda( funcao: (s: String) -> Unit){
        funcao(nome);
    }
}