import java.util.*;
class Queue
{
    int queue[]; int front, rear, max;
    Queue(int max)
    {
        front=rear=0;
        this.max=max;
        int queue[]= new int[max];
    }

    //check if full
    boolean isFull()
    {
        if(max==rear)
            return true;
        return false;
    }
    //checks if empty
    boolean isEmpty()
    {
        if(front==rear) 
            return true;
        return false;
    }
    //Enqueue function to add an element
    void Enqueue(int data)
    {
        if(isFull())
            System.out.println("Queue is full: ");
        else
        {
            queue[rear]=data;
            rear++;
            System.out.print("Element enqueued");
        }
    }

    void Dequeue()
    {
        if(isEmpty())
            System.out.println("Queue is empty");
        else
        {
            for(int i=0;i<rear-1;i++)
            {
                queue[i]=queue[i+1];
            }
            if(rear<max)
            {
                queue[rear]=0;
            }
            rear--;
        }
    }
}