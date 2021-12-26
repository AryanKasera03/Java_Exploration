import java.util.*;
class palindrome
{
    String sentence;
    palindrome(String sentence)
    {
        this.sentence=sentence;
    }

    boolean isPalin(String word)
    {
        int len=word.length();
        word=word.toUpperCase();
        String temp="";
        for(int i=len-1;i>=0;i--)
        {
            temp=temp+word.charAt(i);
        }

        if(temp.equals(word))
        {
            return true;
        }
        return false;
    }

    void palin()
    {
        sentence=sentence.replace('.',' ');
        sentence=sentence.replace('?',' ');
        sentence=sentence.replace('!',' ');
        sentence=sentence.replace(',',' ');
        sentence=sentence.toUpperCase();
        String words[]=sentence.split(" ");
        int count=0;
        System.out.println("The sentence is : " + sentence);
        for(int i=0;i<words.length;i++)
        {
            if(isPalin(words[i]))
            {
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Number of palindromic words : "+ count);
        if(count==0)
        {
            System.out.println("NO PALINDROMIC WORDS");
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING IN UPPERCASE");
        String sentence=sc.nextLine();
        palindrome obj=new palindrome(sentence);
        obj.palin();
    }
}
