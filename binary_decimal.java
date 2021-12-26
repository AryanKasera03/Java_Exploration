import java.util.*;
class binary_decimal
{
    binary_decimal()
    {
    }
    
    int decimal_conversion(int n)
    {
        int temp=0;
        int decimal=0;
        int i=0;
        while(true)
        {
            if(n==0)
            {
                break;
            }
            else
            {
                temp=n%10;
                decimal+=temp*Math.pow(2,i);
                n=n/10;
                i++;
            }
        }
        return decimal;
    }
    
    int recursive_decimal_conversion(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return(n%10 + 2 * recursive_decimal_conversion(n/10));
        }
    }
    
    void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the binary number: ");        
        int n= sc.nextInt();
        System.out.println("The Decimal conversion is: "+decimal_conversion(n));
        System.out.println("The Decimal conversion is: "+recursive_decimal_conversion(n));
    }
      
    static void main()
    {
        binary_decimal obj= new binary_decimal();
        obj.display();
       
    }
}