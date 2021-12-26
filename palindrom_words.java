import java.util.*;
class palindrom_words
{
    String sentence;
    palindrom_words(String sentence)
    {
        this.sentence= sentence;
    }

    boolean isPalin(String word)
    {
        String temp="";
        for(int i=word.length()-1;i>=0;i--)
        {
            temp+=word.charAt(i);
        }
        if(temp.equals(word))
            return true;
        return false;
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
        sentence= sentence.toUpperCase();
        String[] words= this.sentence.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(isPalin(words[i]))
            {
                System.out.print(words[i]+ " " );
                count++;
            }
        }
        
        if(count==0)
            System.out.print("NO PALINDROM WORDS");
        else
        {
            System.out.println();
            System.out.print("Number of palindrom words:" + count);
        }
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a new sentence: ");
        String sentence = sc.nextLine();
        palindrom_words obj= new palindrom_words(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.println("Invalid input");
            return;
        } 
        obj.display();
    }
}