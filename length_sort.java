import java.util.*;
class length_sort
{
    String sentence;
    length_sort(String sentence)
    {
        this.sentence= sentence;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }

    String capitalize(String sent)
    {
        String firstletter= sent.substring(0,1);
        String remaining= sent.substring(1, sent.length());
        firstletter= firstletter.toUpperCase();
        return firstletter+remaining;
    }

    void display()
    {
        this.sentence=this.sentence.substring(0,this.sentence.length()-1);
        String store= sentence.substring(sentence.length()-1, sentence.length());
        String arr[]=sentence.split(" ");
        String temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j].length()>arr[j+1].length())
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String temp1= "";
        for(int i=0;i<arr.length;i++)
            temp1= arr[i]+ " ";
        temp1= capitalize(temp1);
        System.out.print(temp1);
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String sentence= sc.nextLine();
        System.out.println(sentence);
        length_sort obj= new length_sort(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.println("Invalid input");
            return;
        }        
        obj.display();
    }

}