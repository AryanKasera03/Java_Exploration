import java.util.*;
class inverted_words
{
    String sentence;
    inverted_words(String sentence)
    {
        this.sentence=sentence;
    }

    String palindrom_words()
    {
        String temp="";
        if(sentence.charAt(sentence.length()-1)!=sentence.charAt(sentence.length()-2))
        {
            for(int i=sentence.length()-2;i>=0;i--)
            {
                temp+=sentence.charAt(i);
            }
        }
        else if(sentence.charAt(sentence.length()-1)==sentence.charAt(sentence.length()-2))
        {
            for(int i=sentence.length()-3;i>=0;i--)
            {
                temp+=sentence.charAt(i);
            }
        }
        temp= sentence+temp;
        return temp;
    }

    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String sentence= sc.nextLine();
        String[]words= sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            inverted_words obj = new inverted_words(words[i]);
            System.out.print(obj.palindrom_words() + " ");        
        }
    }
}