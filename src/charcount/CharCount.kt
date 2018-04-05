package charcount

fun count(message: String): Map<Char, Int> {
    val map: MutableMap<Char, Int> = mutableMapOf()

    message.replace(' ', '_')
            .forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }

    return map
}