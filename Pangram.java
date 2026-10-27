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
    }
    public void  check ()
    {
      int len=d.length();
      for (int i=0;i<len-1;i++)
      {
          char ch=d.charAt (i);
          char gh=d.charAt(i+1);
          int l=ch;
          int z=gh;
          c[i]=ch;
          c[i+1]=gh;
          if(l>z)
          {
              char t=ch;
              ch=gh;
              gh=t;
          }
      }
      
    } 
}