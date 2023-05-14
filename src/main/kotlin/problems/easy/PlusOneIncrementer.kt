package problems.easy


/**
 * Problem No.66 on Easy -> Plus One
 *
 * Given a large integer represented as an integer array digits,
 * where each digit at position i is the ith digit of the integer,
 * ordered from most significant to the least significant in left-to-right order,
 * and does not contain any leading 0's.
 *
 * Then Increment the large integer by one and return the resulting array of digits.
 */

private fun main() {
    val plusOneResult = plusOne(intArrayOf(9,9,9,1,9,9))
    println("Integer increased by one is ${plusOneResult.joinToString("")}")
}

fun plusOne(digits: IntArray): IntArray {
    var currentCheckPosition = digits.size - 1
    /**
     * We use while to iterate through all possible digits that may need to be changed
     * The reason behind using this condition is to handle cases where the number
     * only consist of 9s, which we would need to add 1 to the beginning.
     */
    while (currentCheckPosition > -1){
        // We have 2 scenarios, the digit at current position is 9 or another number
        when (digits[currentCheckPosition]) {
            // When it's nine, change digit at current position to 0 and move current position to left
            9 -> {
                digits[currentCheckPosition] = 0
                currentCheckPosition--
            }
            // When it's not 9, then just increase it by 1
            else -> {
                digits[currentCheckPosition] = digits[currentCheckPosition].inc()
                return digits
            }
        }
    }
    return intArrayOf(1, *digits)
}