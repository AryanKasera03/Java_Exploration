import java.util.*;
class order_by_size
{
    String sentence;
    order_by_size()
    {
    }

    int word_count()
    {
        return sentence.length();
    }

    String capitalize(String sent)
    {
        String firstletter= sent.substring(0,1);
        String remaining= sent.substring(1, sent.length());
        firstletter= firstletter.toUpperCase();
        return firstletter+remaining;
    }

    boolean checkTermination()
    {
        char lastchar=sentence.charAt(sentence.length()-1);
        if(lastchar!='.'||lastchar!='?'||lastchar!='!')
        {
            return false;
        }
        return true;
    }

    void display()
    {
        Scanner sc=new Scanner(System.in);
        sentence=sc.nextLine();
        int len = sentence.length();
        char last = sentence.charAt(len - 1);
        sentence=sentence.substring(0, sentence.length()-1);
        String words[]=sentence.split(" ");
        String temp="";
        String sent=capitalize(sentence);
        System.out.println(sent);
        for(int i=0;i<words.length;i++)
        {
            for(int j=i;j<words.length;j++)
            {
                if(words[i].length()>words[j].length())
                {
                    temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }

        String temp1="";
        for(int i=0;i<words.length-1;i++)
        {
            temp1+=words[i]+ " ";
        }
        temp1= capitalize(temp1)+ words[words.length-1]+last;
        System.out.print(temp1);
    }

    static void main()
    {
        order_by_size obj= new order_by_size();
        obj.display();
    }
}