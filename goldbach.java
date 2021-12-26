import java.util.*;
class goldbach
{
    int num;
    goldbach(int num)
    {
        this.num=num;
    }

    boolean isEven()
    {
        if(this.num%2==0)
            return true;
        return false;
    }

    boolean isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                count++;
        if(count==2)
            return true;
        return false;
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        goldbach obj= new goldbach(num);
        int q=0;
        int p=3;
        if(num<10||num>49)
        {
            System.out.print("Number out of range");
            return;
        }
        else if(!obj.isEven())
        {
            System.out.print("Number is odd");
            return;
        }
        else
        {
            while(p<num)
            {
                q=num-p;
                if(obj.isPrime(p)&&obj.isPrime(q)&&p<=q)
                {
                    System.out.println("("+p+ ","+ q+")");
                }
                p+=2;
            }
        }
    }
}
