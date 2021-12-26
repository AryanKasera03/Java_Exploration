import java.util.*;
class vowels_consonants
{
    String sentence;
    vowels_consonants(String sentence)
    {
        this.sentence= sentence;
    }

    boolean isVowel(char ch)
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }

    boolean isConsonant(char ch)
    {
        if(!isVowel(ch))
            return true;
        return false;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?')
            return true;
        return false;
    }
    
    int countVowel(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            if(isVowel(word.charAt(i)))
                count++;
        }
        return count;
    }
    
    int countConsonant(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            if(!isVowel(word.charAt(i)))
                count++;
        }
        return count;
    }
    
    String isCapitalize()
    {
        String firstletter= this.sentence.substring(0,1);
        String remaining= sentence.substring(1, sentence.length());
        firstletter= firstletter.toUpperCase();
        return firstletter+remaining;
    }
    
    void display()
    {
        int vowel=0;
        int consonant=0;
        String[] words= this.sentence.split(" ");
        System.out.println();
        System.out.println("WORDS\t\tVOWELS\t\tCONSONANTS");
        words[words.length-1]= words[words.length-1].substring(0, words[words.length-1].length()-1);
        for(int i=0;i<words.length;i++)
        {
            System.out.printf("%-16s%-16d%-16d\n", words[i],countVowel(words[i]),countConsonant(words[i]));
        }
    }
    
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the sentence");
        String sentence= sc.nextLine();
        vowels_consonants obj= new vowels_consonants(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.print("Invalid Input");
            return;
        }
        obj.display();
    }
}