import java.util.*;
class arrange
{
    String word;
    String newwrd;
    arrange()
    {
    }

    void readword()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the word: ");
        word=sc.nextLine();
        word=word.toUpperCase();
    }

    boolean isVowel(char ch)
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')       
            return true;        
        return false;
    }

    void freq_vow_con()
    {
        int vowel_count=0;
        int consonant_count=0;
        for(int i=0;i<word.length();i++)
        {
            if(isVowel(word.charAt(i)))
                vowel_count++;
            else
                consonant_count++;
        }
        System.out.println("No of vowels in the word is: "+ vowel_count);
        System.out.println("No of consonants in the word is: "+ consonant_count);
    }

    void arrange()
    {
        String temp="";
        String temp1= "";
        for(int i=0;i<word.length();i++)
        {
            if(isVowel(word.charAt(i)))
                temp+=word.charAt(i);
            else
                temp1+=word.charAt(i);
        }
        newwrd=temp + temp1;
    }

    void display()
    {
        readword();
        System.out.println(word);
        arrange();
        System.out.println(newwrd);
    }

    static void main()
    {
        arrange obj= new arrange();
        obj.display();
    }
}