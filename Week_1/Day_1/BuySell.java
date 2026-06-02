public class BuySell
{
    
      public int buse(int[] nums)
      {
           int min=nums[0],profit=0,max=0;
         
           for(int i=0;i<nums.length;i++)
           {
        	if(min>nums[i])
        	{
        		min=nums[i];
        		  max=min-nums[i];
        	}
        	profit=nums[i]-min;
        	if(profit>max)
        		max=profit;
           }
           return max;
        }
        public static void main(String[] args)
        {
            BuySell d=new BuySell();
            int[] nums={7,6,4,3,1};
             int y= d.buse(nums);
             System.out.println(y);
        }
    }