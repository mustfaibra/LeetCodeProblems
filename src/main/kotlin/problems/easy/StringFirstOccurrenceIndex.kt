package problems.easy


/**
 * Problem No.28 on Easy -> Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack
 * return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

private fun main() {
     val firstOccurrenceIndex = strStr("sadbutsad", "but")
    println("firstOccurrenceIndex is $firstOccurrenceIndex")
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}