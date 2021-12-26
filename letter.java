class letter
{
    String word;
    public letter(String word)
    {
        this.word=word;
    }
    
    public String getreverse()
    {
        String temp="";
        for(int i=word.length()-1;i>0;i--)
        {
            temp+=word.charAt(i);
        }
        return word+temp;
    }
    
    public static void main()
    {
        letter words=new letter("THE BIRD IS FLYINGs");
        System.out.print(words.getreverse());
    }
}