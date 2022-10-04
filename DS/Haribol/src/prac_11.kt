package Hare_Krishna

import java.util.Scanner

class prac_11(var size : Int, var front : Int = -1, var rear : Int = -1)
{
    var qu = IntArray(size)
    fun enq(y: Int)
    {
        if (front == -1 && rear == -1)
        {
            front=0
            rear=0
            qu[rear]=y
        }
        else if((rear + 1)%qu.size == front)
        {
            println("!!Full!!")
        }
        else
        {
            qu[rear] = y
            rear = (rear+1) % qu.size
        }
    }
    fun deq()
    {
        if (front == -1 && rear == -1)
        {
            println("!!Empty!!")
        }
        else if (front == rear)
        {
            front = -1
            rear = -1
        }
        else
        {
            front = (front+1) % qu.size
        }
    }
    fun dsply()
    {
        if (front == -1 && rear == -1)
        {
            println("!!Empty!!")
        }
        while(front<=rear)
        {
            println("->" + qu[i].toString())
            front = (front+1) % qu.size
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