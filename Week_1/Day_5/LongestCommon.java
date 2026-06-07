public class LongestCommon
{
	public String sum(String[] ch)
	{
		String sh=ch[0];
		int pref=sh.length();
		for(int i=1;i<ch.length;i++)
		{
			String dh=ch[i];
			pref=Math.min(pref, dh.length());
			for(int j=0;j<pref;j++)
			{
				if(sh.charAt(j)!=dh.charAt(j))
				{
				pref=j;
				break;
				}
			}
		}
		return sh.substring(0,pref);
	}
        public static void main(String[] args)
        {
        	LongestCommon d=new LongestCommon();
            String[] ch={"flower","flow","flex"};
            String g=d.sum(ch);
            System.out.println(g);
        }
    }
