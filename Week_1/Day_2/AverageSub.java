public class AverageSub
{
    
      public double average(int[] nums,int k)
      {
    	  int sum=0,msum=0;
        for(int i=0;i<k;i++)
        {
        	sum+=nums[i];
        }
        for(int i=k;i<nums.length;i++)
        {
        	msum=sum+nums[i]-nums[i-k];
        	sum=Math.max(sum,msum);
        	
        }
        double z= sum/4.0;
        return z;
      }
        public static void main(String[] args)
        {
            AverageSub d=new AverageSub();
            int[] nums={1,12,-5,-6,50,3};
            int k=4;
             double y= d.average(nums,k);
             System.out.println(y);
        }
    }