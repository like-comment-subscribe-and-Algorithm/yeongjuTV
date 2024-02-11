package 완전탐색 // ktlint-disable package-name

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n) // List<Int>와 같은 컬렉션을 사용하는 것보다 IntArray를 사용하는 것이 효율적이다

    dp[0] = numbers[0]
    var max = dp[0]

    for (i in 1 until n) {
        dp[i] = maxOf(dp[i - 1] + numbers[i], numbers[i])
        max = maxOf(dp[i], max)
    }

    print(max)
}
