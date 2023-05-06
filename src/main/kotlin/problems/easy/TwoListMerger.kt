package problems.easy

/**
 * Problem No.21 on Easy -> TwoListMerger
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 */
private fun main() {
    val list1 = ListNode(1).also {
        it.next = ListNode(2).also {
            it.next = ListNode(4)
        }
    }
    val list2 = ListNode(1).also {
        it.next = ListNode(3).also {
            it.next = ListNode(4)
        }
    }
    // Let's know the result now
    var currentNode = mergeTwoLists(list1, list2)
    while (currentNode != null){
        print("${currentNode.`val`}  ")
        currentNode = currentNode.next
    }
}

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    return if(list1 == null){
        list2
    } else if(list2 == null){
        list1
    } else {
        // We should compare the two nodes to see which one has greater value
        if(list1.`val` < list2.`val`){
            list1.next = mergeTwoLists(list1.next, list2)
            list1
        } else {
            list2.next = mergeTwoLists(list2.next, list1)
            list2
        }
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

