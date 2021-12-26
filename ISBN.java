import java.util.*;
class ISBN
{
    int code;
    ISBN(int code)
    {
        this.code=code;
    }

    //int digits()
    //{
    // int count=0;
    // while(code>0)
    // {
    //   count++;
    //    code/=10;
    // }
    // return count;
    //}

    int sum(int num)
    {
        int natural_numbers=1;
        if(num==0)
        {
            return 0;
        }
        else
            return (natural_numbers*(num%10)+ (natural_numbers+1)*sum(num/10));
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int code=sc.nextInt();
        ISBN obj= new ISBN(code);

        System.out.print(obj.sum(code));

    }
}