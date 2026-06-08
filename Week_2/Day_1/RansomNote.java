public class RansomNote
{
	public boolean ransom(String ch,String sh)
	{
		int[] freq=new int[26];
		for(int i=0;i<ch.length();i++)
		{
			freq[ch.charAt(i)-'a']++;
		}
		for(int i=0;i<sh.length();i++)
		{
			freq[sh.charAt(i)-'a']--;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]<0)
				return false;
		}
		return true;
	}
        public static void main(String[] args)
        {
        	RansomNote d=new RansomNote();
            String magazine="ab";
            String ransomm="aa";
            System.out.println(d.ransom(magazine,ransomm));
        }
    }