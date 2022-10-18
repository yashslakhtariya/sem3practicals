import java.util.Scanner

class LinkedList {
    var head : Node? = null

    class Node(var data: Int)
    {
        var next: Node? = null
    }

    companion object
    {
        fun insert(
            list: LinkedList,
            data: Int
        ): LinkedList
        {
            val newnd = Node(data)
            newnd.next = null

            if (list.head == null)
            {
                list.head = newnd
            }
            else
            {

                var last = list.head
                while (last!!.next != null) {
                    last = last.next
                }
                last.next = newnd
            }
            return list
        }

        fun printList(list: LinkedList) {
            var currNode = list.head
            print("LinkedList: ")

            while (currNode != null) {
                print(currNode.data.toString() + " ")
                currNode = currNode.next
            }
            println()
        }

        fun deleteAtPosition(list: LinkedList, index: Int): LinkedList {
            var currNode = list.head
            var prev: Node? = null

            if (index == 0 && currNode != null) {
                list.head = currNode.next

                println("$index position element deleted")

                return list
            }

            var counter = 0

            while (currNode != null) {
                if (counter == index) {

                    prev!!.next = currNode.next

                    println("$index position element deleted")
                    break
                } else {

                    prev = currNode
                    currNode = currNode.next
                    counter++
                }
            }

            if (currNode == null) {
                println("$index position element not found")
            }

            return list
        }

        @JvmStatic
        fun main(args: Array<String>)
        {
            val scnr = Scanner(System.`in`) ;
            var list = LinkedList()
            list = insert(list, 1)
            list = insert(list, 2)
            list = insert(list, 3)
            list = insert(list, 4)
            list = insert(list, 5)
            list = insert(list, 6)
            list = insert(list, 7)
            list = insert(list, 8)

            printList(list)

            deleteAtPosition(list, 0)

            printList(list)

            deleteAtPosition(list, 2)

            printList(list)

            deleteAtPosition(list, 10)

            printList(list)
        }
    }
}