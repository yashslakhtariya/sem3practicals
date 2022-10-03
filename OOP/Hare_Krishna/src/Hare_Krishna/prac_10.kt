package Hare_Krishna

class prac_10(var size : Int, var front : Int = 0, var rear : Int = 0, var qu: Array<Int> = arrayOf(0,1,2,3,4,5))
{
    fun enq(y : Int)
    {
        if (rear==size)
        {
            print("\nQueue is Full")
            return
        }
        else
        {
            qu[rear] = y
            rear++
        }
    }
    fun deq()
    {
        if (front==rear)
        {
            print("\nQueue is Empty")
            return
        }
        else
        {
            front++
        }
    }
    fun dsply()
    {
        if (front==rear)
        {
            print("\nQueue is Empty")
            return
        }
        for (i in front until rear)
        {
            print(qu[i].toString() + " ")
        }
    }
}

fun main()
{
    val q = prac_10(size = 5)
    q.enq(10)
    q.enq(20)
    q.enq(30)

    q.deq()
    q.deq()

    q.enq(40)

    q.deq()

    q.enq(50)

    q.dsply()

    q.enq(60)
}