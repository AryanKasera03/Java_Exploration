import java.util.*;
class twoDarrays
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[][],m,n,i,j;
        System.out.print("Enter number of rows: ");
        m=sc.nextInt();
        System.out.print("Enter number of columns: ");
        n=sc.nextInt();
        arr=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the value in row number " + (i+1)+ "and column number " + (j+1) );
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Now printing the matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("\t"+ arr[i][j]);
            }
            System.out.println();
        }
    }
}