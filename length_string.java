import java.util.*;
class length_string
{
    String sentence;
    length_string()
    {
    }

    void display()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        sentence=sc.nextLine();
        String words[]= sentence.split(" ");
        String temp="";
        char last = sentence.charAt(sentence.length()-1);
        for(int i=0;i<words.length;i++)
        {
            for(int j=i;j<words.length;j++)
            {
                if(words[i].length()>words[j].length())
                {
                    temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
                if(words[i].length()==words[j].length())
                {
                    if (words[i].compareTo(words[j])>0) 
                    {
                        temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }

        for(int i=0;i<words.length;i++)
        {
            System.out.print(words[i]+ " ");
        }
    }
    
    void showsplit()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        sentence=sc.nextLine();
        String words[]= sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }

    static void main()
    {
        length_string obj= new length_string();
        obj.display();
    }
}