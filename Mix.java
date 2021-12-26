import java.util.*;
class Mix
{
    String one; String two;
    Mix(String one, String two)
    {
        this.one=one;
        this.two=two;
    }
    
    public Mix()
    {
        char first=' ';
        for(int i= 0;i<one.length();i++)
        {
            for(int j=0;j<two.length();j++)
            {
                first+=one.charAt(i);
            }
        }
    }
}