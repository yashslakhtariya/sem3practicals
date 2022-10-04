import java.util.Scanner

class prac_10(var size : Int, var front : Int = 0, var rear : Int = 0)
{
    var qu = IntArray(size)
    fun enq(y: Int)
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
    val ysl = Scanner(System.`in`)

    q.enq(ysl.nextInt())
    q.enq(ysl.nextInt())
    q.enq(ysl.nextInt())

    q.deq()
    q.deq()

    q.enq(ysl.nextInt())

    q.deq()

    q.enq(ysl.nextInt())
    q.dsply()

    q.enq(ysl.nextInt())

}