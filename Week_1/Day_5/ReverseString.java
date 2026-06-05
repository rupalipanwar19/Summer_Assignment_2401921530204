import java.util.Arrays;
public class ReverseString
{
	public void reverse(char[] ch)
	{
		int s=0;
		int e=ch.length-1;
		while(s<e)
		{
			char temp=ch[s];
		    ch[s]=ch[e];
		    ch[e]=temp;
		    s++;
		    e--;
		}
	}
        public static void main(String[] args)
        {
        	ReverseString d=new ReverseString();
            char[] ch={'h','e','l','l','o'};
            d.reverse(ch);
            System.out.println(Arrays.toString(ch));
        }
    }