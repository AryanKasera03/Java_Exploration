import java.util.*;
class node1
{
    protected int data;
    protected node1 link;
    node1()
    {
        link=null;
        data=0;
    }

    node1(int d, node1 n)
    {
        data=d;
        link=n;
    }

    void setlink(node1 n)
    {
        link=n;
    }

    void setData(int d)
    {
        data=d;
    }

    node1 getlink()
    {
        return link;
    }

    int getData()
    {
        return data;
    }  
}

class linkedlist
{
    protected node1 start;
    linkedlist()
    {
        start=null;
    }

    boolean isEmpty()
    {
        return start==null;
    }

    void Insert(int val)
    {
        node1 nptr=null;node1 ptr=null;node1 save=null;
        boolean ins=false;
        if(start==null)
        {
            start=nptr;
        }
        else if(val<=start.getData())
        {
            nptr.setlink(start);
            start=nptr;
        }
        else
        {
            save=start;
            ptr=start.getlink();
            while(ptr!=null)
            {
                if(val>=save.getData())
                {
                    save.setlink(nptr);
                    nptr.setlink(ptr);
                    ins=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getlink();
                }
            }
            if(ins==false)
            {
                save.setlink(nptr);
            }
        }
    }

    void display()
    {
        node1 ptr=start;
        System.out.print(start.getData()+ "---->");
        ptr=start.getlink();
        while(ptr.getlink()!=null)     
        {
            System.out.print(ptr.getData()+ "---->");
            ptr=ptr.getlink();
        }
        System.out.println(ptr.getData()+ "!!!!");
        System.out.println();
    }
}

class LinkListTest
{
    protected static linkedlist s;
    static void main()
    {
        int num;
        s=new linkedlist();
        Scanner sc=new Scanner(System.in);
        System.out.println("....Starting list test...\n");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a number: ");
            try{
                num=sc.nextInt();
                s.Insert(num);
                System.out.print("Inserted "+ num);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.print("Created list is: ");
        s.display();
    }
}
