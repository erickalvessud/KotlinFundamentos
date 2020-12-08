fun main(args: Array<String>): Unit{
    imprimeDescricaoEquipamentoPorId(1)
    raizDosNumeros()
    filtrarMenorValor(4)
}

private fun imprimeDescricaoEquipamentoPorId(id: Int) {
    val notebook = Equipamento(id = 1, "Notebook")
    val teclado = Equipamento(id = 2, "Teclado")
    val mouse = Equipamento(id = 3, "Mouse")
    val equipamentos = arrayListOf<Equipamento>()
    equipamentos.add(notebook)
    equipamentos.add(teclado)
    equipamentos.add(mouse)
    val descricoesDeEquipamentos = equipamentos
        .filter { it.id == id }
        .map { it.descricao }
    descricoesDeEquipamentos.forEach(::println)
}

private fun filtraEquipamentosEImprimeTamanhoDescricao() {
    var equipamentos = listOf("Notebook", "Teclado", "Mouse", "Cabo de força")

    val tamanhoDescricao: List<Int> = equipamentos
        .filter { it -> it.toLowerCase().startsWith("n") }
        .map { it -> it.length }

    for (t in tamanhoDescricao) println(t)
}

private fun raizDosNumeros() {
    val ints = listOf<Int>(1, 2, 3, 4, 5)
    val quadrado: List<Int> = ints.map { it -> it * it }

    for (i in quadrado) println(i)
}

private fun filtrarMenorValor(limiar: Int) {
    val ints = listOf<Int>(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < limiar }

    for (i: Int in smallInts) println(i)
}

data class Equipamento(val id: Int, val descricao: String)