import java.util.*;
class prime_palindrom
{
    int m,n;
    prime_palindrom(int m, int n)
    {
        this.m=m;
        this.n=n;
    }

    boolean isPrime(int number)
    {
        int count=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                count++;
            }
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

    boolean isPalindrom(int number)
    {
        if(number==reverse(number))
            return true;
        else
            return false;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower number: ");
        int m=sc.nextInt();
        System.out.print("Enter the higher number: ");
        int n=sc.nextInt();
        prime_palindrom obj=new prime_palindrom(m,n);
        int count=0;
        if(m>3000||n>3000||m>n)
        {
            System.out.print("OUT OF RANGE");
        }
        else
        {
            for(int i=m;i<=n;i++)
            {
                if(obj.isPrime(i)&&obj.isPalindrom(i))
                {
                    System.out.print(i+ ", ");
                    count++;
                }
            }
            System.out.print("Total prime_palindrom numbers is: " + count);
        }
    }
}

