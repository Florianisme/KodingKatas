private val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000)

fun toNumeral(i: String): Int {
    val input = i.toUpperCase().toCharArray().reversedArray()

    var sum = 0
    var previous = 0

    for (it in input) {
        val value = map.getOrDefault(it, 0)
        sum = if (value < previous) sum - value else sum + value
        previous = value
    }

    return sum
}