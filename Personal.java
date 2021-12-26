import java.util.*;
class Personal
{
    String name; int pan; int basic_pay; int acc_no;
    Personal(String name, int pan, int basic_pay, int acc_no)
    {
        this.name=name;
        this.pan=pan;
        this.basic_pay=basic_pay;
        this.acc_no=acc_no;
    }

    public void display()
    {
        System.out.print(this.name+ ": "+ this.pan+": "+ this.acc_no+": "+ this.basic_pay);
    }
}

class Retired extends Personal
{
    int yrs;
    double Pf;
    double grat;
    Retired(int yrs, double Pf, double grat, String name, int pan, int acc_no, int basic_pay)
    {
        super(name, pan, acc_no, basic_pay);
        this.yrs=yrs;
        this.Pf=Pf;
        this.grat=grat;

    }

    void provident()
    {
        this.Pf=(0.2)*this.basic_pay;
    }

    void gratuity()
    {
        if(this.yrs<10)
        {
            this.grat=0;
        }
        else 
        {
            this.grat=this.basic_pay*12;
        }
    }

    public void display()
    {
        super.display();
        System.out.print(this.yrs+ ": " + this.Pf+": "+ this.grat);

    }
    
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        
        Retired obj= new Retired(this.yrs, this.Pf, this.grat, this.name, this.pan, this.acc_no, basic_pay);
    }
}

