package problems.easy


/**
 * Problem No.26 on Easy -> Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order,
 * Then remove the duplicates in-place such that each unique element appears only once
 * & return the number of unique elements in nums.
 */

private fun main() {
    val uniqueNumsCount = removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4))
    println("Nums of unique nums is $uniqueNumsCount")
}

fun removeDuplicates(nums: IntArray): Int {
    var outerCounter = 0
    for(innerCounter in 1 until nums.size){
        if(nums[outerCounter] != nums[innerCounter]){
            outerCounter++
            nums[outerCounter] = nums[innerCounter]
        }
    }
    return outerCounter + 1
}

