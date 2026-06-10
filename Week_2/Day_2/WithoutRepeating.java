import java.util.HashSet;
public class WithoutRepeating
{
	public int sum(String ch)
	{
		int left=0;
		int max=0;
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<ch.length();i++)
		{
			char sh=ch.charAt(i);
			while(set.contains(sh))
			{
				set.remove(ch.charAt(left));
				left++;
			}
				set.add(sh);
				max=Math.max(max,i-left+1);
		}
		return max;
	}
        public static void main(String[] args)
        {
        	WithoutRepeating d=new WithoutRepeating();
            String ch="pwwkew";
            System.out.println(d.sum(ch));
        }
    }