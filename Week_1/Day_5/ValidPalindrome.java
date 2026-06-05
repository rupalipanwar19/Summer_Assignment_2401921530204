public class ValidPalindrome
{
	public boolean valid(String s)
	{
		int x=0;
		int y=s.length()-1;
		while(x<y)
		{
			while(x<y&& !Character.isLetterOrDigit(s.charAt(x)))
				x++;
			while(x<y&& !Character.isLetterOrDigit(s.charAt(y)))
				y--;
		   if(Character.toLowerCase(s.charAt(x))!=Character.toLowerCase(s.charAt(y)))
			   return false;
		   x++;
		   y--;
		}
		
		return true;
	}
         public static void main(String[] args)
        {
        	ValidPalindrome d=new ValidPalindrome();
           String s="A man, a plan, a canal: Panama";
           System.out.println(d.valid(s));
        }
    }
