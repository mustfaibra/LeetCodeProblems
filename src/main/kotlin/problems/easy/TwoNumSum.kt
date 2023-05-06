package problems.easy

/**
 * Problem No.1 on Easy -> Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
*/

private fun main() {
    val indices = twoSum(nums = intArrayOf(2,7,11,15), target = 22)
    println(indices.joinToString(" & "))
}

private fun twoSum(
    nums: IntArray,
    target: Int
): IntArray {
    val visitedItems = mutableMapOf<Int,Int>()
    nums.forEachIndexed{index,number->
        if(visitedItems.keys.contains(target - number)){
            return intArrayOf(visitedItems.getValue(target - number),index)
        } else {
            visitedItems[number] = index
        }
    }
    return intArrayOf()
}