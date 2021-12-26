import java.util.*;
class numbers_sumation
{
    int M;
    int n;
    numbers_sumation(int M, int n)
    {
        this.M=M;
        this.n=n;
    }

    int sumation(int number)
    {
        if(number==0)
            return 0;        
        else
            return (number%10 + sumation(number/10));
    }

    int count_numbers(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }

    int numbers()
    {
        int i=M; int j=0;
        while(sumation(i)!=n)
        {
            i++;
            if(sumation(i)==n)
                j=i;           
        }
        return j;
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("M= ");
        int M= sc.nextInt();
        System.out.print("n= ");
        int n= sc.nextInt();
        numbers_sumation obj= new numbers_sumation(M,n);
        if(obj.count_numbers(M)==obj.count_numbers(n))
            System.out.print("Invalid");
        else 
        {
            System.out.println("Total required number is: "+ obj.numbers());
            System.out.println("Total number of digits is: "+ obj.count_numbers(obj.numbers()));
        }
    }
}