import java.util.*;
class perfect_number
{
    int num;
    public perfect_number(int nn)
    {
        num=nn;
    }
    
    public int sum_of_factors(int i)
    {
        if(i==num)
            return 0;
        else if(num%i==0)
            return i +  sum_of_factors(i+1);
        else
            return sum_of_factors(i+1);
    }
    
    public void check()
    {
        int s=sum_of_factors(1);
        if(s==num)
        {
            System.out.println(num + " is a perfect number");
        }
        else 
        {
            System.out.println(num+ " is not a perfect number");
        }
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        perfect_number obj= new perfect_number(n);
        obj.check();
    }
}