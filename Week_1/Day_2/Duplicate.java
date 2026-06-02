import java.util.HashSet;
public class Duplicate
{
    
      public boolean duplicacy(int[] nums)
      {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
        	if(set.contains(nums[i]))
        	return true;
        	set.add(nums[i]);
        }
        return false;
        }
        public static void main(String[] args)
        {
            Duplicate d=new Duplicate();
            int[] nums={1,2,3,4};
             boolean y= d.duplicacy(nums);
             System.out.println(y);
        }
    }