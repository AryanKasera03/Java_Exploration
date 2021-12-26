import java.util.*;
class end_begin_vowel
{
    String sentence;
    end_begin_vowel()
    {
        this.sentence=sentence;
    }

    boolean isVowel(char ch)
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }

    boolean check_end_begin_vowel(String word)
    {
        if(isVowel(word.charAt(0))&&isVowel(word.charAt(word.length()-1)))
            return true;
        return false;
    }

    void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence :");
        sentence=sc.nextLine();
        String [] words= sentence.split(" ");
        String non_vowel="";
        String vowel="";
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(check_end_begin_vowel(words[i]))
            {           
                vowel+=words[i]+ " ";       
                count++;}
            if(!check_end_begin_vowel(words[i]))            
                non_vowel+=words[i]+ " ";            
        }        
        String permanant= vowel+non_vowel;
        System.out.println(permanant);
        System.out.println(count);
    }

    static void main()
    {
        end_begin_vowel obj= new end_begin_vowel();
        obj.display();
    }
}
 