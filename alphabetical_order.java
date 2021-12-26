import java.util.*;
class alphabetical_order
{
    String sentence;
    alphabetical_order(String sentence)
    {
        this.sentence=sentence;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }

    void display()
    {
        sentence= sentence.substring(0, sentence.length()-1);
        String words[]=sentence.split(" ");
        String temp="";
        for(int i=0;i<words.length;i++) 
        {
            for(int j=0;j<words.length-i-1;j++)
            {
                if(words[j].compareTo(words[j+1])>0)
                {
                    temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]= temp;
                }
            } 
        }     
        System.out.print("Length:" + words.length + "\n" + "Rearranged sentence\n");
        for(int i=0;i<words.length;i++)
            System.out.print(words[i]+ " ");
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the new sentence:");
        String sentence= sc.nextLine();
        alphabetical_order obj= new alphabetical_order(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.print("Invalid Sentence");
            return;
        }
        obj.display();
    }
}