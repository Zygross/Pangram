import java.util.Scanner ;
class Pangram
{
    String s;
    String d;
    Character c[]=new Character[26];
    public void input ()
    {
        Scanner br=new Scanner (System.in );
        System.out.println ("Enter a sentence");
        s=br.nextLine ();
        d=s;
        d=d.toUpperCase ();
    }
    public void  check ()
    {
      int len=d.length();
      int a[]=new int [26]; int u =0;
      for (char ch='A';ch<='Z';ch++)
      {
          for (int i=0;i<len;i++)
          {
              if (ch==d.charAt(i))
              {
                  u++;
              }
              if(ch=='A')
              {
              if (d.charAt(i)==' ')
              {
              u++;
              }
              }
        }
      }
       System.out.println (u+" "+len);
      if(u>=26 )
      {
          System.out.println ("This is Pangram sentence ");
      }
      else 
      System.out.println ("It is not an pangram sentence ");
      
    } 
    public void compare ()
    {
        String k="";String f="";String small="There is no small words ";
        int len=s.length();
        for (int i=0;i<len;i++)
        {
            if(s.charAt(i)!=' ')
            {
                k+=d.charAt(i);
                
            }
            else if (s.charAt(i)==' ')
            {
            if (k.length()>f.length())
            {
               f=k;
            }
           
            if (k.length()<small.length())
            
            {
                small=k;
            }
                 k="";       
            }
        }
        System.out.println ("The longest word is "+f);
        System.out .println ("The smallest word is "+small);
    }
    public static void main ()
    {
        Pangram ob=new Pangram();
        ob.input();
        ob.check();
        ob.compare();
    }
}