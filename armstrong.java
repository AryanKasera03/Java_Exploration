import java.util.*;
class armstrong
{
    int number;
    public armstrong(int number)
    {
        this.number=number;
    }
    
    public int getcount()
    {
        int count=0;
        int temp;
        while(number>=1)
        {
            temp=number%10;
            count++;
            number=number/10;
        }
        return count;
    }
    
    public int digits()
    {
        int sum=0;
           int count=0;
        int temp;
        while(number>=1)
        {
            temp=number%10;
            sum+=Math.pow(temp,getcount());
            number=number/10;
        }
        return sum;
    }
    
    public static void main()
    {
        armstrong one=new armstrong(145);
        System.out.print(one.digits());
    }
}