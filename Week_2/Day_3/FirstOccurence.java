public class FirstOccurence
{
	public int sum(String fh,String ch)
	{
		int n=ch.length();
		int x=fh.length();
		if(n>x)
		return -1;
		String h=fh.substring(0,n);
		if(ch.equals(h))
			return 0;
		for(int i=n;i<x;i++)
		{
			h=fh.substring(i-n,i);
			if(ch.equals(h))
				return i-n+1;
		}
		return -1;
	}
        public static void main(String[] args)
        {
        	FirstOccurence d=new FirstOccurence();
        	String sh="leetcode";
            String ch="leeto";
            int y=d.sum(sh, ch);
            System.out.println(y);
        }
    }