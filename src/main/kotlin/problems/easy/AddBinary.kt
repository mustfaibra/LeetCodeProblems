package problems.easy

/**
 * Problem No.67 on Easy -> Add Binary
 *
 * Given two binary strings a and b,
 *
 * Then return their sum as a binary string.
 */

private fun main() {
    // We should test it using this values
    // First Case => "11" & "1"
    println("First Case : 11 & 1 => ${addBinary("11", "1")}")
    // Second Case => "1010" & "1011"
    println("Second Case : 1010 & 1011 => ${addBinary("1010", "1011")}")
}

private fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}