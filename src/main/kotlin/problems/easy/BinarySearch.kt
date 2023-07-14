package problems.easy


/**
 * Problem No.704 on Easy -> Binary Search
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target.
 *
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 */

private fun main() {
    // First Case => nums = [-1,0,3,5,9,12], target = 9
    println("First Case : nums = [-1,0,3,5,9,12], target = 9 => ${search(intArrayOf(-1,0,3,5,9,12),9)}")
    // Second Case => nums = [-1,0,3,5,9,12], target = 2
    println("Second Case : nums = [-1,0,3,5,9,12], target = 2 => ${search(intArrayOf(-1,0,3,5,9,12),2)}")
}

fun search(nums: IntArray, target: Int): Int{
    return nums.binarySearch(target).let {
        if(it < 0) -1
        else it
    }
}