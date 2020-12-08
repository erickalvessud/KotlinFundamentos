fun main() {
    var fit = Carro(nome = "Fit", preco = 50_000.0)
    var civic = Carro(nome = "Civic", preco = 80_000.0)
    var onix = Carro(nome = "Onix", preco = 48_000.0)

    val carros = listOf(fit, civic, onix)

    run {println("Oi")}

    carroMiasCaroLambdaVariavel(carros)

    carroMaisCaroLambdaExpr(carros)
}

private fun carroMiasCaroLambdaVariavel(carros: List<Carro>) {
    var lambdaCarro = { p: Carro -> p.preco }

    val carroMaisCaro = carros.maxByOrNull(lambdaCarro)
    println(carroMaisCaro?.nome)
}

private fun carroMaisCaroLambdaExpr(carros: List<Carro>) {
    val carroMaisCaro = carros.maxByOrNull { it -> it.preco }
    println(carroMaisCaro?.nome)
}