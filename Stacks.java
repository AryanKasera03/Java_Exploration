class Stacks
{
    int arr[]; int top;
    Stacks(int n)
    {
        int arr[]=new int[n];
        top=-1;
    }

    boolean isEmpty()
    {
        if(top==-1)
            return true;
        return false;    
    }

    boolean isFull()
    {
        if(top==arr.length-1)
            return true;
        return false;
    }

    void push(int n)
    {
        if(isFull())
            System.out.println("Stack overflow");
        else
        {
            arr[++top]=n;
            System.out.print("One element pushed in");
        }
    }

    void pop()
    {
        if(isEmpty())
            System.out.print("Stack underflow");
        else
            System.out.println(arr[top--]+"Popped");
    }
    
    
}