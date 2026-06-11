import java.util.*;
public class AnagramIndex
{
	public List<Integer> sum(String fh,String ch)
	{
		int[] freq=new int[26];
		int[] freq2=new int[26];
		int n=fh.length();
		int x=ch.length();
		ArrayList<Integer> list=new ArrayList<>(); 
		if(n>x)
		return list;
		int j=0;
		for(int i=0;i<fh.length();i++)
		{
			freq[fh.charAt(i)-'a']++;
			freq2[ch.charAt(i)-'a']++;
		}
		if(Arrays.equals(freq,freq2))
			list.add(0);
		for(int i=n;i<x;i++)
		{
			freq2[ch.charAt(i)-'a']++;
			freq2[ch.charAt(i-n)-'a']--;
		if(Arrays.equals(freq,freq2))
			list.add(i-n+1);
		}
		return list;
	}
        public static void main(String[] args)
        {
        	AnagramIndex d=new AnagramIndex();
        	String sh="abc";
            String ch="cbaebabacd";
            List<Integer> y=d.sum(sh, ch);
            System.out.println(y);
        }
    }