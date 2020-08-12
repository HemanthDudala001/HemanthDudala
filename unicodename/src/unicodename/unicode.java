package unicodename;

public class unicode {

	public static void main(String[] args)
	{
      String s="";
      int ch[]= {9075,3086,3118,3112,3149,3108,3149};
      for(int i=0;i<ch.length;i++)
      {
    	  char c=(char)ch[i];
    	  s=s+c;
      }
      System.out.print(s);
	}

}
