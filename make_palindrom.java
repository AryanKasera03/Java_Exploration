import java.util.*;
class make_palindrom
{
    String sentence;
    make_palindrom(String sentence)
    {
        this.sentence= sentence;
    }

    boolean check(char ch)
    {
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }

    boolean isPalindrom(String word)
    {
        String reverse="";
        for(int i=word.length()-1;i>=0;i--)
        {
            reverse+= word.charAt(i);
        }
        if(reverse.equals(word))
            return true;
        return false;
    }
    
    String invert(String word)
    {
        String reverse= "";
        for(int i=word.length()-2;i>=0;i--)
        {
            reverse+=word.charAt(i);
        }
        String inverted= word+reverse;
        return inverted;
    }
    
    void display()
    {
        sentence= this.sentence.substring(0,sentence.length()-1);
        String arr[]= sentence.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(!isPalindrom(arr[i]))
            {
                arr[i]= invert(arr[i]);
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence= sc.nextLine();
        sentence= sentence.toUpperCase();
        make_palindrom obj= new make_palindrom(sentence);
        if(!obj.check(sentence.charAt(sentence.length()-1)))
        {
            System.out.println("Invalid input");
            return;
        }
        obj.display();
    }
}