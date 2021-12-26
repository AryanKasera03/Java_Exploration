import java.util.*;
class ceaser_cipher
{
    String sentence;
    ceaser_cipher(String sentence)
    {
        this.sentence=sentence;
    }

    String display()
    {
        String words[]= this.sentence.split(" ");
        String cipher="";
        for(int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                {
                    if(ch > 'M')
                        cipher += (char)(ch - 13);
                    else
                        cipher += (char)(ch + 13);
                }
                else
                {
                    if(ch > 'm')
                        cipher += (char)(ch - 13);
                    else
                        cipher += (char)(ch + 13);
                }
            }
            else
                cipher += ch;
        }
        return cipher;
    }

    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence= sc.nextLine();
        ceaser_cipher obj= new ceaser_cipher(sentence);
        if(sentence.length()>100||sentence.length() < 3)
        {
            System.out.println("Invalid length");
            return;
        }
        System.out.print(obj.display());
    }
}