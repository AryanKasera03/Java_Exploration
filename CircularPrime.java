import java.util.*;
class CircularPrime
{
    CircularPrime()
    {
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
        {
            return true;
        }
        return false;
    }

    boolean checkCircular(int N)
    {
        int count = 0, temp = N;
        while (temp>0) 
        {
            count++;
            temp/=10;
        }
        int num = N;
        while(isPrime(num)) 
        {
            int rem = num % 10;
            int div = num / 10;
            num = (int)((Math.pow(10, count-1)) * rem)+ div;
            System.out.println(num);
            if (num == N)
                return true;
        }
        return false;
    }

    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CircularPrime obj= new CircularPrime();
        if(obj.checkCircular(n))
        {
            System.out.println("Yes");            
        }
        else
        {
            System.out.println("NO");
        }
    }
}