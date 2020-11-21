import java.math.BigDecimal

fun main() {
    println(fibonacci(10000, BigDecimal("1"), BigDecimal("0")))
}

tailrec fun fibonacci(n: Int, a: BigDecimal, b: BigDecimal): BigDecimal {
    if (n == 0)
        return b
    return fibonacci(n -1, a + b, a)
}