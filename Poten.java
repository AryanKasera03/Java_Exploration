import java.util.*;
class Poten
{
    String sentence;
    Poten(String sentence)
    {
        this.sentence= sentence;
    }

    int potential(String word)
    {
        int p=0;
        for(int i=0;i<word.length();i++)
        {
            p+=word.charAt(i);
        }
        return p;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!'||ch==',')
            return true;
        return false;
    }
    
    void display()
    {
        this.sentence= this.sentence.substring(0, this.sentence.length()-1);
        String [] words= sentence.split(" ");
        String temp="";
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+ "=" + "\t" + potential(words[i]));
        }
        
        for(int i=0; i<words.length;i++)
        {
            for(int j=i;j<words.length;j++)
            {
                if(potential(words[i])>potential(words[j]))
                {
                    temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        
        for(int i=0;i<words.length;i++)
            System.out.print(words[i]+ " ");
    }
    
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence= sc.nextLine();
        Poten obj= new Poten(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.println("Invalid input");
            return;
        }
        
        obj.display();
    }
}
     