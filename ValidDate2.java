import java.util.*;
class ValidDate2
{
    public static void main(String arg[])
    {
        int a[ ]={31,28,31,30,31,30,31,31,30,31,30,31};
        String day[ ]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String rd="";
        int d, m, y, n, i, x, z;
        Scanner br =new Scanner(System.in);
        System.out.println("Enter day number between 1 to 366 : ");
        d=br.nextInt( );
        System.out.println("Enter year : ");
        y=br.nextInt( );
        System.out.println("Enter value for date after n number of days - between 1 to 100");
        n=br.nextInt();
        if(y%4==0) 
        {
            a[1]=29;
        }
        
        if(d>366 || n>100)
            System.out.println("INVALID INPUT");
        else 
        {
            x=d+n;
            m=0;
            while(d>a[m])
            {
                d=d-a[m++];
            }
            if(d==1 || d==21 || d==31) 
                rd="st";
            else if(d==2 || d==22) 
                rd="nd";
            else if(d==3 || d==23)  
                rd="rd";
            else 
                rd="th";
            System.out.println(d + rd + " " + day[m+1] + ", " + y);
            i=0;
            if(y%4==0 && x>366)  
            {
                x=x-366;
                y=y+1;
            }
            if(y%4!=0 && x>365) 
            {
                x=x-365;
                y=y+1;
            }
            if(y%4==0) 
                a[1]=29;
            else
                a[1]=28;
            while(x>a[i])
            {
                x=x-a[i++];
            }

            if(x==1 || x==21 || x==31)
                rd="st";
            else if(x==2 || x==22) 
                rd="nd";
            else if(x==3 || x==23)  
                rd="rd";
            else 
                rd="th";
            System.out.println("Date after " + n + " days is : " + x + rd + " " + day[i+1] + ", " + y);

        }
    } 
}