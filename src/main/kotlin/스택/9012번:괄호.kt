package 스택 // ktlint-disable package-name

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val strings = mutableListOf<String>()

    for (i in 0 until n) {
        val input = readLine()!!
        strings.add(input)
    }

    for (i in 0 until n) {
        var left = 0
        var right = 0

        for (s in strings[i]) {
            if (s == '(') {
                left++
            } else {
                right++
            }
            if (left < right) {
                break
            }
        }
        if (left != right) {
            println("NO")
        } else {
            println("YES")
        }
    }
}
