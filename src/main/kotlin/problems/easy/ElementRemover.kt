package problems.easy


/**
 * Problem No.27 on Easy -> Remove Element
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * Then return the number of elements in nums which are not equal to val.
 */

private fun main() {
    val numOfElements = removeElement(nums = intArrayOf(0,1,2,2,3,0,4,2), `val` = 2)
    println("NumOfElements is $numOfElements")
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var outerPointer = 0
    nums.forEach {
        // Instead of searching for our target and removed it then do shift,
        // it's easier to squash others to left side.
        if(it != `val`){
            nums[outerPointer] = it
            // Then move our pointer forward
            outerPointer++
        }
    }
    return outerPointer
}