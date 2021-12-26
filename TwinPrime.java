import java.util.*;
class TwinPrime
{
    TwinPrime()
    {
    }
    
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        return false;
    }
    
    void allTwin(int a, int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i)&&isPrime(i+2))
            {
                System.out.print("("+i+","+ (i+2)+") ");
                a=a+2;
            }
        }
    }
    
    static void main()
    {
        TwinPrime obj=new TwinPrime();
        obj.allTwin(1,20);
    }
}