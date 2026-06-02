public class RemoveDuplicate
{
      public int duplicacy(int[] nums)
      {
            int j=0;
          for(int i=1;i<nums.length;i++)
          {
        	  if(nums[j]!=nums[i])
        	  {
        		  j++;
        		  nums[j]=nums[i];
        	  }
          }
          return j+1;
        }
        public static void main(String[] args)
        {
            RemoveDuplicate d=new RemoveDuplicate();
            int[] nums={1,1,2};
             int y= d.duplicacy(nums);
             System.out.println(y);
        }
    }
