public class UniqueCharacter
{
	public int unique(String ch)
	{
		int[] freq=new int[26];
		for(int i=0;i<ch.length();i++)
		{
			freq[ch.charAt(i)-'a']++;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[ch.charAt(i)-'a']==1)
				return i;
		}
		return -1;
	}
        public static void main(String[] args)
        {
        	UniqueCharacter d=new UniqueCharacter();
            String ch="loveleetcode";
            System.out.println(d.unique(ch));
        }
    }