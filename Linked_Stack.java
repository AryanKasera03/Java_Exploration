import java.util.*;
class Linked_Stack 
{
    node top;
    Linked_Stack()
    {
        top=null;
    }
    
    void push(int x)
    {
         node obj=new node();
         obj.info=x;
         obj.next=top;
         top=obj;
         System.out.println("One node pushed in");
    }
    
    void pop()
    {
        if(top==null)
        {
            System.out.print("Underflow");
        }
        else
        {
            top=top.next;
            System.out.println("One node popped");
        }
    }
    
    void print()
    {
        if(top==null)
        {
            System.out.print("Stack Empty");
        }
        else
        {
            for(node temp=top;temp!=null;temp=temp.next)
            {
                System.out.println(temp.info);
                }
        }
    }
}
    