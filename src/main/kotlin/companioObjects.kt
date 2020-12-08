object Cursos{
    val allMeetings = arrayListOf<Curso>()

    init {
        this.allMeetings.add(Curso("Kotlin"))
        this.allMeetings.add(Curso("Java"))
    }
}
data class Curso(val titulo: String){
    object TituloComparator : Comparator<Curso> {
        override fun compare(p1: Curso, p2: Curso): Int =
            p1.titulo.compareTo(p2.titulo)
    }
    companion object Formato {
        val formatos = arrayListOf<String>()
    }
}
fun main() {
    val cursos = listOf(Curso("Kotlin"), Curso("Java"), Curso("Angular"))
    Curso.Formato.formatos.add("Presencial")
    Curso.formatos.add("EAD")
    println(cursos.sortedWith(Curso.TituloComparator))
    Curso.formatos.forEach(::println)
}
