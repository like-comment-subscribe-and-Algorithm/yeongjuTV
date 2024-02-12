package 탐욕적기법 // ktlint-disable package-name

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val table = Array(n) { IntArray(2) }

    for (i in 0 until n) {
        val times = readLine().split(" ").map { it.toInt() }
        table[i] = times.toIntArray()
    }

    table.sortWith(
        compareBy(
            { it[1] },
            { it[0] },
        ),
    )

    var count = 1
    var endTime = table[0][1]

    for (i in 1 until n) {
        if (endTime <= table[i][0]) {
            endTime = table[i][1]
            count++
        }
    }

    print(count)
}
