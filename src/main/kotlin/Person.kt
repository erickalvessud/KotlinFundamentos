class Person (val name: String) {

    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false
        return otherPerson.name.equals(name)
    }
    override fun hashCode(): Int =
        name.hashCode()


    fun display(){
        val idade: Int
        if (name.isNotEmpty()) {
            idade = 17
        } else {
            idade = 0
        }
        println("Display nome ${name} e idade $idade")
    }

    // recebe uma funcao com parametro string e que retorna void
    fun displayWithLambda( funcao: (s: String) -> Unit){
        funcao(name);
    }


}