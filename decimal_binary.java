import java.util.*;
class decimal_binary
{

    decimal_binary()
    {

    }

    int binary(int n)
    {
        if(n==0)        
            return 0;        
        else        
            return (n % 2 + 10 * binary(n / 2));         
    }

    void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the decimal number");
        int decimal= sc.nextInt();
        System.out.println("The binary number of the decimal is: "+ binary(decimal) );
    }

    static void main()
    {
        decimal_binary obj= new decimal_binary();
        obj.display();
    }
}