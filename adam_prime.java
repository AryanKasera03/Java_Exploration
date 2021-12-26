import java.util.*;
class adam_prime
{
    int n;
    adam_prime(int n)
    {
        this.n=n;
    }

    boolean isPrime()
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            return true;
        else 
            return false;
    }

    int reverse(int number)
    {
        int rev=0;
        while(number>0)
        {
            rev=rev*10+number%10; 
            number=number/10; 
        }
        return rev;
    }  

    boolean isAdam()
    {
        int initial_square=n*n;
        int reverse_number=reverse(n);
        int square=reverse_number*reverse_number;
        if(initial_square==reverse(square))
            return true;
        else
            return false;
    }

    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=m;i<n;i++)
        {
            adam_prime obj=new adam_prime(i);
            if(obj.isAdam()&&obj.isPrime())
                System.out.print(i);
        }
    }
}