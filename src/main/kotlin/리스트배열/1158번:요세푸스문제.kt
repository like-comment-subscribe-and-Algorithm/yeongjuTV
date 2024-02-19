package 리스트배열 // ktlint-disable package-name

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val queue = arrayListOf<Int>()
    val answer = mutableListOf<Int>()
    val (n, k) = readLine().split(" ").map { it.toInt() }

    for (i in 1..n) {
        queue.add(i)
    }

    var i = 0
    while (queue.isNotEmpty()) {
        i = (i + k - 1) % queue.size
        answer.add(queue[i])
        queue.removeAt(i)
    }

    println(answer)
}
