class Number
{
    int n;
    public Number(int n)
    {
        this.n=n;
    }
    
    public int factorial(int a)
    {
        if(a==0)
        {
            return 1;
        }
        else
        {
            return (a*factorial(a-1));
        }
    }
    
    public void display()
    {
        System.out.print(n);
    }
}

class Series extends Number
{
    int sum;
    public Series(int n)
    {
        super(n);
        sum=0;
    }
    
    public void calsum()
    {
        for(int i=1;i<=n;i++)
        {
            sum+=factorial(i);
        }
    }
    
    public void display()
    {
        super.display();        
        System.out.println(sum);
    }
    
    public static void main()
    {
        Series obj= new Series(3);
        obj.display();
    }
}