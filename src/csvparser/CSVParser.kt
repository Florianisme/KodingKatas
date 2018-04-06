package csvparser

fun parse(input: String): String {
    val lists: ArrayList<List<String>> = arrayListOf()

    input.split("\n").forEach {
        lists.add(it.split(";"))
    }

    return lists.toString()
}