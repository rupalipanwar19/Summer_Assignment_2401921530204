public class ValidAnagram
{
	public boolean valid(String ch,String sh)
	{
		if(ch.length()!=sh.length())
			return false;
		int[] freq=new int[26];
		for(int i=0;i<ch.length();i++)
		{
			freq[ch.charAt(i)-'a']++;
			freq[sh.charAt(i)-'a']--;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=0)
				return false;
		}
		return true;
	}
        public static void main(String[] args)
        {
        	ValidAnagram d=new ValidAnagram();
            String ch="anagram";
            String sh="nagaram";
            System.out.println(d.valid(ch, sh));
        }
    }