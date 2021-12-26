import java.util.*;
class Potential
{
    String sentence;
    Potential(String sentence)
    {
        this.sentence= sentence;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }
    
    int potential(String w)
    {
        int p=0;
        for(int i=0;i<w.length();i++)
        {
            p+=w.charAt(i);
        }
        return p;
    }
    
    void display()
    {
        this.sentence= this.sentence.substring(0, sentence.length()-1);
        String words[]= this.sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+ "\t" + potential(words[i]));
        }
        String temp="";
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length-i-1;j++)
            {
                if(potential(words[j])<potential(words[j+1]))
                {
                    temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<words.length;i++)
        {
            System.out.print(words[i]+ " ");
        }
    }
    
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence= sc.nextLine();
        Potential obj= new Potential(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.print("Invalid input");
            return;
        }
        
        obj.display();
    }
}