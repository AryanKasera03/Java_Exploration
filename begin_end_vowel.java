import java.util.*;
class begin_end_vowel
{
    String sentence;
    begin_end_vowel(String sentence)
    {
        this.sentence=sentence;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }

    boolean isVowel(char ch)
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }

    boolean checkvowel(String word)
    {
        if(isVowel(word.charAt(0))&&isVowel(word.charAt(word.length()-1)))
            return true;
        return false;
    }

    void display()
    {
        this.sentence= this.sentence.substring(0, this.sentence.length()-1);
        sentence= sentence.toUpperCase();
        String words[]=sentence.split(" ");
        int count=0;
        String vowel="";
        String non_vowel="";
        for(int i=0;i<words.length;i++)
        {
            if(checkvowel(words[i]))
            {
                count++;
                vowel+=words[i]+ " ";
            }
            else
                non_vowel+=words[i]+ " ";
        }
        
        String temp= vowel+non_vowel;
        System.out.println("Number of words beginning and ending with vowel is: "+ count);
        System.out.println(temp);
    }
    
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence= sc.nextLine();
        begin_end_vowel obj= new begin_end_vowel(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.println("Invalid Input");
            return;            
        }
        
        obj.display();
    }
}