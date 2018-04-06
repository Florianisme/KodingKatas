package csvparser

fun parse(input: String): ArrayList<List<String>> {
    val lists: ArrayList<List<String>> = arrayListOf()

    // Adds a String for each ";" to a new ArrayList for each line break "\n"
    input.split("\n").forEach {
        lists.add(it.split(";"))
    }

    return lists
}

fun printList(list: ArrayList<List<String>>): String {
    val builder = StringBuilder()

    list.forEach {
        for (ii in it.indices) {
            var maxLength = 0
            list.forEach { singleList ->
                val length = singleList[ii].length
                maxLength = if (length > maxLength) length else maxLength
            }
            val tempString = it[ii]
            builder.append(tempString.padEnd(maxLength, ' '))
            builder.append('|')
        }
        builder.append("\n")

    }

    return builder.toString()
}