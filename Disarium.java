import java.util.*;
class Disarium
{
    int num; int size;
    Disarium(int n)
    {
        num=n;
        size=0;
    }

    void countDigit()
    {
        while(num>0)
        {
            size++;
            num/=10;
        }
    }

    int sumOfDigits(int n, int p)
    {
        if(n<10)
            return (int)Math.pow(n, p);
        else
            return (int)Math.pow(n%10,p)+ sumOfDigits(n/10, --p);
    }

    void check()
    {
        if(num==sumOfDigits(num, size))
           System.out.print("Number is a disarium number");        
        else
            System.out.print("Number is not a disarium number");
    }
    
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        Disarium obj= new Disarium(num);
        obj.countDigit();
        obj.check();
    }
}