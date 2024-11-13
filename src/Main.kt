
fun main() {
    println("Введите натуральное число:")
    val input = readlnOrNull() ?: return

    try {
        val decimal = input.toInt()
        if (decimal < 0) throw NumberFormatException()
        val binary = decimal.toString(2)
        println("Бинарный вид: $binary")
    } catch (e: NumberFormatException) {
        println("Ошибка(Введите натуральное число).")
    }
}
