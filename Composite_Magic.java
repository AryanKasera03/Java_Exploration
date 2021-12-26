import java.util.*;
class Composite_Magic
{
    int m;
    int n;
    Composite_Magic()
    {
    }

    boolean isComposite(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;            
        }
        if(count!=2)
            return true;
        return false;   
    }

    boolean isMagic(int num)
    {
        if((num-1)%9==0)
        {
            return true;
        }
        return false;
    }

    void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the smaller number: ");
        int m=sc.nextInt();
        System.out.println("Enter the larger number: ");
        int n= sc.nextInt();
        int count=0;
        if(m>n)
        {
            System.out.println("INVALID");
        }
        else
        {
            for(int j=m;j<n;j++)
            {
                if(isMagic(j)&&isComposite(j))
                {
                    count++;
                    System.out.println(j);
                }
            }

            System.out.print(count);
        }
    }

    static void main()
    {
        Composite_Magic obj= new Composite_Magic();
        obj.display();
    }
}
