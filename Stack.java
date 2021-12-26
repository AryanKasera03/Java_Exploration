public class Stack
{
    private int arr[],top;
    public Stack(int n)
    {
        arr=new int[n]; //allocates memory to the array
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

    public void push(int n)
    {
        if(isFull())
            System.out.println("\n Stack Overflow");
        else
        {
            arr[++top]=n;
            System.out.println("\n One element pushed in ");
        }
    }

    public void pop()
    {
        if(isEmpty())
            System.out.println("\n Stack Underflow ");
        else
            System.out.println(arr[top--]+" Popped ");
    }

    public void print()
    {
        if(isEmpty()) 
        {
            System.out.println(" Nothing to print ");
        }
        else
        {
            System.out.println(" Following are the content of the stack: ");
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
