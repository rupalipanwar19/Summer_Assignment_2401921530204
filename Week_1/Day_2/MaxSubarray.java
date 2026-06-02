public class MaxSubarray
{
    
      public int maximumsub(int[] nums)
      {
         int current=nums[0],maxi=nums[0];
         for(int i=1;i<nums.length;i++)
         {
        	 current=Math.max(nums[i],current+nums[i]);
        	 maxi=Math.max(maxi,current);
         }
         return maxi;
        }
        public static void main(String[] args)
        {
            MaxSubarray d=new MaxSubarray();
            int[] nums={5,4,-1,7,8};
             int y= d.maximumsub(nums);
             System.out.println(y);
        }
    }