import java.util.*;
class Evil
{
    int num;
    Evil(int num)
    {
        this.num=num;
    }

    int binary(int n)
    {
        if(n==0)
            return 0;
        else
            return n%2 + 10*binary(n/2);
    }

    int count_one()
    {
        int count=0;
        int number= binary(this.num);
        while(number>0)
        {
            int temp= number%10;
            if(temp==1)
                count++;
            number/=10;
        }
        return count;
    }

    boolean isEvil(int n)
    {
        if(count_one()%2==0)
            return true;
        return false;
    }

    boolean check(int n)
    {
        if(n>2&&n<100)
            return true;
        return false;
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        Evil obj= new Evil(num);
        if(!obj.check(num))
        {
            System.out.println("Number out of range");
            return;
        }
        System.out.println(obj.binary(num));
        System.out.println(obj.count_one());
        if(obj.isEvil(num))
            System.out.println("Number is Evil");
        else
            System.out.println("Number is not evil");
    }
}