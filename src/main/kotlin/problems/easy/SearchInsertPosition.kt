package problems.easy


/**
 * Problem No.35 on Easy -> Search Insert Position
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */

private fun main() {
    val insertPosition = searchInsert(intArrayOf(1,3,5,6), 4)
    println("Insert position is $insertPosition")
}

fun searchInsert(nums: IntArray, target: Int): Int {
    /**
     * Make leverage of the fact that the nums are sorted & distinct and focus on getting all nums
     * that are less than target and index/position should be next to the last index of it
     */
    val numsLessThanTarget = nums.filter { it < target }
    return numsLessThanTarget.size
}