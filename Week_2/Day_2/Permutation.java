import java.util.Arrays;
public class Permutation
{
	public boolean sum(String fh,String ch)
	{
		int[] freq=new int[26];
		int[] freq2=new int[26];
		int n=fh.length();
		int x=ch.length();
		if(n>x)
			return false;
		for(int i=0;i<fh.length();i++)
		{
			freq[fh.charAt(i)-'a']++;
			freq2[ch.charAt(i)-'a']++;
		}
		if(Arrays.equals(freq,freq2))
			return true;
		for(int i=n;i<x;i++)
		{
			freq2[ch.charAt(i)-'a']++;
			freq2[ch.charAt(i-n)-'a']--;
		if(Arrays.equals(freq,freq2))
			return true;
		}
		return false;
	}
        public static void main(String[] args)
        {
        	Permutation d=new Permutation();
        	String sh="ab";
            String ch="eidboaoo";
            System.out.println(d.sum(sh,ch));
        }
    }