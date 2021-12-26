import java.util.*;
class Capital
{
    String sent;
    int freq;
    Capital()
    {
        this.sent=sent;
        freq=0;
    }

    void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        sent=sc.nextLine();        
    }

    boolean isCap(String w)
    {
        for(int i=0;i<w.length();i++)
        {
            if(w.charAt(0)==w.toUpperCase().charAt(0))
            {
                return true;
            }
        }
        return false;
    }

    void display()
    {
        String words[] = sent.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(isCap(words[i]))
            {
                freq++;
            }
        }
        System.out.println(sent);
        System.out.println(freq);
    }
    
    static void main()
    {
        Capital obj= new Capital();
        obj.accept();
        obj.display();
    }
}