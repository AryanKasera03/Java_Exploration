import java.util.*;
class arrange_by_length
{
    String sentence; 
    arrange_by_length(String sentence)
    {
        this.sentence= sentence;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }

    void display()
    {
        this.sentence= this.sentence.substring(0, this.sentence.length()-1);
        String [] arr= this.sentence.split(" ");
        int [] len= new int [arr.length];
        for(int i=0;i<arr.length;i++)
            len[i]=arr[i].length();
        String temp=""; String temp1="";
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(len[i]>len[j])
                {
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }

            }
        }

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence= sc.nextLine();
        arrange_by_length obj= new arrange_by_length(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.println("Invalid input");
            return;
        }        
        System.out.println(sentence);
        obj.display();
    }
}