package problems.easy


/**
 * Problem No.58 on Easy -> Length of Last Word
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 */

private fun main() {
    val lastWordLength = lengthOfLastWord("   fly me   to   the moon  ")
    println("lastWordLength is $lastWordLength")
}

fun lengthOfLastWord(s: String): Int {
    // First we clean the string from whitespaces in both sides
    val trimmedString = s.trim()
    // Then we simply take last part starting from index next to last space until the end of clean string
    return trimmedString
        .slice(trimmedString.lastIndexOf(" ").inc() until trimmedString.length)
        .length
}